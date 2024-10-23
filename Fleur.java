package tp5;

public class Fleur extends Plante {
    private String couleur;
    private int moisF;

    public Fleur(String nom, int hauteur, int age, double prix, String couleur, int moisF) {
        super(nom, hauteur, age, prix);
        this.couleur = couleur;
        this.moisF = moisF;
    }

    public void description() {
        super.description();
        String msg;
        if (fleurir()) 
            msg="oui";
        else 
            msg="non";
        System.out.println("Couleur: " + couleur + ", En fleurs: " + msg);
    }
    

    public boolean fleurir() {
        return moisF >= 4 && moisF <= 6;
    }

    public String getCouleur() {
        return couleur;
    }
}
