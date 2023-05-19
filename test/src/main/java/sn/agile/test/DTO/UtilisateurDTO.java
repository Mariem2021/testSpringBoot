package sn.agile.test.DTO;

public class UtilisateurDTO {

    private int id;
    private String prenom;
    private String nom;
    private String datenais;
    private String profession;

    public UtilisateurDTO() {
    }

    public UtilisateurDTO(int id, String prenom, String nom, String datenais, String profession) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.datenais = datenais;
        this.profession = profession;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDatenais() {
        return datenais;
    }

    public void setDatenais(String datenais) {
        this.datenais = datenais;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "UtilisateurDTO{" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", datenais=" + datenais +
                ", profession='" + profession + '\'' +
                '}';
    }
}
