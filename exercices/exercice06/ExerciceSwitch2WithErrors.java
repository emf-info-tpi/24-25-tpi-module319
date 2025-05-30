package exercices.exercice06;

public class ExerciceSwitch2WithErrors {
    public static void main(String[] args) {
        int Age = 10; // Erreur : majuscule non conforme (CheckStyle)

        // if sans accolade (PMD)
        if (Age == 7)
            System.out.println("Poussin");
        else if (Age == 8 || Age == 9)
            System.out.println("Pupille");
        else if (Age == 10 || Age == 11)
            System.out.println("Minime");
        else
            System.out.println("Inconnu");

        // switch sans default (PMD)
        switch (Age) {
            case 7:
                System.out.println("Poussin");
                break;
            case 8:
            case 9:
                System.out.println("Pupille");
                break;
            case 10:
            case 11:
                System.out.println("Minime");
                break;
        }
    }
}
