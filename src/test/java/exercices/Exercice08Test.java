package exercices;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test JUnit pour l'exercice 08 :
 * Vérifie la présence des boucles et des affichages dans les exercices ExerciceBoucles1 et ExerciceBoucles2.
 */
public class Exercice08Test {

    /**
     * Vérifie le contenu du fichier ExerciceBoucles1 :
     * - Vérifie la présence des boucles for, while, do-while
     * - Vérifie la présence des affichages demandés
     * - Vérifie l'utilisation de 'continue' dans la boucle for
     * - Vérifie l'utilisation de 'break' dans la boucle while
     */
    @Test
    public void verifierPresenceBouclesExerciceBoucles1() {
        // Vérifie si le fichier App.java est bien présent
        File fichier = new File("exercices/exercice08/ExerciceBoucles1/src/App.java");
        // File fichier = new File("exercices/exercice08/ExerciceBoucles1/src/AppWithErrors.java"); // Pour tester le fichier avec erreurs si besoin
        assertTrue(fichier.exists(), "❌ Le fichier App.java de ExerciceBoucles1 est introuvable.");

        // Prépare des drapeaux pour vérifier la présence des boucles et des affichages
        boolean forTrouve = false;
        boolean whileTrouve = false;
        boolean doWhileTrouve = false;
        boolean affichageTrouve = false;
        boolean continueTrouve = false;
        boolean breakTrouve = false;

        // Lecture du fichier ligne par ligne pour détecter les éléments attendus
        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                // Vérifie la présence de la boucle for
                if (ligne.contains("for")) forTrouve = true;

                // Vérifie la présence de la boucle while
                if (ligne.contains("while")) whileTrouve = true;

                // Vérifie la présence de la boucle do-while
                if (ligne.contains("do")) doWhileTrouve = true;

                // Vérifie la présence d'au moins un affichage (System.out.println)
                if (ligne.contains("System.out.println")) affichageTrouve = true;

                // Vérifie la présence du mot clé 'continue' (pour sauter une itération)
                if (ligne.contains("continue")) continueTrouve = true;

                // Vérifie la présence du mot clé 'break' (pour interrompre la boucle)
                if (ligne.contains("break")) breakTrouve = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier ExerciceBoucles1/App.java : " + e.getMessage());
        }

        // Vérifications finales avec des messages clairs et explicites
        assertTrue(forTrouve, "❌ La boucle for est manquante.");
        assertTrue(whileTrouve, "❌ La boucle while est manquante.");
        assertTrue(doWhileTrouve, "❌ La boucle do-while est manquante.");
        assertTrue(affichageTrouve, "❌ Aucun affichage trouvé dans le programme.");
        assertTrue(continueTrouve, "❌ La boucle for doit utiliser 'continue' pour sauter l'itération 3.");
        assertTrue(breakTrouve, "❌ La boucle while doit utiliser 'break' pour arrêter après l'itération 3.");
    }

    /**
     * Vérifie le contenu du fichier ExerciceBoucles2 :
     * - Vérifie la présence des boucles for, while, do-while
     * - Vérifie la présence du message "Décollage !!" affiché
     */
    @Test
    public void verifierPresenceBouclesExerciceBoucles2() {
        // Vérifie si le fichier App.java est bien présent
        File fichier = new File("exercices/exercice08/ExerciceBoucles2/src/App.java");
        // File fichier = new File("exercices/exercice08/ExerciceBoucles2/src/AppWithErrors.java"); // Pour tester le fichier avec erreurs si besoin
        assertTrue(fichier.exists(), "❌ Le fichier App.java de ExerciceBoucles2 est introuvable.");

        // Prépare des drapeaux pour vérifier la présence des boucles et des affichages
        boolean forTrouve = false;
        boolean whileTrouve = false;
        boolean doWhileTrouve = false;
        boolean affichageTrouve = false;

        // Lecture du fichier ligne par ligne pour détecter les éléments attendus
        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                // Vérifie la présence de la boucle for
                if (ligne.contains("for")) forTrouve = true;

                // Vérifie la présence de la boucle while
                if (ligne.contains("while")) whileTrouve = true;

                // Vérifie la présence de la boucle do-while
                if (ligne.contains("do")) doWhileTrouve = true;

                // Vérifie la présence de l'affichage final "Décollage !!"
                if (ligne.contains("Décollage !!")) affichageTrouve = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier ExerciceBoucles2/App.java : " + e.getMessage());
        }

        // Vérifications finales avec des messages clairs et explicites
        assertTrue(forTrouve, "❌ La boucle for est manquante.");
        assertTrue(whileTrouve, "❌ La boucle while est manquante.");
        assertTrue(doWhileTrouve, "❌ La boucle do-while est manquante.");
        assertTrue(affichageTrouve, "❌ L'affichage final 'Décollage !!' est manquant.");
    }
}
