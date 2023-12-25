package com.example.echecsjeu.Pieces;

import com.example.echecsjeu.Jeu.DeplacementsPossibles;
import com.example.echecsjeu.Pieces.carac.Couleur;
import com.example.echecsjeu.Pieces.carac.Etat;

import java.util.ArrayList;

public class Fou extends Piece{

    Etat etat;
    final String name = "Fou";

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Fou(Couleur couleur, int y, int x) {
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

    public ArrayList<DeplacementsPossibles> getDeplacementsPossibles(int x, int y, Piece[][] plateau) {
        ArrayList<DeplacementsPossibles> deplacementsPossiblesTab = new ArrayList<>();

        Couleur couleurPiece = plateau[y][x].getCouleur();

        //Déplacements haut gauche
        for(int i = y, j = x; i < 8 && j >= 0; i++, j--){
            if(plateau[i][j] == null){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(i, j));
            } else if(plateau[i][j].getCouleur() != couleurPiece){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(i, j));
                //TODO mange();
                break;
            } else {
                break;
            }
        }

        //Déplacements haut droite
        for(int i = y, j = x; i < 8 && j < 8; i++, j++){
            if(plateau[i][j] == null){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(i, j));
            } else if(plateau[i][j].getCouleur() != couleurPiece){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(i, j));
                //TODO mange();
                break;
            } else {
                break;
            }
        }

        //Déplacements bas gauche
        for(int i = y, j = x; i >= 0 && j >= 0; i--, j--){
            if(plateau[i][j] == null){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(i, j));
            } else if(plateau[i][j].getCouleur() != couleurPiece){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(i, j));
                //TODO mange();
                break;
            } else {
                break;
            }
        }

        //Déplacements bas droite
        for(int i = y, j = x; i >= 0 && j < 8; i--, j++){
            if(plateau[i][j] == null){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(i, j));
            } else if(plateau[i][j].getCouleur() != couleurPiece){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(i, j));
                //TODO mange();
                break;
            } else {
                break;
            }
        }



        return deplacementsPossiblesTab;
    }
}
