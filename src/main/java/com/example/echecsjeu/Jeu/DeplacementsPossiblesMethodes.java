package com.example.echecsjeu.Jeu;

import com.example.echecsjeu.Pieces.Piece;
import com.example.echecsjeu.Pieces.Pion;
import com.example.echecsjeu.Pieces.carac.Couleur;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Service
public class DeplacementsPossiblesMethodes {
    // Les blancs sont toujours en haut du plateau
    // Les noirs sont toujours en bas du plateau

    void movePiece(Piece piece, int moveX, int moveY, Piece[][] plateau){
        int posX = piece.getX();
        int posY = piece.getY();
        ArrayList<DeplacementsPossibles> deplacementsPossiblesTab = piece.getDeplacementsPossibles(posX, posY, plateau);

        if(deplacementsPossiblesTab.contains(new DeplacementsPossibles(moveX, moveY))){
            plateau[moveY][moveX] = piece;
            plateau[posY][posX] = null;
            piece.setX(moveX);
            piece.setY(moveY);
        }

    }





}
