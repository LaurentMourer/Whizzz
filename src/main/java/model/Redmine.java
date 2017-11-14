package model;

import java.sql.Time;

public class Redmine {
    private Long numero;
    private String nom;
    private Time datecreation;
    private Time datelivraison;
    private String description;

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Time getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Time datecreation) {
        this.datecreation = datecreation;
    }

    public Time getDatelivraison() {
        return datelivraison;
    }

    public void setDatelivraison(Time datelivraison) {
        this.datelivraison = datelivraison;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Redmine redmine = (Redmine) o;

        if (numero != null ? !numero.equals(redmine.numero) : redmine.numero != null) return false;
        if (nom != null ? !nom.equals(redmine.nom) : redmine.nom != null) return false;
        if (datecreation != null ? !datecreation.equals(redmine.datecreation) : redmine.datecreation != null)
            return false;
        if (datelivraison != null ? !datelivraison.equals(redmine.datelivraison) : redmine.datelivraison != null)
            return false;
        return description != null ? description.equals(redmine.description) : redmine.description == null;
    }

    @Override
    public int hashCode() {
        int result = numero != null ? numero.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (datecreation != null ? datecreation.hashCode() : 0);
        result = 31 * result + (datelivraison != null ? datelivraison.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
