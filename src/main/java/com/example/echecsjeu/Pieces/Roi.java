package com.example.echecsjeu.Pieces;

import com.example.echecsjeu.Pieces.carac.Couleur;
import com.example.echecsjeu.Pieces.carac.EtatRoi;

public class Roi extends Piece {

    EtatRoi etatRoi;

    public EtatRoi getEtatRoi() {
        return etatRoi;
    }

    public void setEtatRoi(EtatRoi etatRoi) {
        this.etatRoi = etatRoi;
    }

    public Roi(Couleur couleur, int x, int y) {
        super(couleur, x, y);
        this.etatRoi = EtatRoi.NORMAL;
    }
}
