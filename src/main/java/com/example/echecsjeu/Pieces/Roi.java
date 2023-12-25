package com.example.echecsjeu.Pieces;

import com.example.echecsjeu.Jeu.DeplacementsPossibles;
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
    public ArrayList<DeplacementsPossibles> getDeplacementsPossibles(int x, int y, Piece[][] plateau) {
        return null;
    }

    @Override
    public Boolean getPremierCoup() {
        return null;
    }
}
