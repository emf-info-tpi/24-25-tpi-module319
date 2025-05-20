package exercices.exercice05;

public class ExerciceCondition4 {
    public static void main(String[] args) {
        int temperature = 15;

        if (temperature < -10) {
            System.out.println("Il fait très froid");
        }
        if (temperature >= -10 && temperature < 25) {
            System.out.println("Il fait normal");
        }
        if (temperature >= 25 && temperature < 35) {
            System.out.println("Il fait chaud");
        }
        if (temperature >= 35) {
            System.out.println("Il fait très chaud");
        }
    }

}
