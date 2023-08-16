package com.example.triovision2;


import javafx.scene.Node;
import javafx.scene.input.*;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.DragEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;



    public class Controller {

        private Joueur joueur; // Instance de Joueur
        private Plateau plateau; // Instance de Plateau
        private Circle[][] cercles = new Circle[4][4];

        // ... autres déclarations et méthodes ...

        public void initialize() {
            joueur = new Joueur(); // Initialisez votre instance de Joueur
            plateau = new Plateau(); // Initialisez votre instance de Plateau
            char[][] cases = plateau.getCasesP(); // Obtenez les cases du plateau

            for (int row = 0; row < cases.length; row++) {
                for (int col = 0; col < cases[row].length; col++) {
                    cercles[row][col] = getCercleAt(row, col);
                    // Ajoutez un System.out.println pour afficher les informations sur chaque nœud
                    System.out.println("Row: " + row + " | Col: " + col + " | Circle: " + cercles[row][col]);

                }
            }
        }

        // ... autres méthodes ...


    private double initialCircleX;
    private double initialCircleY;

    @FXML
    private GridPane grid;

    @FXML
    private Circle blue1;

    @FXML
    private Circle blue2;

    @FXML
    private Circle green1;

    @FXML
    private Circle green2;

    @FXML
    private Circle red1;

    @FXML
    private Circle red2;

    @FXML
    private Circle yellow1;

    @FXML
    private Circle yellow2;

    private boolean isDragging = false; // Pour suivre si le drag a commencé
    private Circle draggedCircle; // Pour suivre le cercle en cours de drag

    @FXML
    void onDragDetected(MouseEvent event) {
        // Récupérer le cercle en cours de drag
        draggedCircle = (Circle) event.getSource();

        // Sauvegarder la position initiale du cercle
        initialCircleX = event.getX() - draggedCircle.getLayoutX();
        initialCircleY = event.getY() - draggedCircle.getLayoutY();

        // Démarrer le drag-and-drop
        Dragboard db = draggedCircle.startDragAndDrop(TransferMode.ANY);
        ClipboardContent content = new ClipboardContent();
        content.putString(""); // Contenu vide
        db.setContent(content);

        // Afficher le cercle en déplacement (comme un "fantôme")
        draggedCircle.setOpacity(0.5);
        isDragging = true;

        event.consume();
    }


    @FXML
    void onDragOver(DragEvent event) {
        if (isDragging && event.getGestureSource() != event.getSource() && event.getDragboard().hasString()) {
            event.acceptTransferModes(TransferMode.MOVE);

            // Mettre à jour la position du cercle en fonction de la position actuelle de la souris
            draggedCircle.setLayoutX(event.getX() - initialCircleX);
            draggedCircle.setLayoutY(event.getY() - initialCircleY);
        }

        event.consume();
    }
    @FXML
    public void onDragDropped(DragEvent event) {
        if (isDragging && event.getGestureSource() != event.getSource()) {
            Circle targetCircle = (Circle) event.getGestureTarget(); // Le cercle de la case cible
            int targetRow = GridPane.getRowIndex(targetCircle);
            int targetCol = GridPane.getColumnIndex(targetCircle);

            int sourceRow = GridPane.getRowIndex(draggedCircle);
            int sourceCol = GridPane.getColumnIndex(draggedCircle);

            // Utilisez votre méthode de déplacement de pion ici
            boolean deplacementReussi = joueur.deplacerPion(plateau, sourceRow, sourceCol, targetRow, targetCol);

            if (deplacementReussi) {
                // Obtenez les cercles à partir des positions source et cible dans la grille GridPane
                Circle cercleSource = cercles[sourceRow][sourceCol];
                Circle cercleCible = cercles[targetRow][targetCol];

                // Supprimez le cercle de la position source de la grille GridPane
                grid.getChildren().remove(cercleSource);

                // Ajoutez le cercle à la position cible dans la grille GridPane
                grid.add(cercleSource, targetCol, targetRow);
            }

            event.setDropCompleted(true);
            event.consume();
        }
    }

    @FXML
    void onDragDone(DragEvent event) {
            // Réinitialiser l'opacité et le cercle en cours de drag
            draggedCircle.setOpacity(1);
            isDragging = false;

            // Rétablir la position initiale du cercle si le drag-and-drop n'a pas été effectué
            if (!event.isDropCompleted()) {
                draggedCircle.setLayoutX(initialCircleX);
                draggedCircle.setLayoutY(initialCircleY);
            }

            event.consume();
    }

        private Circle getCercleAt(int row, int col) {
            if (row >= 0 && row < cercles.length && col >= 0 && col < cercles[row].length) {
                return cercles[row][col];
            } else {
                return null; // Retourne null si les indices sont hors limites
            }
        }


    }
