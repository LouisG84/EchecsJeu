package com.example.echecsjeu.Jeu;

import com.example.echecsjeu.Pieces.*;
import com.example.echecsjeu.Pieces.carac.Couleur;

public class InitializerMethods {
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

    public static void initPieces(Piece[][] plateau) {
        // Ajout des Tours
        plateau[0][0] = new Tour(Couleur.BLANC, 0, 0);
        plateau[0][7] = new Tour(Couleur.BLANC, 7, 0);
        plateau[7][0] = new Tour(Couleur.NOIR, 0, 7);
        plateau[7][7] = new Tour(Couleur.NOIR, 7, 7);

        // Ajout des Cavaliers
        plateau[0][1] = new Cavalier(Couleur.BLANC, 1, 0);
        plateau[0][6] = new Cavalier(Couleur.BLANC, 6, 0);
        plateau[7][1] = new Cavalier(Couleur.NOIR, 1, 7);
        plateau[7][6] = new Cavalier(Couleur.NOIR, 6, 7);

        // Ajout des Fous
        plateau[0][2] = new Cavalier(Couleur.BLANC, 2, 0);
        plateau[0][5] = new Cavalier(Couleur.BLANC, 5, 0);
        plateau[7][2] = new Cavalier(Couleur.NOIR, 2, 7);
        plateau[7][5] = new Cavalier(Couleur.NOIR, 5, 7);

        // Ajout des Reines
        plateau[0][3] = new Reine(Couleur.BLANC, 3, 0);
        plateau[7][3] = new Reine(Couleur.NOIR, 3, 7);

        // Ajout des Rois
        plateau[0][4] = new Roi(Couleur.BLANC, 4, 0);
        plateau[7][4] = new Roi(Couleur.NOIR, 4, 7);

        // Ajout des Pions
        for (int i = 0; i < 8; i++) {
            plateau[1][i] = new Pion(Couleur.BLANC, i, 1);
            plateau[6][i] = new Pion(Couleur.NOIR, i,6);
        }
    }
}
