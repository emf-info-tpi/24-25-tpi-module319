package exercices.exercice04;

public class EchangeValeursWithErrors {

    public static void main(String[] args) {

        int VARIABLEUN = 1; // Mauvaise notation (MAJUSCULE au lieu de camelCase)
        int variableDeux = 3; // Mauvais nom de variable et mauvaise valeur (doit être 2)

        System.out.println("Le contenu de la variable1 est : " + VARIABLE1);
        // Manque l'affichage de variable2

        // Pas de message "... Traitement ..."
        // Pas de logique d'échange des valeurs

        System.out.println("Affichage final sans échange !");
        // Aucun affichage de la nouvelle valeur de variable1 ni variable2

    }
}
