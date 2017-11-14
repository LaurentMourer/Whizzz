package model;

import java.sql.Timestamp;

public class Livraison {
    private String numlivraison;
    private Timestamp datelivraison;
    private String etatlivraison;

    public String getNumlivraison() {
        return numlivraison;
    }

    public void setNumlivraison(String numlivraison) {
        this.numlivraison = numlivraison;
    }

    public Timestamp getDatelivraison() {
        return datelivraison;
    }

    public void setDatelivraison(Timestamp datelivraison) {
        this.datelivraison = datelivraison;
    }

    public String getEtatlivraison() {
        return etatlivraison;
    }

    public void setEtatlivraison(String etatlivraison) {
        this.etatlivraison = etatlivraison;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livraison livraison = (Livraison) o;

        if (numlivraison != null ? !numlivraison.equals(livraison.numlivraison) : livraison.numlivraison != null)
            return false;
        if (datelivraison != null ? !datelivraison.equals(livraison.datelivraison) : livraison.datelivraison != null)
            return false;
        return etatlivraison != null ? etatlivraison.equals(livraison.etatlivraison) : livraison.etatlivraison == null;
    }

    @Override
    public int hashCode() {
        int result = numlivraison != null ? numlivraison.hashCode() : 0;
        result = 31 * result + (datelivraison != null ? datelivraison.hashCode() : 0);
        result = 31 * result + (etatlivraison != null ? etatlivraison.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Livraison{" +
                "numlivraison='" + numlivraison + '\'' +
                ", datelivraison=" + datelivraison +
                ", etatlivraison='" + etatlivraison + '\'' +
                '}';
    }
}
