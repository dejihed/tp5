package tp5;

class Pepiniere {
    private static final int maxP = 1000; 
    private Plante[] inventaire = new Plante[maxP]; 
    private int nbP = 0; 

    public Pepiniere() {}

    public void ajoutPlante(Plante plante) {
        if (nbP < maxP) {
            inventaire[nbP] = plante;
            nbP++;
        } else {
            System.out.println("impossible d'ajouter plus la plante");
        }
    }

    public void afficherInventaire() {
        for (int i = 0; i < nbP; i++) {
            if (inventaire[i] != null) {
                inventaire[i].description();
            }
        }
    }

    public double totalAbsorptionTotaleCO2() {
        double totalAbsorption = 0;
        for (int i = 0; i < nbP; i++) {

                totalAbsorption += ((Arbre) inventaire[i]).absorptionCO2();
            }
        return totalAbsorption;
    }

    public int compterArbresCaduques() {
        int count = 0;
        for (int i = 0; i < nbP; i++) {

                Arbre arbre = (Arbre) inventaire[i];
                if (arbre.getTypeFeuillage().equals("Caduque")) {
                    count++;
                }
            }
        return count;
    }
}
