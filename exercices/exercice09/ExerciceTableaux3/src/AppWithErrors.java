package exercices.exercice09.exercicetableaux3;

public class AppWithErrors {

    public static void main(String[] args) throws Exception {
        int[] tableau = new int[10];

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = i; // Faux : pas de random, pas de MIN/MAX
        }

        // Erreur : Pas de calcul de moyenne
    }
}
