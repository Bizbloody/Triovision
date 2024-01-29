import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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

        
}
