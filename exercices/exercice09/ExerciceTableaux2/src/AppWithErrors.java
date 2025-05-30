package exercices.exercice09.exercicetableaux2;

public class AppWithErrors {

    public static void main(String[] args) throws Exception {
        // Erreurs intentionnelles : Pas de constantes MIN/MAX, pas de Math.random()
        int[] tableau = new int[10];

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = i + 1; // Faux : valeurs fixes
        }
    }
}
