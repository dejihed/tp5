package tp5;

public class Arbre extends Plante {
    private String typeFeuillage;
    private final double AbsorMoyenne = 22; 

    public Arbre(String nom, int hauteur, int age, double prix, String typeFeuillage) {
        super(nom, hauteur, age, prix);
        this.typeFeuillage = typeFeuillage;
    }

    public String getTypeFeuillage() {
        return typeFeuillage;
    }


    public void description() {
        super.description();
        System.out.println("Type de feuillage: " + typeFeuillage + ", Absorption CO2: " + absorptionCO2() + " g/jour");
    }

    public double absorptionCO2() {
        if (hauteur > 5000) {  
            return AbsorMoyenne + 3;
        }
        return AbsorMoyenne;
    }
}
