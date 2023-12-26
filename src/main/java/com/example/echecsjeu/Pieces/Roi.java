package com.example.echecsjeu.Pieces;

import com.example.echecsjeu.Jeu.DeplacementsPossibles;
import com.example.echecsjeu.Jeu.Plateau;
import com.example.echecsjeu.Pieces.carac.Couleur;
import com.example.echecsjeu.Pieces.carac.EtatRoi;

import java.util.ArrayList;

public class Roi extends Piece {

    EtatRoi etatRoi;
    final String name = "Roi";

    public EtatRoi getEtatRoi() {
        return etatRoi;
    }

    public void setEtatRoi(EtatRoi etatRoi) {
        this.etatRoi = etatRoi;
    }

    public Roi(Couleur couleur, int y, int x) {
        super(couleur, y, x);
        this.etatRoi = EtatRoi.NORMAL;
    }

    public String getName() {
        return name;
    }

    @Override
    public ArrayList<DeplacementsPossibles> getDeplacementsPossibles(int x, int y, Plateau plateau) {
        ArrayList<DeplacementsPossibles> deplacementsPossiblesTab = new ArrayList<>();
        Couleur couleurPiece = Plateau.getPlateau(y,x).getCouleur();

        int[] dx = { -1, 0, 1, 1, 1, 0, -1, -1 };
        int[] dy = { -1, -1, -1, 0, 1, 1, 1, 0 };

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

    @Override
    public Boolean getPremierCoup() {
        return null;
    }
}
