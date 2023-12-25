package com.example.echecsjeu;

import com.example.echecsjeu.Jeu.InitializerMethods;
import com.example.echecsjeu.Jeu.Plateau;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EchecsJeuApplication {

    public static void main(String[] args) {
        SpringApplication.run(EchecsJeuApplication.class, args);

        //InitializerMethods initializerMethods = new InitializerMethods();

        InitializerMethods.initPieces();

        System.out.println(Plateau.getPlateau(0, 4));

        //Plateau.getPlateau(0, 0);
    }

}
