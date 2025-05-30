package exercices.exercice11.exercicesinversiontableau.src;
public class App {
    public static void main(String[] args) throws Exception {
        String maChaineDeCaractere = "Voici du contenu stocké dans un String.";

        System.out.println(
                "Nombre de caractères contenu dans la variable maChaineDeCaractere :" + maChaineDeCaractere.length());
        System.out.println("Le mot \"contenu\" commence à la position :" + maChaineDeCaractere.indexOf("contenu"));
        System.out.println("Le position 17 contient la lettre :" + maChaineDeCaractere.charAt(17));

        String monPrenom = "John";

        for (int i = 0; i < monPrenom.length(); i++) {
            System.out.println("La lettre à la position " + i + " est : " + monPrenom.charAt(i));
        }

        String test = "test";
        if (monPrenom.contains(test)) {
            System.out.println("La chaîne de caractère \"" + monPrenom + "\" contient le texte \"" + test + "\".");
        } else {
            System.out
                    .println("La chaîne de caractère \"" + monPrenom + "\" ne contient pas le texte \"" + test + "\".");
        }

    }
}
