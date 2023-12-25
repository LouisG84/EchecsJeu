package com.example.echecsjeu.Pieces;

import com.example.echecsjeu.Jeu.DeplacementsPossibles;
import com.example.echecsjeu.Pieces.carac.Couleur;
import com.example.echecsjeu.Pieces.carac.Etat;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Tour extends Piece{
    Etat etat;

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Tour(Couleur couleur, int x, int y) {
        super(couleur, x, y);
        this.etat = Etat.VIVANT;
    }

    @Override
    public Boolean getPremierCoup() {
        return null;
    }

    @Override
    public ArrayList<DeplacementsPossibles> getDeplacementsPossibles(int x, int y, Piece[][] plateau){
        ArrayList<DeplacementsPossibles> deplacementsPossiblesTab = new ArrayList<>();

        Couleur couleurPiece = plateau[y][x].getCouleur();

        //Déplacements droite
        for(int i = x; i < 8; i++){
            if(plateau[y][i] == null){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(y, i));
            } else if(plateau[y][i].getCouleur() != couleurPiece){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(y, i));
                //TODO mange();
                break;
            } else {
                break;
            }
        }

        //Déplacements gauche
        for(int i = x; i >= 0; i--){
            if(plateau[y][i] == null){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(y, i));
            } else if(plateau[y][i].getCouleur() != couleurPiece){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(y, i));
                //TODO mange();
                break;
            } else {
                break;
            }
        }

        //Déplacements haut
        for(int i = y; i < 8; i++){
            if(plateau[i][x] == null){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(i, x));
            } else if(plateau[i][x].getCouleur() != couleurPiece){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(i, x));
                //TODO mange();
                break;
            } else {
                break;
            }
        }

        //Déplacements bas
        for(int i = y; i >= 0; i--){
            if(plateau[i][x] == null){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(i, x));
            } else if(plateau[i][x].getCouleur() != couleurPiece){
                deplacementsPossiblesTab.add(new DeplacementsPossibles(i, x));
                //TODO mange();
                break;
            } else {
                break;
            }
        }

        return deplacementsPossiblesTab;
    }
}
