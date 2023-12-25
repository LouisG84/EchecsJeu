package com.example.echecsjeu.Jeu;

import org.springframework.stereotype.Service;


public class DeplacementsPossibles {
    int ligne; //y
    int colonne; //x

    public DeplacementsPossibles(int ligne, int colonne) {
        this.ligne = ligne;
        this.colonne = colonne;
    }

    public int getLigne() {
        return ligne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    public int getColonne() {
        return colonne;
    }

    public void setColonne(int colonne) {
        this.colonne = colonne;
    }
}
