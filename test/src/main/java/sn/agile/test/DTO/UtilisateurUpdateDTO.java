package sn.agile.test.DTO;

public class UtilisateurUpdateDTO {

    private int id;
    private String prenom;

    private String nom;

    private String date;
    private String profession;

    public UtilisateurUpdateDTO(int id, String prenom, String nom, String date, String profession) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.date = date;
        this.profession = profession;
    }

    public UtilisateurUpdateDTO() {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "UtilisateurUpdateDTO{" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", date='" + date + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
