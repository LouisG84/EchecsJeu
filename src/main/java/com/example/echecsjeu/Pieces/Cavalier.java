package com.example.echecsjeu.Pieces;

import com.example.echecsjeu.Jeu.DeplacementsPossibles;
import com.example.echecsjeu.Jeu.Plateau;
import com.example.echecsjeu.Pieces.carac.Couleur;
import com.example.echecsjeu.Pieces.carac.Etat;

import java.util.ArrayList;

public class Cavalier extends Piece{
    Etat etat;
    final String name = "Cavalier";

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Cavalier(Couleur couleur, int y, int x) {
        super(couleur, y, x);
        this.etat = Etat.VIVANT;
    }

    public String getName() {
        return name;
    }

    @Override
    public Boolean getPremierCoup() {
        return null;
    }

    @Override
    public ArrayList<DeplacementsPossibles> getDeplacementsPossibles(int x, int y, Plateau plateau){
        ArrayList<DeplacementsPossibles> deplacementsPossiblesTab = new ArrayList<>();
        Couleur couleurPiece = Plateau.getPlateau(y,x).getCouleur();

        int[] dx = { -1, -2, -2, -1, 1, 2, 2, 1 };
        int[] dy = { -2, -1, 1, 2, 2, 1, -1, -2 };

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < 8 && ny >= 0 && ny < 8) {
                if(Plateau.getPlateau(ny,nx) == null || Plateau.getPlateau(ny,nx).getCouleur() != couleurPiece){
                    deplacementsPossiblesTab.add(new DeplacementsPossibles(ny, nx));
                }
            }
        }
        return deplacementsPossiblesTab;
    }
}
