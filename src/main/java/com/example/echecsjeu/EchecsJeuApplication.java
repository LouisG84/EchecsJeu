package com.example.echecsjeu;

import com.example.echecsjeu.Jeu.InitializerMethods;
import com.example.echecsjeu.Jeu.JeuService;
import com.example.echecsjeu.Jeu.Plateau;
import com.example.echecsjeu.Pieces.Piece;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EchecsJeuApplication {

    public static void main(String[] args) {
        SpringApplication.run(EchecsJeuApplication.class, args);

        InitializerMethods.initPieces();

        System.out.println(Plateau.getPlateau(0, 4));

        JeuService jeuService = new JeuService();

        Piece piece = Plateau.getPlateau(1, 4);
        System.out.println(Plateau.getPlateau(1, 4));

        jeuService.movePiece(piece, 2, 4, InitializerMethods.getPlateau());


        System.out.println(Plateau.getPlateau(2, 4));
        //Plateau.getPlateau(0, 0);
    }

}
