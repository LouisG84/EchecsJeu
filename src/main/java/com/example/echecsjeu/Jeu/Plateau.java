package com.example.echecsjeu.Jeu;

import com.example.echecsjeu.Pieces.Piece;

public class Plateau {
    static Piece[][] plateau;

    public Plateau() {
        plateau = new Piece[8][8];
    }

    public static Piece getPlateau(int y, int x) {
        return plateau[y][x];
    }

    public static void setPlateau(int y, int x, Piece piece) {
        plateau[y][x] = piece;
    }
}
