package model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

public class Entitedesign extends Entite {
    private Integer identite;
    private String domaine;
    private String nom;
    private String typedesign;
    private String commentairetechnique;
    private String commentairefonctionnel;
    private String numhpqc;
    private String livrer;
    private String useridrh;
    private String lastupdateidrh;
    private Timestamp datecreation;
    private Timestamp datemodif;
    private String report;
    private Set<Entiteaction> entiteactions = new HashSet<Entiteaction>(0);
    private Bonlivraison bonlivraison;

    public Set<Entiteaction> getEntiteactions() {
        return entiteactions;
    }

    public void setEntiteactions(Set<Entiteaction> entiteactions) {
        this.entiteactions = entiteactions;
    }

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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTypedesign() {
        return typedesign;
    }

    public void setTypedesign(String typedesign) {
        this.typedesign = typedesign;
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

    public String getLivrer() {
        return livrer;
    }

    public void setLivrer(String livrer) {
        this.livrer = livrer;
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

        Entitedesign that = (Entitedesign) o;

        if (identite != null ? !identite.equals(that.identite) : that.identite != null) return false;
        if (domaine != null ? !domaine.equals(that.domaine) : that.domaine != null) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (typedesign != null ? !typedesign.equals(that.typedesign) : that.typedesign != null) return false;
        if (commentairetechnique != null ? !commentairetechnique.equals(that.commentairetechnique) : that.commentairetechnique != null)
            return false;
        if (commentairefonctionnel != null ? !commentairefonctionnel.equals(that.commentairefonctionnel) : that.commentairefonctionnel != null)
            return false;
        if (numhpqc != null ? !numhpqc.equals(that.numhpqc) : that.numhpqc != null) return false;
        if (livrer != null ? !livrer.equals(that.livrer) : that.livrer != null) return false;
        if (useridrh != null ? !useridrh.equals(that.useridrh) : that.useridrh != null) return false;
        if (lastupdateidrh != null ? !lastupdateidrh.equals(that.lastupdateidrh) : that.lastupdateidrh != null)
            return false;
        if (datecreation != null ? !datecreation.equals(that.datecreation) : that.datecreation != null) return false;
        if (datemodif != null ? !datemodif.equals(that.datemodif) : that.datemodif != null) return false;
        if (report != null ? !report.equals(that.report) : that.report != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = identite != null ? identite.hashCode() : 0;
        result = 31 * result + (domaine != null ? domaine.hashCode() : 0);
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (typedesign != null ? typedesign.hashCode() : 0);
        result = 31 * result + (commentairetechnique != null ? commentairetechnique.hashCode() : 0);
        result = 31 * result + (commentairefonctionnel != null ? commentairefonctionnel.hashCode() : 0);
        result = 31 * result + (numhpqc != null ? numhpqc.hashCode() : 0);
        result = 31 * result + (livrer != null ? livrer.hashCode() : 0);
        result = 31 * result + (useridrh != null ? useridrh.hashCode() : 0);
        result = 31 * result + (lastupdateidrh != null ? lastupdateidrh.hashCode() : 0);
        result = 31 * result + (datecreation != null ? datecreation.hashCode() : 0);
        result = 31 * result + (datemodif != null ? datemodif.hashCode() : 0);
        result = 31 * result + (report != null ? report.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Entitedesign{" +
                "identite=" + identite +
                ", domaine='" + domaine + '\'' +
                ", nom='" + nom + '\'' +
                ", typedesign='" + typedesign + '\'' +
                ", commentairetechnique='" + commentairetechnique + '\'' +
                ", commentairefonctionnel='" + commentairefonctionnel + '\'' +
                ", numhpqc='" + numhpqc + '\'' +
                ", livrer='" + livrer + '\'' +
                ", useridrh='" + useridrh + '\'' +
                ", lastupdateidrh='" + lastupdateidrh + '\'' +
                ", datecreation=" + datecreation +
                ", datemodif=" + datemodif +
                ", report='" + report + '\'' +
                '}';
    }
}
