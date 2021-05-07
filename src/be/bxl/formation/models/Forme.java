package be.bxl.formation.models;

// La classe "Forme" ne peut plus être instancié
public abstract class Forme {

    private String couleur;


    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }


    public Forme(String couleur) {
        this.couleur = couleur;
    }

    // La classe "Forme" connait la méthode, mais elle ne sait pas la résoudre
    public abstract void dessiner();
}
