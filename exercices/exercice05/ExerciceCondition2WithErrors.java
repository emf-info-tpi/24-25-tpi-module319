package exercices.exercice05;

public class ExerciceCondition2WithErrors {
    public static void main(String[] args) {
        // Variable mal nommée
        int valeur = 8;

        if (valeur % 2 == 0) {
            System.out.println("Pair");
        } else {
            System.out.println("Impair");
        }
    }
}
