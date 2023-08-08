import java.util.ArrayList;
import java.util.List;

public class Joueur{

    private List<Cartes> main = new ArrayList<>();

    public void ajouterCarte(List<Cartes> carte) {
        main.addAll(carte);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Cartes carte : main) {
            result.append("Carte:\n");

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
}
