public class Plateau {
    private char[][] cases;

    public Plateau() {
        // Creation du plateau initial
        this.cases = new char[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 && (j == 1 || j == 2)) {
                    cases[i][j] = 1;
                } else if (j == 3 && (i == 1 || i == 2)) {
                    cases[i][j] = 2;
                } else if (i == 3 && (j == 1 || j == 2)) {
                    cases[i][j] = 3;
                } else if (j == 0 && (i == 1 || i== 2)) {
                    cases[i][j] = 4;
                } else {
                    cases[i][j] = '-';
                }
            }
        }
    }

    // Affichage plateau
    public void afficherPlateau() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(cases[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Méthode pour échanger un pion avec la case vide
    public boolean Deplacement(int row1, int col1, int row2, int col2) {
        // Vérifier si les coordonnées sont valides
        if (row2 < 0 || row2 > 3 || col2 < 0 || col2 > 3) {
            System.out.println("Coordonnées invalides. Veuillez entrer des coordonnées entre 0 et 3.");
            return false;
        }

        // Vérifier si la case d'arrivée est vide
        if (cases[row2][col2] != '-') {
            System.out.println("La case sélectionnée n'est pas vide. Veuillez choisir une case vide.");
            return false;
        }
        // Vérifier si la case de depart a un pion
        if (cases[row1][col1] == '-') {
            System.out.println("Il n'y a pas de pion sur la case. Veuillez choisir une case avec un pion.");
            return false;
        }

        // Échanger le pion avec la case vide
        cases[row2][col2] = cases[row1][col1];
        cases[row1][col1] = '-';
        return true;
    }
}



