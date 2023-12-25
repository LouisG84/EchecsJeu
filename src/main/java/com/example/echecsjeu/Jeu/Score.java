package com.example.echecsjeu.Jeu;

import com.example.echecsjeu.Pieces.Piece;

import java.util.ArrayList;

public class Score {
    static ArrayList<Piece> scoreBlanc;
    static ArrayList<Piece> scoreNoir;

    public Score(ArrayList<Piece> scoreBlanc, ArrayList<Piece> scoreNoir) {
        this.scoreBlanc = scoreBlanc;
        this.scoreNoir = scoreNoir;
    }

    public ArrayList<Piece> getScoreBlanc() {
        return scoreBlanc;
    }

    public static void setScoreBlanc(Piece piece) {
        scoreBlanc.add(piece);
    }

    public ArrayList<Piece> getScoreNoir() {
        return scoreNoir;
    }

    public static void setScoreNoir(Piece piece) {
        scoreNoir.add(piece);
    }
}
