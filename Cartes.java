public class Cartes extends Plateau{

    private int x;
    private char[][] cases;
    public Cartes(int x){

        switch (x){
            case 1:
                this.cases = new char[3][2];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (j == 0 && (i == 0 || i == 1 )){
                            cases[i][j] = (char) (couleurAleatoire() + '0');
                        }else if (j == 1 && i == 2) {
                            cases[i][j] = (char) (couleurAleatoire() + '0');
                            while(cases[0][0] == cases[0][1] && cases[0][0] == cases[i][j]){
                                cases[i][j] = (char) (couleurAleatoire() + '0');
                            }
                        }else {
                            cases[i][j] = '-';
                        }
                    }
                }
                break;
            case 2:
                this.cases = new char[3][2];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (j == 1 && (i == 0 || i == 1 )){
                            cases[i][j] = (char) (couleurAleatoire() + '0');
                        }else if (j == 0 && i == 2) {
                            cases[i][j] = (char) (couleurAleatoire() + '0');
                            while(cases[1][0] == cases[1][1] && cases[1][0] == cases[i][j]){
                                cases[i][j] = (char) (couleurAleatoire() + '0');
                            }
                        }else {
                            cases[i][j] = '-';
                        }
                    }
                }
            break;
            case 3:
                this.cases = new char[3][2];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (j == 0 && (i == 1 || i == 2 )){
                            cases[i][j] = (char) (couleurAleatoire() + '0');
                        }else if (j == 1 && i == 0) {
                            cases[i][j] = (char) (couleurAleatoire() + '0');
                            while(cases[2][0] == cases[1][0] && cases[2][0] == cases[i][j]){
                                cases[i][j] = (char) (couleurAleatoire() + '0');
                            }
                        }else {
                            cases[i][j] = '-';
                        }
                    }
                }
            break;
            case 4:
                this.cases = new char[3][2];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (j == 1 && (i == 1 || i == 2 )){
                            cases[i][j] = (char) (couleurAleatoire() + '0');
                        }else if (j == 0 && i == 0) {
                            cases[i][j] = (char) (couleurAleatoire() + '0');
                            while(cases[2][1] == cases[1][1] && cases[2][1] == cases[i][j]){
                                cases[i][j] = (char) (couleurAleatoire() + '0');
                            }
                        }else {
                            cases[i][j] = '-';
                        }
                    }
                }
            break;
        }

    }

    public int couleurAleatoire(){
        int couleurCase = (int) (Math.random() * 4) + 1;
        return couleurCase;
    }

    public void afficherCarte() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(cases[i][j] + " ");
            }
            System.out.println();
        }
    }
}