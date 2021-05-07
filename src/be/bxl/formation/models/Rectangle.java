package be.bxl.formation.models;

public class Rectangle extends Forme {

    private double longeur;
    private double largeur;

    public double getLongeur() {
        return longeur;
    }

    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public Rectangle(String couleur, double longeur, double largeur) {
        super(couleur);
        this.largeur = largeur;
        this.longeur = longeur;
    }

    @Override
    public void dessiner() {
        System.out.println("Un rectangle de " + longeur + " et " + largeur
                + " de couleur " + getCouleur());
    }
}
