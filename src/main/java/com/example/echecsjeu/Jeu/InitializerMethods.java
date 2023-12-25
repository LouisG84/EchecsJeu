package com.example.echecsjeu.Jeu;

import com.example.echecsjeu.Pieces.*;
import com.example.echecsjeu.Pieces.carac.Couleur;

public class InitializerMethods {
    static public Plateau plateau = new Plateau();
    
    /*
                            (y,x)
        [ (0,0)  (0,1)  (0,2)  (0,3)  (0,4)  (0,5)  (0,6)  (0,7) ]
        [ (1,0)  (1,1)  (1,2)  (1,3)  (1,4)  (1,5)  (1,6)  (1,7) ]
        [ (2,0)  (2,1)  (2,2)  (2,3)  (2,4)  (2,5)  (2,6)  (2,7) ]
        [ (3,0)  (3,1)  (3,2)  (3,3)  (3,4)  (3,5)  (3,6)  (3,7) ]
        [ (4,0)  (4,1)  (4,2)  (4,3)  (4,4)  (4,5)  (4,6)  (4,7) ]
        [ (5,0)  (5,1)  (5,2)  (5,3)  (5,4)  (5,5)  (5,6)  (5,7) ]
        [ (6,0)  (6,1)  (6,2)  (6,3)  (6,4)  (6,5)  (6,6)  (6,7) ]
        [ (7,0)  (7,1)  (7,2)  (7,3)  (7,4)  (7,5)  (7,6)  (7,7) ]
     */

    public static void initPieces() {
        // Ajout des Tours
        Plateau.setPlateau(0, 0, new Tour(Couleur.BLANC, 0, 0));
        Plateau.setPlateau(7, 0, new Tour(Couleur.BLANC, 7, 0));
        Plateau.setPlateau(0, 7, new Tour(Couleur.NOIR, 0, 7));
        Plateau.setPlateau(7, 7, new Tour(Couleur.NOIR, 7, 7));


        // Ajout des Cavaliers
        Plateau.setPlateau(1, 0, new Cavalier(Couleur.BLANC, 1, 0));
        Plateau.setPlateau(6, 0, new Cavalier(Couleur.BLANC, 6, 0));
        Plateau.setPlateau(1, 7, new Cavalier(Couleur.NOIR, 1, 7));
        Plateau.setPlateau(6, 7, new Cavalier(Couleur.NOIR, 6, 7));


        // Ajout des Fous
        Plateau.setPlateau(0, 2, new Fou(Couleur.BLANC, 2, 0));
        Plateau.setPlateau(0, 5, new Fou(Couleur.BLANC, 0, 5));
        Plateau.setPlateau(7, 2, new Fou(Couleur.NOIR, 7, 2));
        Plateau.setPlateau(7, 5, new Fou(Couleur.NOIR, 7, 5));


        // Ajout des Reines
        Plateau.setPlateau(0, 3, new Reine(Couleur.BLANC, 0, 3));
        Plateau.setPlateau(7, 3, new Reine(Couleur.NOIR, 7, 3));

        // Ajout des Rois
        Plateau.setPlateau(0, 4, new Roi(Couleur.BLANC, 0, 4));
        Plateau.setPlateau(7, 4, new Roi(Couleur.NOIR, 7, 4));


        // Ajout des Pions
        for (int i = 0; i < 8; i++) {
            Plateau.setPlateau(1, i, new Pion(Couleur.BLANC, 1, i));
            Plateau.setPlateau(6, i, new Pion(Couleur.NOIR, 6, i));
        }

        System.out.println("Initialisation des pièces terminée");
        System.out.println(Plateau.getPlateau(0, 0));
    }
}
