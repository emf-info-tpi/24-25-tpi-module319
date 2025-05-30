package exercices.exercice09.exercicetableaux4;

public class AppWithErrors {
    public static void main(String[] args) throws Exception {
        // Erreurs intentionnelles : Pas de variable nombreDepart
        int[] nombresSuivants = new int[5];

        for (int i = 0; i < nombresSuivants.length; i++) {
            nombresSuivants[i] = i; // Faux : mauvaise logique de remplissage
        }
    }
}
