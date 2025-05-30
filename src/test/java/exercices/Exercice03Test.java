package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice03Test {

    @Test
    public void verifierStructureEtVariables() {
        File fichier = new File("exercices/exercice03/TypesDeBase.java");
        //File fichier = new File("exercices/exercice03/TypesDeBaseWithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier TypesDeBase.java n'a pas été trouvé dans le dossier exercice03.");

        boolean classeTrouvee = false;
        boolean mainTrouvee = false;
        boolean variableAgeTrouvee = false;
        boolean variableNomTrouvee = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                ligne = ligne.trim();
                if (ligne.startsWith("public class TypesDeBase")) classeTrouvee = true;
                if (ligne.startsWith("public static void main")) mainTrouvee = true;
                if (ligne.contains("int age")) variableAgeTrouvee = true;
                if (ligne.contains("String nom")) variableNomTrouvee = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier TypesDeBase.java.");
        }

        assertTrue(classeTrouvee, "❌ La classe TypesDeBase est manquante ou incorrecte.");
        assertTrue(mainTrouvee, "❌ La méthode main est manquante.");
        assertTrue(variableAgeTrouvee, "⚠️ La variable entière 'age' est attendue.");
        assertTrue(variableNomTrouvee, "⚠️ La variable String 'nom' est attendue.");
    }

    @Test
    public void verifierContenuAffichageExact() {
        File fichier = new File("exercices/exercice03/TypesDeBase.java");
        //File fichier = new File("exercices/exercice03/TypesDeBaseWithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier TypesDeBase.java n'a pas été trouvé dans le dossier exercice03.");

        boolean phrase1Trouvee = false;
        boolean phrase2Trouvee = false;
        boolean calculTrouve = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                ligne = ligne.trim();
                if (ligne.contains("Je m'appelle") && ligne.contains("et j'ai")) phrase1Trouvee = true;
                if (ligne.contains("Dans 10 ans") && ligne.contains("ans")) phrase2Trouvee = true;
                if (ligne.contains("age + 10")) calculTrouve = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier TypesDeBase.java.");
        }

        assertTrue(phrase1Trouvee, "⚠️ Le message 'Je m'appelle XXX et j'ai YYY années.' est attendu.");
        assertTrue(phrase2Trouvee, "⚠️ Le message 'Dans 10 ans, j'aurai YYY ans.' est attendu.");
        assertTrue(calculTrouve, "⚠️ Le calcul 'age + 10' est attendu.");
    }
}
