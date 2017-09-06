package model;

public class Environnement {
    private String nomenvironnement;
    private String description;
    private Long compilable;

    public String getNomenvironnement() {
        return nomenvironnement;
    }

    public void setNomenvironnement(String nomenvironnement) {
        this.nomenvironnement = nomenvironnement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCompilable() {
        return compilable;
    }

    public void setCompilable(Long compilable) {
        this.compilable = compilable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Environnement that = (Environnement) o;

        if (nomenvironnement != null ? !nomenvironnement.equals(that.nomenvironnement) : that.nomenvironnement != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (compilable != null ? !compilable.equals(that.compilable) : that.compilable != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomenvironnement != null ? nomenvironnement.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (compilable != null ? compilable.hashCode() : 0);
        return result;
    }
}
