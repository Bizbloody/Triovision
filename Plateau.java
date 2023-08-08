public class Plateau {
    private char[][] casesP;

    public Plateau() {
        // Creation du plateau initial
        this.casesP = new char[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 && (j == 1 || j == 2)) {
                    casesP[i][j] = '1';
                } else if (j == 3 && (i == 1 || i == 2)) {
                    casesP[i][j] = '2';
                } else if (i == 3 && (j == 1 || j == 2)) {
                    casesP[i][j] = '3';
                } else if (j == 0 && (i == 1 || i== 2)) {
                    casesP[i][j] = '4';
                } else {
                    casesP[i][j] = '-';
                }
            }
        }
    }

    // Affichage plateau
    public void afficherPlateau() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(casesP[i][j] + " ");
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
        if (casesP[row2][col2] != '-') {
            System.out.println("La case sélectionnée n'est pas vide. Veuillez choisir une case vide.");
            return false;
        }
        // Vérifier si la case de depart a un pion
        if (casesP[row1][col1] == '-') {
            System.out.println("Il n'y a pas de pion sur la case. Veuillez choisir une case avec un pion.");
            return false;
        }

        // Échanger le pion avec la case vide
        casesP[row2][col2] = casesP[row1][col1];
        casesP[row1][col1] = '-';
        return true;
    }

    // Méthode pour vérifier si le modèle existe dans le plateau
    public boolean verifierPattern(Cartes carte) {
        char[][] patternCarte = carte.getCasesC();
        int patternLignes = patternCarte.length;
        int patternColonnes = patternCarte[0].length;

        for (int i = 0; i <= casesP.length - patternLignes; i++) {
            for (int j = 0; j <= casesP[0].length - patternColonnes; j++) {
                boolean match = true;
                for (int k = 0; k < patternLignes; k++) {
                    for (int l = 0; l < patternColonnes; l++) {
                        if (patternCarte[k][l] != '-' && patternCarte[k][l] != casesP[i + k][j + l]) {
                            match = false;
                            break;
                        }
                    }
                    if (!match) {
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }

        return false;
    }


}


