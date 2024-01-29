import java.util.ArrayList;
import java.util.List;

public class Joueur{

    protected int point;
    protected int playing;

    public Joueur(int point, int playing){
        this.point = point;
        this.playing = playing;
    }


    public boolean deplacerPion(Plateau plateau, int row1, int col1, int row2, int col2) {
        // Vérifier si les coordonnées sont valides
        if (row2 < 0 || row2 > 3 || col2 < 0 || col2 > 3) {
            System.out.println("Coordonnées invalides. Veuillez entrer des coordonnées entre 0 et 3.");
            return false;
        }

        // Vérifier si la case d'arrivée est vide
        if (plateau.getCasesP()[row2][col2] != '-') {
            System.out.println("La case sélectionnée n'est pas vide. Veuillez choisir une case vide.");
            return false;
        }

        // Vérifier si la case de départ a un pion
        if (plateau.getCasesP()[row1][col1] == '-') {
            System.out.println("Il n'y a pas de pion sur la case. Veuillez choisir une case avec un pion.");
            return false;
        }

        // Échanger le pion avec la case vide sur le plateau
        plateau.getCasesP()[row2][col2] = plateau.getCasesP()[row1][col1];
        plateau.getCasesP()[row1][col1] = '-';
        return true;
    }

    public void quiJoue(Joueur joueur1, Joueur joueur2){
        if (joueur1.getPlaying() == 1){
            joueur1.setPlaying(0);
            joueur2.setPlaying(1);
        }
        else {
            joueur1.setPlaying(1);
            joueur2.setPlaying(0);
        }
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPlaying() {
        return playing;
    }

    public void setPlaying(int playing) {
        this.playing = playing;
    }
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
    }

}
