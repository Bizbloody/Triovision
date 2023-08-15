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


}
