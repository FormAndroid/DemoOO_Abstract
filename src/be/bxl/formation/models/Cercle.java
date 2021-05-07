package be.bxl.formation.models;

public class Cercle extends Forme {

    private double rayon;

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public Cercle(String couleur, double rayon) {
        super(couleur);
        setRayon(rayon);
    }

    @Override
    public void dessiner() {
        System.out.println("Un cercle de " + rayon
                + " de rayon et de couleur " + getCouleur());
    }
}
