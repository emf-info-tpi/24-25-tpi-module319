package exercices;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice02Test {

    @Test
    public void verifierContenuFichier() {
        File fichier = new File("exercices/exercice02/Exercice02.java");
        //File fichier = new File("exercices/exercice02/Exercice02WithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier Exercice02.java n'a pas été trouvé dans le dossier exercice02.");

        boolean classeTrouvee = false;
        boolean mainTrouvee = false;
        boolean messageExactTrouve = false;

        try (BufferedReader lecteur = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                ligne = ligne.trim();
                if (ligne.equals("public class Exercice02 {")) {
                    classeTrouvee = true;
                }
                if (ligne.equals("public static void main(String[] args) {")) {
                    mainTrouvee = true;
                }
                if (ligne.equals("System.out.println(\"Bonjour tout le monde!\");")) {
                    messageExactTrouve = true;
                }
            }
        } catch (Exception e) {
            fail("❌ Une erreur est survenue lors de la lecture du fichier Exercice02.java.");
        }

        assertTrue(classeTrouvee, "❌ La classe 'Exercice02' n'a pas été correctement déclarée.");
        assertTrue(mainTrouvee, "❌ La méthode 'main' est manquante ou incorrecte.");
        assertTrue(messageExactTrouve, "❌ La ligne 'System.out.println(\"Bonjour tout le monde!\");' est manquante ou incorrecte.");
    }
}
