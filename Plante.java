package tp5;

public class Plante {
    protected String nom;
    protected int hauteur;
    protected int age;
    protected double prix;

    public Plante(String nom, int hauteur, int age, double prix) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.age = age;
        this.prix = prix;
    }

    public String toString() {
        return "Nom: " + nom + ", Hauteur: " + hauteur + " cm, age: " + age + " mois, Prix: " + prix;
    }

    public void description() {
        System.out.println(this.toString());
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
