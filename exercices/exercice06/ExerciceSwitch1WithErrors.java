package exercices.exercice06;

public class ExerciceSwitch1WithErrors {
    public static void main(String[] args) {
        int NoteDuModule = 6; // Erreur : majuscule non conforme (CheckStyle)

        // Manque d'accolades pour if/else (PMD)
        if (NoteDuModule == 1)
            System.out.println("Travail non rendu");
        else if (NoteDuModule == 2)
            System.out.println("Très insuffisant");
        else if (NoteDuModule == 3)
            System.out.println("Insuffisant");
        else if (NoteDuModule == 4)
            System.out.println("Suffisant");
        else if (NoteDuModule == 5)
            System.out.println("Bien");
        else if (NoteDuModule == 6)
            System.out.println("Très bien");

        // Switch sans default (PMD)
        switch (NoteDuModule) {
            case 1:
                System.out.println("Travail non rendu");
                break;
            case 2:
                System.out.println("Très insuffisant");
                break;
        }
    }
}
