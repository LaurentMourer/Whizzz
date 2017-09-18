package model;

import java.sql.Timestamp;

public class Entitesql extends Entite {
    private Integer identite;
    private String domaine;
    private String typesql;
    private String nomprocess;
    private String ordresql;
    private String ordresqlvidage;
    private String commentairetechnique;
    private String commentairefonctionnel;
    private String numhpqc;
    private String useridrh;
    private String lastupdateidrh;
    private Timestamp datecreation;
    private Timestamp datemodif;
    private String report;
    private Bonlivraison bonlivraison;

    public Bonlivraison getBonlivraison() {
        return bonlivraison;
    }

    public void setBonlivraison(Bonlivraison bonlivraison) {
        this.bonlivraison = bonlivraison;
    }

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

    public String getTypesql() {
        return typesql;
    }

    public void setTypesql(String typesql) {
        this.typesql = typesql;
    }

    public String getNomprocess() {
        return nomprocess;
    }

    public void setNomprocess(String nomprocess) {
        this.nomprocess = nomprocess;
    }

    public String getOrdresql() {
        return ordresql;
    }

    public void setOrdresql(String ordresql) {
        this.ordresql = ordresql;
    }

    public String getOrdresqlvidage() {
        return ordresqlvidage;
    }

    public void setOrdresqlvidage(String ordresqlvidage) {
        this.ordresqlvidage = ordresqlvidage;
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

    public String getUseridrh() {
        return useridrh;
    }

    public void setUseridrh(String useridrh) {
        this.useridrh = useridrh;
    }

    public String getLastupdateidrh() {
        return lastupdateidrh;
    }

    public void setLastupdateidrh(String lastupdateidrh) {
        this.lastupdateidrh = lastupdateidrh;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entitesql entitesql = (Entitesql) o;

        if (identite != null ? !identite.equals(entitesql.identite) : entitesql.identite != null) return false;
        if (domaine != null ? !domaine.equals(entitesql.domaine) : entitesql.domaine != null) return false;
        if (typesql != null ? !typesql.equals(entitesql.typesql) : entitesql.typesql != null) return false;
        if (nomprocess != null ? !nomprocess.equals(entitesql.nomprocess) : entitesql.nomprocess != null) return false;
        if (ordresql != null ? !ordresql.equals(entitesql.ordresql) : entitesql.ordresql != null) return false;
        if (ordresqlvidage != null ? !ordresqlvidage.equals(entitesql.ordresqlvidage) : entitesql.ordresqlvidage != null)
            return false;
        if (commentairetechnique != null ? !commentairetechnique.equals(entitesql.commentairetechnique) : entitesql.commentairetechnique != null)
            return false;
        if (commentairefonctionnel != null ? !commentairefonctionnel.equals(entitesql.commentairefonctionnel) : entitesql.commentairefonctionnel != null)
            return false;
        if (numhpqc != null ? !numhpqc.equals(entitesql.numhpqc) : entitesql.numhpqc != null) return false;
        if (useridrh != null ? !useridrh.equals(entitesql.useridrh) : entitesql.useridrh != null) return false;
        if (lastupdateidrh != null ? !lastupdateidrh.equals(entitesql.lastupdateidrh) : entitesql.lastupdateidrh != null)
            return false;
        if (datecreation != null ? !datecreation.equals(entitesql.datecreation) : entitesql.datecreation != null)
            return false;
        if (datemodif != null ? !datemodif.equals(entitesql.datemodif) : entitesql.datemodif != null) return false;
        if (report != null ? !report.equals(entitesql.report) : entitesql.report != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = identite != null ? identite.hashCode() : 0;
        result = 31 * result + (domaine != null ? domaine.hashCode() : 0);
        result = 31 * result + (typesql != null ? typesql.hashCode() : 0);
        result = 31 * result + (nomprocess != null ? nomprocess.hashCode() : 0);
        result = 31 * result + (ordresql != null ? ordresql.hashCode() : 0);
        result = 31 * result + (ordresqlvidage != null ? ordresqlvidage.hashCode() : 0);
        result = 31 * result + (commentairetechnique != null ? commentairetechnique.hashCode() : 0);
        result = 31 * result + (commentairefonctionnel != null ? commentairefonctionnel.hashCode() : 0);
        result = 31 * result + (numhpqc != null ? numhpqc.hashCode() : 0);
        result = 31 * result + (useridrh != null ? useridrh.hashCode() : 0);
        result = 31 * result + (lastupdateidrh != null ? lastupdateidrh.hashCode() : 0);
        result = 31 * result + (datecreation != null ? datecreation.hashCode() : 0);
        result = 31 * result + (datemodif != null ? datemodif.hashCode() : 0);
        result = 31 * result + (report != null ? report.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Entitesql{" +
                "identite=" + identite +
                ", domaine='" + domaine + '\'' +
                ", typesql='" + typesql + '\'' +
                ", nomprocess='" + nomprocess + '\'' +
                ", ordresql='" + ordresql + '\'' +
                ", ordresqlvidage='" + ordresqlvidage + '\'' +
                ", commentairetechnique='" + commentairetechnique + '\'' +
                ", commentairefonctionnel='" + commentairefonctionnel + '\'' +
                ", numhpqc='" + numhpqc + '\'' +
                ", useridrh='" + useridrh + '\'' +
                ", lastupdateidrh='" + lastupdateidrh + '\'' +
                ", datecreation=" + datecreation +
                ", datemodif=" + datemodif +
                ", report='" + report + '\'' +
                '}';
    }
}
