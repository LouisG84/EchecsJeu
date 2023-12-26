package com.example.echecsjeu.Pieces;

import com.example.echecsjeu.Jeu.DeplacementsPossibles;
import com.example.echecsjeu.Jeu.Plateau;
import com.example.echecsjeu.Pieces.carac.Couleur;
import com.example.echecsjeu.Pieces.carac.Etat;

import java.util.ArrayList;

public class Reine extends Piece{

    Etat etat;
    final String name = "Reine";

    public Reine(Couleur couleur, int y, int x) {
        super(couleur, y, x);
        this.etat = Etat.VIVANT;
    }

    public String getName() {
        return name;
    }

    @Override
    public ArrayList<DeplacementsPossibles> getDeplacementsPossibles(int x, int y, Plateau plateau) {
        ArrayList<DeplacementsPossibles> deplacementsPossiblesTab = new ArrayList<>();
        Couleur couleurPiece = Plateau.getPlateau(y,x).getCouleur();

        int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };

        for (int i = 0; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                int nx = x + j * dx[i];
                int ny = y + j * dy[i];

                if (nx >= 0 && nx < 8 && ny >= 0 && ny < 8) {
                    if(Plateau.getPlateau(ny,nx) == null || Plateau.getPlateau(ny,nx).getCouleur() != couleurPiece){
                        deplacementsPossiblesTab.add(new DeplacementsPossibles(ny, nx));
                    }
                }
            }
        }
        return deplacementsPossiblesTab;
    }

    @Override
    public Boolean getPremierCoup() {
        return null;
    }
}
