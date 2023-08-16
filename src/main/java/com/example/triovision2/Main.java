package com.example.triovision2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

        /*public static void main(String[] args) {

        Pioche pioche = new Pioche();
        Pioche cartesSorties = new Pioche();

        pioche.creationPioche();
        cartesSorties.ajouterCarte(pioche.retirerMain());
        Plateau plateau = new Plateau();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bonjour, combien de joueur? (1 ou 2)");

        int nbj = scanner.nextInt();
        int lignePionDepart ;
        int colonePionDepart ;
        int lignePionArrive ;
        int colonePionArrive ;
        char yesNo;
        int carte;

/////////TODO metre tous ça ↓↓↓ dans des fonctions dans Joueur car le main eest beaucoup trop long

        while (nbj < 1 || nbj > 2){
            System.out.println("1 joueur ou 2 joueurs?");
            nbj = scanner.nextInt();
        }

        System.out.println("petit rappel dans cette version console, la carré en haut a gauche à les coordonnes 0;0 et en bas a droite 3;3");

        if (nbj == 1){

            Joueur joueur1 = new Joueur(0, 1);

            while (!cartesSorties.cartesVide()){

                System.out.println("--------------------------------------------------------------------------------------------------");
                plateau.afficherPlateau();
                System.out.print(cartesSorties);
                System.out.println("ligne du pion de depart");
                lignePionDepart = scanner.nextInt();
                System.out.println("colone du pion de depart");
                colonePionDepart = scanner.nextInt();
                System.out.println("ligne du pion d'arrivé'");
                lignePionArrive = scanner.nextInt();
                System.out.println("colone du pion d'arrivé'");
                colonePionArrive = scanner.nextInt();

                joueur1.deplacerPion(plateau,lignePionDepart, colonePionDepart, lignePionArrive, colonePionArrive);

                System.out.println("avez-vous crée sur le plateau le partern d'une carte? ( y/n )");
                yesNo = scanner.next().charAt(0);

                while (yesNo != 'y' && yesNo != 'Y' && yesNo != 'n' && yesNo != 'N'){
                    System.out.println("avez-vous crée sur le plateau le partern d'une carte? ( y/n )");
                    yesNo = scanner.next().charAt(0);
                }

                if (yesNo == 'y' || yesNo == 'Y'){

                    System.out.println("Quel carte?");
                    carte = scanner.nextInt() -1;

                    boolean patternExists = plateau.verifierPattern(cartesSorties.getCarte(carte));

                    if (patternExists) {

                        System.out.println("le pattern exist, +1 point !");
                        joueur1.setPoint(joueur1.getPoint() +1);
                        cartesSorties.retirerCarte(carte);

                    } else {

                        System.out.println("le pattern exist pas");

                    }
                }
            }
            System.out.println("Bravo, tu as fait toutes les cartes et tu as remporté la partie!");

        } else {

            Joueur joueur1 = new Joueur(0, 1);
            Joueur joueur2 = new Joueur(0, 0);



            while (!cartesSorties.cartesVide()){

                if(joueur1.getPlaying() == 1){

                    System.out.println("--------------------------------------------------------------------------------------------------");
                    System.out.println("DEBUT TOUR JOUEUR 1");
                    plateau.afficherPlateau();
                    System.out.print(cartesSorties);
                    System.out.println("ligne du pion de depart");
                    lignePionDepart = scanner.nextInt();
                    System.out.println("colone du pion de depart");
                    colonePionDepart = scanner.nextInt();
                    System.out.println("ligne du pion d'arrivé'");
                    lignePionArrive = scanner.nextInt();
                    System.out.println("colone du pion d'arrivé'");
                    colonePionArrive = scanner.nextInt();

                    joueur1.deplacerPion(plateau,lignePionDepart, colonePionDepart, lignePionArrive, colonePionArrive);

                    System.out.println("avez-vous crée sur le plateau le partern d'une carte? ( y/n )");
                    yesNo = scanner.next().charAt(0);

                    while (yesNo != 'y' && yesNo != 'Y' && yesNo != 'n' && yesNo != 'N'){
                        System.out.println("avez-vous crée sur le plateau le partern d'une carte? ( y/n )");
                        yesNo = scanner.next().charAt(0);
                    }

                    if (yesNo == 'y' || yesNo == 'Y'){

                        System.out.println("Quel carte?");
                        carte = scanner.nextInt() -1;

                        boolean patternExists = plateau.verifierPattern(cartesSorties.getCarte(carte));

                        if (patternExists) {

                            System.out.println("le pattern exist, +1 point !");
                            joueur1.setPoint(joueur1.getPoint() +1);
                            cartesSorties.retirerCarte(carte);

                        } else {

                            System.out.println("le pattern exist pas");

                        }

                    } else {

                        System.out.println("Prochain joueur!");
                        joueur1.quiJoue(joueur1, joueur2);

                    }
                } else {

                    System.out.println("--------------------------------------------------------------------------------------------------");
                    System.out.println("DEBUT TOUR JOUEUR 2");
                    plateau.afficherPlateau();
                    System.out.print(cartesSorties);
                    System.out.println("ligne du pion de depart");
                    lignePionDepart = scanner.nextInt();
                    System.out.println("colone du pion de depart");
                    colonePionDepart = scanner.nextInt();
                    System.out.println("ligne du pion d'arrivé'");
                    lignePionArrive = scanner.nextInt();
                    System.out.println("colone du pion d'arrivé'");
                    colonePionArrive = scanner.nextInt();

                    joueur2.deplacerPion(plateau,lignePionDepart, colonePionDepart, lignePionArrive, colonePionArrive);

                    System.out.println("avez-vous crée sur le plateau le partern d'une carte? ( y/n )");
                    yesNo = scanner.next().charAt(0);

                    while (yesNo != 'y' && yesNo != 'Y' && yesNo != 'n' && yesNo != 'N'){
                        System.out.println("avez-vous crée sur le plateau le partern d'une carte? ( y/n )");
                        yesNo = scanner.next().charAt(0);
                    }

                    if (yesNo == 'y' || yesNo == 'Y'){

                        System.out.println("Quel carte?");
                        carte = scanner.nextInt() -1;

                        boolean patternExists = plateau.verifierPattern(cartesSorties.getCarte(carte));

                        if (patternExists) {

                            System.out.println("le pattern exist, +1 point !");
                            joueur2.setPoint(joueur2.getPoint() +1);
                            cartesSorties.retirerCarte(carte);

                        } else {

                            System.out.println("le pattern exist pas");

                        }

                    } else {

                        System.out.println("Prochain joueur!");
                        joueur1.quiJoue(joueur1, joueur2);

                    }
                }
            }
            if (joueur1.getPoint() > joueur2.getPoint()){
                System.out.println("Joueur 1 à gagner avec " + joueur1.getPoint() +" contre "+ joueur2.getPoint()+" pour le joueur 2");
            }else {
                System.out.println("Joueur 2 à gagner avec " + joueur2.getPoint() +" contre "+ joueur1.getPoint()+" pour le joueur 1");
            }
        }
    }*/

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Charger le fichier FXML
        Parent root = FXMLLoader.load(getClass().getResource("debut_plateau.fxml"));

        // Créer une scène
        Scene scene = new Scene(root);

        // Configurer le stage (fenêtre)
        primaryStage.setTitle("Votre Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
