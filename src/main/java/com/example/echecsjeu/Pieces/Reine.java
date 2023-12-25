package com.example.echecsjeu.Pieces;

import com.example.echecsjeu.Pieces.carac.Couleur;
import com.example.echecsjeu.Pieces.carac.Etat;

public class Reine extends Piece{

    Etat etat;

    public Reine(Couleur couleur, int x, int y) {
        super(couleur, x, y);
        this.etat = Etat.VIVANT;
    }

}
