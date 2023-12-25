package com.example.echecsjeu.Pieces;

import com.example.echecsjeu.Jeu.DeplacementsPossibles;
import com.example.echecsjeu.Pieces.carac.Couleur;

import java.util.ArrayList;

public abstract class Piece {
    int x;
    int y;
    Couleur couleur;

    public Piece(Couleur couleur, int y, int x) {
        this.couleur = couleur;
        this.y = y;
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public abstract ArrayList<DeplacementsPossibles> getDeplacementsPossibles(int x, int y, Piece[][] plateau);

    public abstract Boolean getPremierCoup();

    /*
    public void getLinearMoves(int x, int y, Piece[][] plateau){
        //Déplacements case vide
        //Déplacements case occupée -> mange
    }

    public void getDiagonalMoves(int x, int y, Piece[][] plateau){
        //Déplacements case vide
        //Déplacements case occupée -> mange
    }

    public void getCavalierMoves(int x, int y, Piece[][] plateau){
        //Déplacements case vide
        //Déplacements case occupée -> mange
    }*/
}
