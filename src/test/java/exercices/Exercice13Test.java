package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice13Test {

    @Test
    public void testFichierPresentEtBienNomme() {
        File fichier = new File("exercices/exercice13/BruteForce.java");
        assertTrue(fichier.exists(), "❌ Le fichier 'BruteForce.java' est manquant dans le dossier 'exercice13'.");
    }
}
