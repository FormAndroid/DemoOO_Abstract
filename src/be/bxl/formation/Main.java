package be.bxl.formation;

import be.bxl.formation.models.Carre;
import be.bxl.formation.models.Cercle;
import be.bxl.formation.models.Forme;
import be.bxl.formation.models.Rectangle;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        Forme f1 = new Forme("");

        ArrayList<Forme> mesFormes = new ArrayList<>();


        mesFormes.add(new Rectangle("Rose", 4, 2));
        mesFormes.add(new Carre("Bleu", 10));
        mesFormes.add(new Carre("Vert", 7.5));
        mesFormes.add(new Cercle("Blanc", 5));
        mesFormes.add(new Carre("Cyan", 15));


        System.out.println(" - Dessiner toutes les formes");
        for(Forme f : mesFormes) {
            f.dessiner();
        }
        System.out.println();


        System.out.println(" - Identification des elements");
        for(Object obj : mesFormes) {
            System.out.println("La classe reel contenu -> \"" + obj.getClass() + "\" !");

            Forme f = (Forme) obj;
            System.out.println("  La couleur est " + f.getCouleur());

            if(obj instanceof Rectangle) {
                // Cast de l'obj en Rectangle, car l'obj possede le type rectangle
                Rectangle r = (Rectangle) obj;
                System.out.println("  La largeur est " + r.getLargeur());
            }

            if(obj instanceof Cercle c) {
                // Exemple avec une création de variable lors du "cast"
                System.out.println("  Le rayon est " + c.getRayon());
            }
        }
        System.out.println();

    }
}
