package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test pour l'exercice 03 :
 * - Vérifie la présence du fichier TypesDeBase.java
 * - Vérifie la structure : classe, main, variables (age, nom)
 * - Vérifie l'affichage des phrases exactes et du calcul 'age + 10'
 */
public class Exercice03Test {

    @Test
    public void verifierStructureEtVariables() {
        // Vérifie que le fichier TypesDeBase.java existe bien
        File fichier = new File("exercices/exercice03/TypesDeBase.java");
        // (Décommenter la ligne suivante pour tester le fichier WithErrors)
        //File fichier = new File("exercices/exercice03/TypesDeBaseWithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier TypesDeBase.java n'a pas été trouvé dans le dossier exercice03.");

        // Variables pour vérifier si chaque élément est trouvé
        boolean classeTrouvee = false;
        boolean mainTrouvee = false;
        boolean variableAgeTrouvee = false;
        boolean variableNomTrouvee = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            // Parcourt le fichier ligne par ligne
            while ((ligne = reader.readLine()) != null) {
                ligne = ligne.trim(); // Nettoie les espaces avant/après

                // Vérifie la déclaration de la classe
                if (ligne.startsWith("public class TypesDeBase")) classeTrouvee = true;

                // Vérifie la présence de la méthode main
                if (ligne.startsWith("public static void main")) mainTrouvee = true;

                // Vérifie la déclaration des variables
                if (ligne.contains("int age")) variableAgeTrouvee = true;
                if (ligne.contains("String nom")) variableNomTrouvee = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier TypesDeBase.java.");
        }

        // Vérifie la déclaration de la classe
        assertTrue(classeTrouvee, "❌ La classe TypesDeBase est manquante ou incorrecte.");

        // Vérifie la méthode main
        assertTrue(mainTrouvee, "❌ La méthode main est manquante.");

        // Vérifie la variable age
        assertTrue(variableAgeTrouvee, "⚠️ La variable entière 'age' est attendue.");

        // Vérifie la variable nom
        assertTrue(variableNomTrouvee, "⚠️ La variable String 'nom' est attendue.");
    }

    @Test
    public void verifierContenuAffichageExact() {
        // Vérifie que le fichier TypesDeBase.java existe bien
        File fichier = new File("exercices/exercice03/TypesDeBase.java");
        // File fichier = new File("exercices/exercice03/TypesDeBaseWithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier TypesDeBase.java n'a pas été trouvé dans le dossier exercice03.");

        // Variables pour vérifier si les phrases et le calcul sont présents
        boolean phrase1Trouvee = false;
        boolean phrase2Trouvee = false;
        boolean calculTrouve = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                ligne = ligne.trim();

                // Vérifie le message avec nom et âge
                if (ligne.contains("Je m'appelle") && ligne.contains("et j'ai")) phrase1Trouvee = true;

                // Vérifie le message "Dans 10 ans..."
                if (ligne.contains("Dans 10 ans") && ligne.contains("ans")) phrase2Trouvee = true;

                // Vérifie la présence du calcul 'age + 10'
                if (ligne.contains("age + 10")) calculTrouve = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier TypesDeBase.java.");
        }

        // Vérifie le message avec nom et âge
        assertTrue(phrase1Trouvee, "⚠️ Le message 'Je m'appelle XXX et j'ai YYY années.' est attendu.");

        // Vérifie le message 'Dans 10 ans...'
        assertTrue(phrase2Trouvee, "⚠️ Le message 'Dans 10 ans, j'aurai YYY ans.' est attendu.");

        // Vérifie le calcul 'age + 10'
        assertTrue(calculTrouve, "⚠️ Le calcul 'age + 10' est attendu.");
    }
}
