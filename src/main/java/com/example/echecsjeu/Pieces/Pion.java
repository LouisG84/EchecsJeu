package com.example.echecsjeu.Pieces;

import com.example.echecsjeu.Jeu.DeplacementsPossibles;
import com.example.echecsjeu.Pieces.carac.Couleur;
import com.example.echecsjeu.Pieces.carac.Etat;

import java.util.ArrayList;

public class Pion extends Piece{

    Etat etat;
    Boolean premierCoup = true;
    final String name = "Pion";

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    @Override
    public Boolean getPremierCoup() {
        return premierCoup;
    }

    public Pion(Couleur couleur, int y, int x) {
        super(couleur, y, x);
        this.etat = Etat.VIVANT;
    }

    public String getName() {
        return name;
    }

    @Override
    public ArrayList<DeplacementsPossibles> getDeplacementsPossibles(int x, int y, Piece[][] plateau){

        ArrayList<DeplacementsPossibles> deplacementsPossiblesTab = new ArrayList<>();

        if(getCouleur().equals(Couleur.BLANC)){
            if(plateau[y+1][x] == null){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(y+1, x));
            } else if(getPremierCoup() && plateau[y+2][x] == null){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(y+2, x));
            } else if(plateau[y+1][x-1].getCouleur().equals(Couleur.NOIR)){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(y+1, x-1));
                //TODO mange();
            } else if(plateau[y+1][x+1].getCouleur().equals(Couleur.NOIR)){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(y+1, x+1));
                //TODO mange();
            }
        } else if (getCouleur().equals(Couleur.NOIR)) {
            if(plateau[y-1][x] == null){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(y-1, x));
            } else if(getPremierCoup() && plateau[y-2][x] == null){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(y-2, x));
            } else if(plateau[y-1][x-1].getCouleur().equals(Couleur.BLANC) ){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(y-1, x-1));
                //TODO mange();
            } else if(plateau[y-1][x+1].getCouleur().equals(Couleur.BLANC)){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(y-1, x+1));
                //TODO mange();
            }
        }
        return deplacementsPossiblesTab;
    }
}
