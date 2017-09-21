package model;

import java.sql.Timestamp;

public class Entiteaction {
    private Integer identite;
    private String typeaction;
    private String codeentiteac;
    private String codeentitemere;
    private String typeentitemere;
    private String nomprocess;
    private String radicalprocess;
    private String temoinforcage;
    private String programme;
    private String commentaire;
    private Timestamp datecreation;
    private String auteur;
    private Timestamp datemodif;
    private String auteurmodif;
    private Entitedesign entitedesign;

    public Entitedesign getEntitedesign() {
        return entitedesign;
    }

    public void setEntitedesign(Entitedesign entitedesign) {
        this.entitedesign = entitedesign;
    }

    public Integer getIdentite() {
        return identite;
    }

    public void setIdentite(Integer identite) {
        this.identite = identite;
    }

    public String getTypeaction() {
        return typeaction;
    }

    public void setTypeaction(String typeaction) {
        this.typeaction = typeaction;
    }

    public String getCodeentiteac() {
        return codeentiteac;
    }

    public void setCodeentiteac(String codeentiteac) {
        this.codeentiteac = codeentiteac;
    }

    public String getCodeentitemere() {
        return codeentitemere;
    }

    public void setCodeentitemere(String codeentitemere) {
        this.codeentitemere = codeentitemere;
    }

    public String getTypeentitemere() {
        return typeentitemere;
    }

    public void setTypeentitemere(String typeentitemere) {
        this.typeentitemere = typeentitemere;
    }

    public String getNomprocess() {
        return nomprocess;
    }

    public void setNomprocess(String nomprocess) {
        this.nomprocess = nomprocess;
    }

    public String getRadicalprocess() {
        return radicalprocess;
    }

    public void setRadicalprocess(String radicalprocess) {
        this.radicalprocess = radicalprocess;
    }

    public String getTemoinforcage() {
        return temoinforcage;
    }

    public void setTemoinforcage(String temoinforcage) {
        this.temoinforcage = temoinforcage;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Timestamp getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Timestamp datecreation) {
        this.datecreation = datecreation;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Timestamp getDatemodif() {
        return datemodif;
    }

    public void setDatemodif(Timestamp datemodif) {
        this.datemodif = datemodif;
    }

    public String getAuteurmodif() {
        return auteurmodif;
    }

    public void setAuteurmodif(String auteurmodif) {
        this.auteurmodif = auteurmodif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entiteaction that = (Entiteaction) o;

        if (identite != null ? !identite.equals(that.identite) : that.identite != null) return false;
        if (typeaction != null ? !typeaction.equals(that.typeaction) : that.typeaction != null) return false;
        if (codeentiteac != null ? !codeentiteac.equals(that.codeentiteac) : that.codeentiteac != null) return false;
        if (codeentitemere != null ? !codeentitemere.equals(that.codeentitemere) : that.codeentitemere != null)
            return false;
        if (typeentitemere != null ? !typeentitemere.equals(that.typeentitemere) : that.typeentitemere != null)
            return false;
        if (nomprocess != null ? !nomprocess.equals(that.nomprocess) : that.nomprocess != null) return false;
        if (radicalprocess != null ? !radicalprocess.equals(that.radicalprocess) : that.radicalprocess != null)
            return false;
        if (temoinforcage != null ? !temoinforcage.equals(that.temoinforcage) : that.temoinforcage != null)
            return false;
        if (programme != null ? !programme.equals(that.programme) : that.programme != null) return false;
        if (commentaire != null ? !commentaire.equals(that.commentaire) : that.commentaire != null) return false;
        if (datecreation != null ? !datecreation.equals(that.datecreation) : that.datecreation != null) return false;
        if (auteur != null ? !auteur.equals(that.auteur) : that.auteur != null) return false;
        if (datemodif != null ? !datemodif.equals(that.datemodif) : that.datemodif != null) return false;
        if (auteurmodif != null ? !auteurmodif.equals(that.auteurmodif) : that.auteurmodif != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = identite != null ? identite.hashCode() : 0;
        result = 31 * result + (typeaction != null ? typeaction.hashCode() : 0);
        result = 31 * result + (codeentiteac != null ? codeentiteac.hashCode() : 0);
        result = 31 * result + (codeentitemere != null ? codeentitemere.hashCode() : 0);
        result = 31 * result + (typeentitemere != null ? typeentitemere.hashCode() : 0);
        result = 31 * result + (nomprocess != null ? nomprocess.hashCode() : 0);
        result = 31 * result + (radicalprocess != null ? radicalprocess.hashCode() : 0);
        result = 31 * result + (temoinforcage != null ? temoinforcage.hashCode() : 0);
        result = 31 * result + (programme != null ? programme.hashCode() : 0);
        result = 31 * result + (commentaire != null ? commentaire.hashCode() : 0);
        result = 31 * result + (datecreation != null ? datecreation.hashCode() : 0);
        result = 31 * result + (auteur != null ? auteur.hashCode() : 0);
        result = 31 * result + (datemodif != null ? datemodif.hashCode() : 0);
        result = 31 * result + (auteurmodif != null ? auteurmodif.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Entiteaction{" +
                "identite=" + identite +
                ", typeaction='" + typeaction + '\'' +
                ", codeentiteac='" + codeentiteac + '\'' +
                ", codeentitemere='" + codeentitemere + '\'' +
                ", typeentitemere='" + typeentitemere + '\'' +
                ", nomprocess='" + nomprocess + '\'' +
                ", radicalprocess='" + radicalprocess + '\'' +
                ", temoinforcage='" + temoinforcage + '\'' +
                ", programme='" + programme + '\'' +
                ", commentaire='" + commentaire + '\'' +
                ", datecreation=" + datecreation +
                ", auteur='" + auteur + '\'' +
                ", datemodif=" + datemodif +
                ", auteurmodif='" + auteurmodif + '\'' +
                '}';
    }
}
