package model;

public class Utilisateur {
    @Override
    public String toString() {
        return "Utilisateur{" +
                "identifiant='" + identifiant + '\'' +
                ", motdepasse='" + motdepasse + '\'' +
                ", nomuser='" + nomuser + '\'' +
                ", prenomuser='" + prenomuser + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    private String identifiant;
    private String motdepasse;
    private String nomuser;
    private String prenomuser;
    private String role;

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public String getNomuser() {
        return nomuser;
    }

    public void setNomuser(String nomuser) {
        this.nomuser = nomuser;
    }

    public String getPrenomuser() {
        return prenomuser;
    }

    public void setPrenomuser(String prenomuser) {
        this.prenomuser = prenomuser;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Utilisateur that = (Utilisateur) o;

        if (identifiant != null ? !identifiant.equals(that.identifiant) : that.identifiant != null) return false;
        if (motdepasse != null ? !motdepasse.equals(that.motdepasse) : that.motdepasse != null) return false;
        if (nomuser != null ? !nomuser.equals(that.nomuser) : that.nomuser != null) return false;
        if (prenomuser != null ? !prenomuser.equals(that.prenomuser) : that.prenomuser != null) return false;
        return role != null ? role.equals(that.role) : that.role == null;
    }

    @Override
    public int hashCode() {
        int result = identifiant != null ? identifiant.hashCode() : 0;
        result = 31 * result + (motdepasse != null ? motdepasse.hashCode() : 0);
        result = 31 * result + (nomuser != null ? nomuser.hashCode() : 0);
        result = 31 * result + (prenomuser != null ? prenomuser.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }
}
