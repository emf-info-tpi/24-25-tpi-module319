package exercices;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class Exercice08Test {

    @Test
    public void verifierPresenceBouclesExerciceBoucles1() {
        File fichier = new File("exercices/exercice08/ExerciceBoucles1/src/App.java");
        //File fichier = new File("exercices/exercice08/ExerciceBoucles1/src/AppWithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier App.java de ExerciceBoucles1 est introuvable.");

        boolean forTrouve = false;
        boolean whileTrouve = false;
        boolean doWhileTrouve = false;
        boolean affichageTrouve = false;
        boolean continueTrouve = false;
        boolean breakTrouve = false;
        boolean it1Trouve = false;
        boolean it2Trouve = false;
        boolean it3Trouve = false;
        boolean it4Trouve = false;
        boolean it5Trouve = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (ligne.contains("for")) forTrouve = true;
                if (ligne.contains("while")) whileTrouve = true;
                if (ligne.contains("do")) doWhileTrouve = true;
                if (ligne.contains("System.out.println")) affichageTrouve = true;
                if (ligne.contains("continue")) continueTrouve = true;
                if (ligne.contains("break")) breakTrouve = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier ExerciceBoucles1/App.java : " + e.getMessage());
        }

        assertTrue(forTrouve, "❌ La boucle for est manquante.");
        assertTrue(whileTrouve, "❌ La boucle while est manquante.");
        assertTrue(doWhileTrouve, "❌ La boucle do-while est manquante.");
        assertTrue(affichageTrouve, "❌ Aucun affichage trouvé dans le programme.");
        assertTrue(continueTrouve, "❌ La boucle for doit utiliser 'continue' pour sauter l'itération 3.");
        assertTrue(breakTrouve, "❌ La boucle while doit utiliser 'break' pour arrêter après l'itération 3.");
    }

    @Test
    public void verifierPresenceBouclesExerciceBoucles2() {
        File fichier = new File("exercices/exercice08/ExerciceBoucles2/src/App.java");
        //File fichier = new File("exercices/exercice08/ExerciceBoucles2/src/AppWithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier App.java de ExerciceBoucles2 est introuvable.");

        boolean forTrouve = false;
        boolean whileTrouve = false;
        boolean doWhileTrouve = false;
        boolean affichageTrouve = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (ligne.contains("for")) forTrouve = true;
                if (ligne.contains("while")) whileTrouve = true;
                if (ligne.contains("do")) doWhileTrouve = true;
                if (ligne.contains("Décollage !!")) affichageTrouve = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier ExerciceBoucles2/App.java : " + e.getMessage());
        }

        assertTrue(forTrouve, "❌ La boucle for est manquante.");
        assertTrue(whileTrouve, "❌ La boucle while est manquante.");
        assertTrue(doWhileTrouve, "❌ La boucle do-while est manquante.");
        assertTrue(affichageTrouve, "❌ L'affichage final 'Décollage !!' est manquant.");

    }
}
