package exercices.exercice05;

public class ExerciceCondition4WithErrors {
    public static void main(String[] args) {
        // Mauvais nom de variable
        int temp = 15;

        if (temp < -10) {
            System.out.println("Très froid");
        }
        if (temp >= -10 && temp < 25) {
            System.out.println("Froid");
        }
        if (temp >= 25 && temp < 35) {
            System.out.println("Moyen");
        }
        if (temp >= 35) {
            System.out.println("Chaud");
        }
    }
}
