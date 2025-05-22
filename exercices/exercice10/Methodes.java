package exercices.exercice10;

public class Methodes {
    public static void main(String[] args) {

        direBonjour();
        dire("Vive le module 319");

        System.out.println("Minimum entre 2 et 116: " + Math.min(2, 116));
        System.out.println("Maximum entre 2 et 116: " + Math.max(2, 116));
        System.out.println("2 à la puissance 116: " + Math.pow(2, 116));
        System.out.println("Racine carrée de 116: " + Math.sqrt(116));
        System.out.println("Valeurs absolues de 45 et -45 : " + Math.abs(45) + " et " + Math.abs(-45));

    }

    public static void direBonjour() {
        System.out.println("Bonjour");
    }

    public static void dire(String texte) {
        System.out.println(texte);
    }

}
