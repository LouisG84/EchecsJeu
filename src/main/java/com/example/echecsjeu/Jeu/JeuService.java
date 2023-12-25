package com.example.echecsjeu.Jeu;

import com.example.echecsjeu.Pieces.Piece;
import com.example.echecsjeu.Jeu.Score;
import com.example.echecsjeu.Pieces.carac.Couleur;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JeuService {
    // Les blancs sont toujours en haut du plateau
    // Les noirs sont toujours en bas du plateau

    void movePiece(Piece piece, int moveX, int moveY, Piece[][] plateau){
        int posX = piece.getX();
        int posY = piece.getY();
        ArrayList<DeplacementsPossibles> deplacementsPossiblesTab = piece.getDeplacementsPossibles(posX, posY, plateau);

        if(deplacementsPossiblesTab.contains(new DeplacementsPossibles(moveX, moveY))){
            if(plateau[moveY][moveX] != null){
                eatPiece(piece, moveX, moveY, posX, posY, plateau);
            }
            plateau[moveY][moveX] = piece;
            plateau[posY][posX] = null;
            piece.setX(moveX);
            piece.setY(moveY);
        }

    }

    void eatPiece(Piece piece, int moveX, int moveY, int posX, int posY, Piece[][] plateau){
        Couleur color = piece.getCouleur(); // Couleur de la pièce qui mange

        if (color == Couleur.BLANC) {
            Score.setScoreBlanc(piece);
        } else {
            Score.setScoreNoir(piece);
        }
        plateau[moveY][moveX] = piece;
        plateau[posY][posX] = null;
        piece.setX(moveX);
        piece.setY(moveY);
    }






}
