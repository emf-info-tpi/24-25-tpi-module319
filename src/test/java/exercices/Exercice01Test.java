package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test qui vérifie :
 * 1. La présence du fichier Exercice01.java
 * 2. La présence du commentaire "//Ceci est mon exercice 01"
 */
public class Exercice01Test {

    @Test
    public void testFichierEtCommentaire() {
        // Vérifie si le fichier Exercice01.java est bien présent dans le dossier exercices/exercice01
        File fichier = new File("exercices/exercice01/Exercice01.java");
        // (Décommenter la ligne ci-dessous pour tester la version WithErrors)
        // File fichier = new File("exercices/exercice01/Exercice01WithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier Exercice01.java n'a pas été trouvé dans le dossier exercice01.");

        boolean commentaireTrouve = false;

        try (BufferedReader br = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            // Parcours ligne par ligne du fichier pour vérifier la présence du commentaire attendu
            while ((ligne = br.readLine()) != null) {
                if (ligne.equals("//Ceci est mon exercice 01")) {
                    commentaireTrouve = true;
                    break;
                }
            }
        } catch (Exception e) {
            fail("❌ Impossible de lire le fichier Exercice01.java.");
        }

        // Vérifie que le commentaire "//Ceci est mon exercice 01" est bien présent
        assertTrue(commentaireTrouve, "⚠️ Le commentaire attendu semble absent ou incorrect. Vérifiez le contenu.");
    }
}
