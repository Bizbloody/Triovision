package src.main.java.com.example.triovision2;

import java.util.Arrays;
///TODO malgré les sout je trouve pas le probleme ( il peut y avoir 3 fois la meme couleur ) il est surement dans pioche
public class Cartes {

    private char[][] casesC;

    public Cartes(int typeCarte){

        switch (typeCarte){
            case 1:
                this.casesC = new char[3][2];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (j == 0 && (i == 0 || i == 1 )){
                            casesC[i][j] = (char) (couleurAleatoire() + '0');
                        }else if (j == 1 && i == 2) {
                            casesC[i][j] = (char) (couleurAleatoire() + '0');
                            while(casesC[0][0] == casesC[1][0] && casesC[0][0] == casesC[i][j]){
                               /* System.out.println("1");
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[0][0]);
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[1][0]);
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[i][j]);*/
                                casesC[i][j] = (char) (couleurAleatoire() + '0');
                                /*System.out.println("Nouvelle couleur générée : " + casesC[i][j]);*/
                            }
                        }else {
                            casesC[i][j] = '-';
                        }
                    }
                }
                break;
            case 2:
                this.casesC = new char[3][2];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (j == 1 && (i == 0 || i == 1 )){
                            casesC[i][j] = (char) (couleurAleatoire() + '0');
                        }else if (j == 0 && i == 2) {
                            casesC[i][j] = (char) (couleurAleatoire() + '0');
                            while(casesC[0][1] == casesC[1][1] && casesC[0][1] == casesC[i][j]){
                                /*System.out.println("2");
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[0][1]);
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[1][1]);
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[i][j]);*/
                                casesC[i][j] = (char) (couleurAleatoire() + '0');
                                /*System.out.println("Nouvelle couleur générée : " + casesC[i][j]);*/
                            }
                        }else {
                            casesC[i][j] = '-';
                        }
                    }
                }
            break;
            case 3:
                this.casesC = new char[3][2];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (j == 0 && (i == 1 || i == 2 )){
                            casesC[i][j] = (char) (couleurAleatoire() + '0');
                        }else if (j == 1 && i == 0) {
                            casesC[i][j] = (char) (couleurAleatoire() + '0');
                            while(casesC[2][0] == casesC[1][0] && casesC[2][0] == casesC[i][j]){
                               /* System.out.println("3");
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[2][0]);
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[1][0]);
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[i][j]);*/
                                casesC[i][j] = (char) (couleurAleatoire() + '0');
                               /* System.out.println("Nouvelle couleur générée : " + casesC[i][j]);*/
                            }
                        }else {
                            casesC[i][j] = '-';
                        }
                    }
                }
            break;
            case 4:
                this.casesC = new char[3][2];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (j == 1 && (i == 1 || i == 2 )){
                            casesC[i][j] = (char) (couleurAleatoire() + '0');
                        }else if (j == 0 && i == 0) {
                            casesC[i][j] = (char) (couleurAleatoire() + '0');
                            while(casesC[2][1] == casesC[1][1] && casesC[2][1] == casesC[i][j]){
                                /*System.out.println("4");
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[2][1]);
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[1][1]);
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[i][j]);*/
                                casesC[i][j] = (char) (couleurAleatoire() + '0');
                                /*System.out.println("Nouvelle couleur générée : " + casesC[i][j]);*/
                            }
                        }else {
                            casesC[i][j] = '-';
                        }
                    }
                }
            break;
            case 5:
                this.casesC = new char[2][3];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i == 0 && (j == 1 || j == 2 )){
                            casesC[i][j] = (char) (couleurAleatoire() + '0');
                        }else if (i == 1 && j == 0) {
                            casesC[i][j] = (char) (couleurAleatoire() + '0');
                            while(casesC[0][2] == casesC[0][1] && casesC[0][2] == casesC[i][j]){
                                /*System.out.println("5");
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[0][2]);
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[0][1]);
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[i][j]);*/
                                casesC[i][j] = (char) (couleurAleatoire() + '0');
                                /*System.out.println("Nouvelle couleur générée : " + casesC[i][j]);*/
                            }
                        }else {
                            casesC[i][j] = '-';
                        }
                    }
                }
                break;
            case 6:
                this.casesC = new char[2][3];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i == 1 && (j == 1 || j == 2 )){
                            casesC[i][j] = (char) (couleurAleatoire() + '0');
                        }else if (i == 0 && j == 0) {
                            casesC[i][j] = (char) (couleurAleatoire() + '0');
                            while(casesC[1][1] == casesC[1][2] && casesC[1][1] == casesC[i][j]){
                                /*System.out.println("6");
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[1][1]);
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[1][2]);
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[i][j]);*/
                                casesC[i][j] = (char) (couleurAleatoire() + '0');
                                /*System.out.println("Nouvelle couleur générée : " + casesC[i][j]);*/
                            }
                        }else {
                            casesC[i][j] = '-';
                        }
                    }
                }
                break;
            case 7:
                this.casesC = new char[2][3];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i == 0 && (j == 0 || j == 1 )){
                            casesC[i][j] = (char) (couleurAleatoire() + '0');
                        }else if (i == 1 && j == 2) {
                            casesC[i][j] = (char) (couleurAleatoire() + '0');
                            while(casesC[0][0] == casesC[0][1] && casesC[0][0] == casesC[i][j]){
                                /*System.out.println("7");
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[0][0]);
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[0][1]);
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[i][j]);*/
                                casesC[i][j] = (char) (couleurAleatoire() + '0');
                                /*System.out.println("Nouvelle couleur générée : " + casesC[i][j]);*/
                            }
                        }else {
                            casesC[i][j] = '-';
                        }
                    }
                }
                break;
            case 8:
                this.casesC = new char[2][3];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i == 1 && (j == 0 || j == 1 )){
                            casesC[i][j] = (char) (couleurAleatoire() + '0');
                        }else if (i == 0 && j == 2) {
                            casesC[i][j] = (char) (couleurAleatoire() + '0');
                            while(casesC[1][0] == casesC[1][1] && casesC[1][0] == casesC[i][j]){
                               /* System.out.println("8");
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[1][0]);
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[1][1]);
                                System.out.println("Doublon détecté. Couleur existante : " + casesC[i][j]);*/
                                casesC[i][j] = (char) (couleurAleatoire() + '0');
                               /* System.out.println("Nouvelle couleur générée : " + casesC[i][j]);*/
                            }
                        }else {
                            casesC[i][j] = '-';
                        }
                    }
                }
                break;
        }
    }

    public int couleurAleatoire(){
        return (int) (Math.random() * 4) + 1;
    }

    public void afficherCarte() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(casesC[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Méthode pour accéder aux casesC de la carte
    public char[][] getCasesC() {
        return casesC;
    }

    @Override
    public String toString() {
        return "Cartes{" +
                "casesC=" + Arrays.toString(casesC) +
                '}';
    }
}