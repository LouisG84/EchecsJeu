package com.example.echecsjeu.Pieces;

import com.example.echecsjeu.Jeu.DeplacementsPossibles;
import com.example.echecsjeu.Pieces.carac.Couleur;
import com.example.echecsjeu.Pieces.carac.Etat;

import java.util.ArrayList;

public class Cavalier extends Piece{
    Etat etat;

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Cavalier(Couleur couleur, int x, int y) {
        super(couleur, x, y);
        this.etat = Etat.VIVANT;
    }

    @Override
    public Boolean getPremierCoup() {
        return null;
    }

    public ArrayList<DeplacementsPossibles> getDeplacementsPossibles(int x, int y, Piece[][] plateau, Piece piece){
        ArrayList<DeplacementsPossibles> deplacementsPossiblesTab = new ArrayList<>();


        return deplacementsPossiblesTab;


    }
}
