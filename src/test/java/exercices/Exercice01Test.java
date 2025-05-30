package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice01Test {

    @Test
    public void testFichierEtCommentaire() {
        File fichier = new File("exercices/exercice01/Exercice01.java");
        //File fichier = new File("exercices/exercice01/Exercice01WithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier Exercice01.java n'a pas été trouvé dans le dossier exercice01.");

        boolean commentaireTrouve = false;

        try (BufferedReader br = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                if (ligne.equals("//Ceci est mon exercice 01")) {
                    commentaireTrouve = true;
                    break;
                }
            }
        } catch (Exception e) {
            fail("❌ Impossible de lire le fichier Exercice01.java.");
        }

        assertTrue(commentaireTrouve, "⚠️ Le commentaire attendu semble absent ou incorrect. Vérifiez le contenu.");
    }
}
