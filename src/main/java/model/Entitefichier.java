package model;

import java.sql.Timestamp;

public class Entitefichier {
    private Integer identite;
    private String domaine;
    private String nomfichier;
    private String chemin;
    private Long numversion;
    private String commentairetechnique;
    private String commentairefonctionnel;
    private String numhpqc;
    private String lastupdateidrh;
    private String useridrh;
    private Timestamp datecreation;
    private Timestamp datemodif;
    private String report;
    private String aconf;

    public Integer getIdentite() {
        return identite;
    }

    public void setIdentite(Integer identite) {
        this.identite = identite;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getNomfichier() {
        return nomfichier;
    }

    public void setNomfichier(String nomfichier) {
        this.nomfichier = nomfichier;
    }

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public Long getNumversion() {
        return numversion;
    }

    public void setNumversion(Long numversion) {
        this.numversion = numversion;
    }

    public String getCommentairetechnique() {
        return commentairetechnique;
    }

    public void setCommentairetechnique(String commentairetechnique) {
        this.commentairetechnique = commentairetechnique;
    }

    public String getCommentairefonctionnel() {
        return commentairefonctionnel;
    }

    public void setCommentairefonctionnel(String commentairefonctionnel) {
        this.commentairefonctionnel = commentairefonctionnel;
    }

    public String getNumhpqc() {
        return numhpqc;
    }

    public void setNumhpqc(String numhpqc) {
        this.numhpqc = numhpqc;
    }

    public String getLastupdateidrh() {
        return lastupdateidrh;
    }

    public void setLastupdateidrh(String lastupdateidrh) {
        this.lastupdateidrh = lastupdateidrh;
    }

    public String getUseridrh() {
        return useridrh;
    }

    public void setUseridrh(String useridrh) {
        this.useridrh = useridrh;
    }

    public Timestamp getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Timestamp datecreation) {
        this.datecreation = datecreation;
    }

    public Timestamp getDatemodif() {
        return datemodif;
    }

    public void setDatemodif(Timestamp datemodif) {
        this.datemodif = datemodif;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getAconf() {
        return aconf;
    }

    public void setAconf(String aconf) {
        this.aconf = aconf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entitefichier that = (Entitefichier) o;

        if (identite != null ? !identite.equals(that.identite) : that.identite != null) return false;
        if (domaine != null ? !domaine.equals(that.domaine) : that.domaine != null) return false;
        if (nomfichier != null ? !nomfichier.equals(that.nomfichier) : that.nomfichier != null) return false;
        if (chemin != null ? !chemin.equals(that.chemin) : that.chemin != null) return false;
        if (numversion != null ? !numversion.equals(that.numversion) : that.numversion != null) return false;
        if (commentairetechnique != null ? !commentairetechnique.equals(that.commentairetechnique) : that.commentairetechnique != null)
            return false;
        if (commentairefonctionnel != null ? !commentairefonctionnel.equals(that.commentairefonctionnel) : that.commentairefonctionnel != null)
            return false;
        if (numhpqc != null ? !numhpqc.equals(that.numhpqc) : that.numhpqc != null) return false;
        if (lastupdateidrh != null ? !lastupdateidrh.equals(that.lastupdateidrh) : that.lastupdateidrh != null)
            return false;
        if (useridrh != null ? !useridrh.equals(that.useridrh) : that.useridrh != null) return false;
        if (datecreation != null ? !datecreation.equals(that.datecreation) : that.datecreation != null) return false;
        if (datemodif != null ? !datemodif.equals(that.datemodif) : that.datemodif != null) return false;
        if (report != null ? !report.equals(that.report) : that.report != null) return false;
        if (aconf != null ? !aconf.equals(that.aconf) : that.aconf != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = identite != null ? identite.hashCode() : 0;
        result = 31 * result + (domaine != null ? domaine.hashCode() : 0);
        result = 31 * result + (nomfichier != null ? nomfichier.hashCode() : 0);
        result = 31 * result + (chemin != null ? chemin.hashCode() : 0);
        result = 31 * result + (numversion != null ? numversion.hashCode() : 0);
        result = 31 * result + (commentairetechnique != null ? commentairetechnique.hashCode() : 0);
        result = 31 * result + (commentairefonctionnel != null ? commentairefonctionnel.hashCode() : 0);
        result = 31 * result + (numhpqc != null ? numhpqc.hashCode() : 0);
        result = 31 * result + (lastupdateidrh != null ? lastupdateidrh.hashCode() : 0);
        result = 31 * result + (useridrh != null ? useridrh.hashCode() : 0);
        result = 31 * result + (datecreation != null ? datecreation.hashCode() : 0);
        result = 31 * result + (datemodif != null ? datemodif.hashCode() : 0);
        result = 31 * result + (report != null ? report.hashCode() : 0);
        result = 31 * result + (aconf != null ? aconf.hashCode() : 0);
        return result;
    }
}
