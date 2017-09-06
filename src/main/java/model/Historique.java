package model;

import java.sql.Timestamp;

public class Historique {
    private String idrh;
    private String action;
    private String nom;
    private String type;
    private Timestamp dateaction;
    private Long id;
    private String bonlivraison;
    private String actionmanuelle;

    public String getIdrh() {
        return idrh;
    }

    public void setIdrh(String idrh) {
        this.idrh = idrh;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getDateaction() {
        return dateaction;
    }

    public void setDateaction(Timestamp dateaction) {
        this.dateaction = dateaction;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBonlivraison() {
        return bonlivraison;
    }

    public void setBonlivraison(String bonlivraison) {
        this.bonlivraison = bonlivraison;
    }

    public String getActionmanuelle() {
        return actionmanuelle;
    }

    public void setActionmanuelle(String actionmanuelle) {
        this.actionmanuelle = actionmanuelle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Historique that = (Historique) o;

        if (idrh != null ? !idrh.equals(that.idrh) : that.idrh != null) return false;
        if (action != null ? !action.equals(that.action) : that.action != null) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (dateaction != null ? !dateaction.equals(that.dateaction) : that.dateaction != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bonlivraison != null ? !bonlivraison.equals(that.bonlivraison) : that.bonlivraison != null) return false;
        if (actionmanuelle != null ? !actionmanuelle.equals(that.actionmanuelle) : that.actionmanuelle != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idrh != null ? idrh.hashCode() : 0;
        result = 31 * result + (action != null ? action.hashCode() : 0);
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (dateaction != null ? dateaction.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (bonlivraison != null ? bonlivraison.hashCode() : 0);
        result = 31 * result + (actionmanuelle != null ? actionmanuelle.hashCode() : 0);
        return result;
    }
}
