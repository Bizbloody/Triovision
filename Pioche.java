import java.util.ArrayList;
import java.util.List;

public class Pioche {

    private List<Cartes> pioche = new ArrayList<>();

    public void creationPioche() {
        for (int i = 0; i < 24; i++){
            this.pioche.add(new Cartes(cartesAleatoire()));
        }
    }

    public int cartesAleatoire(){
        return (int) (Math.random() * 8) + 1;
    }

    // Retirer une carte aléatoire de la pioche
    public Cartes retirerCarte() {
        if (!pioche.isEmpty()) {
            return pioche.remove((int) (Math.random() * pioche.size()));
        }
        return null; // Pioche vide
    }

    // Retirer plusieurs cartes (main) de la pioche
    public List<Cartes> retirerMain() {
        List<Cartes> main = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            Cartes carte = retirerCarte();
            if (carte != null) {
                main.add(carte);
            }
        }
        return main;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

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
            result.append("\n"); // Ajouter un retour à la ligne après chaque carte
            result.append("\n");
        }

        return result.toString();
    }
}
