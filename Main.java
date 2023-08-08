public class Main {
    public static void main(String[] args) {

        Pioche pioche = new Pioche();
        pioche.creationPioche();
        System.out.println(pioche.toString());

        Plateau plateau = new Plateau();
        plateau.afficherPlateau();

        /*plateau.Deplacement(3, 1, 2, 1);
        plateau.Deplacement(3, 2, 2, 2);
        plateau.afficherPlateau();

        Cartes cartes = new Cartes(8);
        cartes.afficherCarte();
        boolean patternExists = plateau.verifierPattern(cartes);

        if (patternExists) {
            System.out.println("le pattern exist");
        } else {
            System.out.println("le pattern exist pas");
        }*/

        Joueur joueur1 = new Joueur();
        Joueur joueur2 = new Joueur();

        joueur1.ajouterCarte(pioche.retirerMain());


        joueur2.ajouterCarte(pioche.retirerMain());


        System.out.println(joueur1);


    }
}