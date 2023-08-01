public class Main {
    public static void main(String[] args) {
        Plateau plateau = new Plateau();
        plateau.afficherPlateau();

        plateau.Deplacement(0, 2, 2, 2);
        plateau.afficherPlateau();

        Cartes cartes = new Cartes(4);
        cartes.afficherCarte();
    }
}