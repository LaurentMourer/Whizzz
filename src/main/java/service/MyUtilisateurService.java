package service;

import controller.ErrorController;
import dao.UtilisateurDao;
import model.Utilisateur;
import org.apache.log4j.Logger;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyUtilisateurService implements UserDetailsService {

    private UtilisateurDao utilisateurDao;
    private static final Logger logger = Logger.getLogger(ErrorController.class);


    @Override
    public UserDetails loadUserByUsername(final String username)
            throws UsernameNotFoundException {
        Utilisateur user = utilisateurDao.getByKey(username);

        Set<String> userRoles = new HashSet<>();
        userRoles.add("Administrateur");
        //userRoles.add("Developpeur");
        //userRoles.add("Developpeur-Chef");
        List<GrantedAuthority> authorities = buildUserAuthority(userRoles);
        logger.info("Utilisateur" + user.getIdentifiant());
        return buildUserForAuthentication(user, authorities);


    }

    // Converts com.mkyong.users.model.User user to
    // org.springframework.security.core.userdetails.User
    private User buildUserForAuthentication(Utilisateur user,
                                            List<GrantedAuthority> authorities) {
        return new User(user.getIdentifiant(),
                user.getMotdepasse(), true,
                true, true, true, authorities);
    }

    private List<GrantedAuthority> buildUserAuthority(Set<String> userRoles) {

        Set<GrantedAuthority> setAuths = new HashSet<>();

        // Build user's authorities
        for (String userRole : userRoles) {
            setAuths.add(new SimpleGrantedAuthority("ROLE_" + userRole));
        }

        return new ArrayList<GrantedAuthority>(setAuths);
    }

    public UtilisateurDao getUtilisateurDao() {
        return utilisateurDao;
    }

    public void setUtilisateurDao(UtilisateurDao utilisateurDao) {
        this.utilisateurDao = utilisateurDao;
    }
}
