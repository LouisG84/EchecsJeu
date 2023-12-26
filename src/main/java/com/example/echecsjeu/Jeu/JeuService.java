package com.example.echecsjeu.Jeu;

import com.example.echecsjeu.Pieces.Piece;
import com.example.echecsjeu.Pieces.carac.Couleur;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JeuService {
    // Les blancs sont toujours en haut du plateau
    // Les noirs sont toujours en bas du plateau

    public void movePiece(Piece piece, int moveY, int moveX, Plateau plateau){
        int posX = piece.getX();
        int posY = piece.getY();
        ArrayList<DeplacementsPossibles> deplacementsPossiblesTab = piece.getDeplacementsPossibles(posX, posY, plateau);

        if(deplacementsPossiblesTab.contains(new DeplacementsPossibles(moveX, moveY))){
            if(Plateau.getPlateau(moveY, moveX) != null){
                eatPiece(piece, moveX, moveY, posX, posY, plateau);
            }
            Plateau.setPlateau(moveY, moveX, piece);
            Plateau.setPlateau(posY, posX, null);
            piece.setX(moveX);
            piece.setY(moveY);
        }
        System.out.println(Plateau.getPlateau(2, 4));
    }

    void eatPiece(Piece piece, int moveX, int moveY, int posX, int posY, Plateau plateau){
        Couleur color = piece.getCouleur(); // Couleur de la pièce qui mange

        if (color == Couleur.BLANC) {
            Score.setScoreBlanc(piece);
        } else {
            Score.setScoreNoir(piece);
        }
        Plateau.setPlateau(moveY, moveX, piece);
        Plateau.setPlateau(posY, posX, null);
        piece.setX(moveX);
        piece.setY(moveY);
    }






}
