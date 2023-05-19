package sn.agile.test.model;

import jakarta.persistence.*;


@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @Column(name = "id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "prenom", length = 50)
    private String prenom;
    @Column(name = "nom", length = 50)
    private String nom;
    @Column(name = "date")
    private String datenais;
    @Column(name = "profession", length = 50)
    private String profession;

    public Utilisateur() {
    }

    public Utilisateur(int id, String prenom, String nom, String datenais, String profession) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.datenais = datenais;
        this.profession = profession;
    }
    public Utilisateur(String prenom, String nom, String datenais, String profession) {
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
        return "Utilisateur{" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", datenais=" + datenais +
                ", profession='" + profession + '\'' +
                '}';
    }
}
