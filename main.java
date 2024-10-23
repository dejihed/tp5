package tp5;

public class main {
    public static void main(String[] args) {
        System.out.println("        Pépinière GREEN HANDS");
        Pepiniere pepiniere = new Pepiniere();

        Fleur rose = new Fleur(null, 30, 12, 15.99, "Rouge", 2);
        Fleur tulipe = new Fleur("Tulipe", 20, 8, 12.99, "Jaune", 4);
        Arbre chene = new Arbre("Chêne", 200, 60, 89.99, "Caduque");
        Arbre sapin = new Arbre("Sapin", 150, 30, 59.99, "Persistant");

        rose.setNom("Rose");

        System.out.println("La " + rose.getNom() + " a la couleur " + rose.getCouleur());

        pepiniere.ajoutPlante(rose);
        pepiniere.ajoutPlante(tulipe);
        pepiniere.ajoutPlante(chene);
        pepiniere.ajoutPlante(sapin);

        pepiniere.afficherInventaire();

        System.out.println("Total Absorption CO2 : " + pepiniere.totalAbsorptionTotaleCO2() + " g/jour");

        System.out.println("Nombre d'arbres Caduques dans la pépinière : " + pepiniere.compterArbresCaduques());
    }
}
