package exercices;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test pour l'exercice 02 :
 * - Vérifie que le fichier Exercice02.java est présent
 * - Vérifie la déclaration correcte de la classe Exercice02
 * - Vérifie la présence de la méthode main
 * - Vérifie la ligne exacte d'affichage : "System.out.println("Bonjour tout le monde!");"
 */
public class Exercice02Test {

    @Test
    public void verifierContenuFichier() {
        // Vérifie la présence du fichier Exercice02.java
        File fichier = new File("exercices/exercice02/Exercice02.java");
        // (Décommenter la ligne suivante pour tester le fichier WithErrors)
        //File fichier = new File("exercices/exercice02/Exercice02WithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier Exercice02.java n'a pas été trouvé dans le dossier exercice02.");

        // Variables pour vérifier si chaque élément est trouvé
        boolean classeTrouvee = false;
        boolean mainTrouvee = false;
        boolean messageExactTrouve = false;

        try (BufferedReader lecteur = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            // Parcourt le fichier ligne par ligne
            while ((ligne = lecteur.readLine()) != null) {
                ligne = ligne.trim(); // Nettoie les espaces avant et après

                // Vérifie la déclaration exacte de la classe
                if (ligne.equals("public class Exercice02 {")) {
                    classeTrouvee = true;
                }

                // Vérifie la présence de la méthode main
                if (ligne.equals("public static void main(String[] args) {")) {
                    mainTrouvee = true;
                }

                // Vérifie la ligne exacte d'affichage du message
                if (ligne.equals("System.out.println(\"Bonjour tout le monde!\");")) {
                    messageExactTrouve = true;
                }
            }
        } catch (Exception e) {
            fail("❌ Une erreur est survenue lors de la lecture du fichier Exercice02.java.");
        }

        // Vérifie la déclaration de la classe
        assertTrue(classeTrouvee, "❌ La classe 'Exercice02' n'a pas été correctement déclarée.");

        // Vérifie la présence de la méthode main
        assertTrue(mainTrouvee, "❌ La méthode 'main' est manquante ou incorrecte.");

        // Vérifie la ligne exacte d'affichage
        assertTrue(messageExactTrouve, "❌ La ligne 'System.out.println(\"Bonjour tout le monde!\");' est manquante ou incorrecte.");
    }
}
