package model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.Date;

public class Bonlivraison {

    @NotNull
    @Size(min = 6, max = 30)
    private String numjira;
    private String statut;

    private Date datecreation;
    private String description;
    private String domaine;
    private String livraisonnumlivraison;
    private String useridrh;
    private String pret;
    private Timestamp datemodif;
    private String auteurmodif;
    private String source;

    public String getNumjira() {
        return numjira;
    }

    public void setNumjira(String numjira) {
        this.numjira = numjira;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }


    public Date getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getLivraisonnumlivraison() {
        return livraisonnumlivraison;
    }

    public void setLivraisonnumlivraison(String livraisonnumlivraison) {
        this.livraisonnumlivraison = livraisonnumlivraison;
    }

    public String getUseridrh() {
        return useridrh;
    }

    public void setUseridrh(String useridrh) {
        this.useridrh = useridrh;
    }

    public String getPret() {
        return pret;
    }

    public void setPret(String pret) {
        this.pret = pret;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bonlivraison that = (Bonlivraison) o;

        if (numjira != null ? !numjira.equals(that.numjira) : that.numjira != null) return false;
        if (statut != null ? !statut.equals(that.statut) : that.statut != null) return false;
        if (datecreation != null ? !datecreation.equals(that.datecreation) : that.datecreation != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (domaine != null ? !domaine.equals(that.domaine) : that.domaine != null) return false;
        if (livraisonnumlivraison != null ? !livraisonnumlivraison.equals(that.livraisonnumlivraison) : that.livraisonnumlivraison != null)
            return false;
        if (useridrh != null ? !useridrh.equals(that.useridrh) : that.useridrh != null) return false;
        if (pret != null ? !pret.equals(that.pret) : that.pret != null) return false;
        if (datemodif != null ? !datemodif.equals(that.datemodif) : that.datemodif != null) return false;
        if (auteurmodif != null ? !auteurmodif.equals(that.auteurmodif) : that.auteurmodif != null) return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numjira != null ? numjira.hashCode() : 0;
        result = 31 * result + (statut != null ? statut.hashCode() : 0);
        result = 31 * result + (datecreation != null ? datecreation.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (domaine != null ? domaine.hashCode() : 0);
        result = 31 * result + (livraisonnumlivraison != null ? livraisonnumlivraison.hashCode() : 0);
        result = 31 * result + (useridrh != null ? useridrh.hashCode() : 0);
        result = 31 * result + (pret != null ? pret.hashCode() : 0);
        result = 31 * result + (datemodif != null ? datemodif.hashCode() : 0);
        result = 31 * result + (auteurmodif != null ? auteurmodif.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bonlivraison{" +
                "numjira='" + numjira + '\'' +
                ", statut='" + statut + '\'' +
                ", datecreation=" + datecreation +
                ", description='" + description + '\'' +
                ", domaine='" + domaine + '\'' +
                ", livraisonnumlivraison='" + livraisonnumlivraison + '\'' +
                ", useridrh='" + useridrh + '\'' +
                ", pret='" + pret + '\'' +
                ", datemodif=" + datemodif +
                ", auteurmodif='" + auteurmodif + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
