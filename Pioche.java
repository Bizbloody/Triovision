import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pioche {

    Scanner scanner = new Scanner(System.in);
    private List<Cartes> pioche = new ArrayList<>();
    private List<Cartes> cartesSorties = new ArrayList<>();

    public void ajouterCarte(List<Cartes> carte) {
        cartesSorties.addAll(carte);
    }

    public void creationPioche() {
        for (int i = 0; i < 12; i++){
            this.pioche.add(new Cartes(cartesAleatoire()));
        }
    }

    public int cartesAleatoire(){
        return (int) (Math.random() * 8) + 1;
    }

    // Retirer une carte aléatoire de la pioche
    public Cartes retirerCartePioche() {
        if (!pioche.isEmpty()) {
            return pioche.remove((int) (Math.random() * pioche.size()));
        }
        return null; // Pioche vide
    }

    public Cartes retirerCarte(int index) {
        return cartesSorties.remove(index);
    }

    public boolean cartesVide(){
        return cartesSorties.isEmpty();
    }

    // Retirer plusieurs cartes (main) de la pioche
    public List<Cartes> retirerMain() {
        List<Cartes> main = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            Cartes carte = retirerCartePioche();
            if (carte != null) {
                main.add(carte);
            }
        }
        return main;
    }

    public char yesNo(){

        System.out.println("avez-vous cree le partern d'une carte? ( y/n )");
        char yesNo = scanner.next().charAt(0);

        return yesNo;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        int e = 0;

        for (Cartes carte : pioche) {
            char[][] casesC = carte.getCasesC();
            result.append("Carte");


            for (int i = 0; i < casesC.length; i++) {
                result.append("[");
                for (int j = 0; j < casesC[i].length; j++) {
                    result.append(casesC[i][j]);
                    if (j < casesC[i].length - 1) {
                        result.append(", ");
                    }
                }
                result.append("]");
                if (i < casesC.length - 1) {
                    result.append("\n     ");
                }
            }
            result.append("\n");
            result.append("\n");
        }


        for (Cartes carte : cartesSorties) {
            e++;

            result.append("Carte " + e + " :\n");

            char[][] casesC = carte.getCasesC();
            for (int i = 0; i < casesC.length; i++) {
                result.append("[");
                for (int j = 0; j < casesC[i].length; j++) {
                    result.append(casesC[i][j]);
                    if (j < casesC[i].length - 1) {
                        result.append(", ");
                    }
                }
                result.append("]");
                result.append("\n");
            }
            result.append("\n");
        }
        return result.toString();
    }

    public Cartes getCarte(int numeroCarte) {
        return cartesSorties.get(numeroCarte);
    }

}
