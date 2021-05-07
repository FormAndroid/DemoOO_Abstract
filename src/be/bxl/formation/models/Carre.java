package be.bxl.formation.models;

public class Carre extends Rectangle{


    public Carre(String couleur, double cote) {
        super(couleur, cote, cote);
    }

    @Override
    public void dessiner() {

        System.out.println("Un carré de " + getLongeur() + " de coté"
                + " de couleur " + getCouleur());
    }
}
