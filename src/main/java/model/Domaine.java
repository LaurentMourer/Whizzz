package model;

public class Domaine {
    private Long id;
    private String nom;
    private String codliv;
    private String lettreliv;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodliv() {
        return codliv;
    }

    public void setCodliv(String codliv) {
        this.codliv = codliv;
    }

    public String getLettreliv() {
        return lettreliv;
    }

    public void setLettreliv(String lettreliv) {
        this.lettreliv = lettreliv;
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

        Domaine domaine = (Domaine) o;

        if (id != null ? !id.equals(domaine.id) : domaine.id != null) return false;
        if (nom != null ? !nom.equals(domaine.nom) : domaine.nom != null) return false;
        if (codliv != null ? !codliv.equals(domaine.codliv) : domaine.codliv != null) return false;
        if (lettreliv != null ? !lettreliv.equals(domaine.lettreliv) : domaine.lettreliv != null) return false;
        return description != null ? description.equals(domaine.description) : domaine.description == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (codliv != null ? codliv.hashCode() : 0);
        result = 31 * result + (lettreliv != null ? lettreliv.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Domaine{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", codliv='" + codliv + '\'' +
                ", lettreliv='" + lettreliv + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
