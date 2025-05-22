package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice13Test {

    @Test
    public void testFichierPresentEtBienNomme() {
        File fichier = new File("exercices/exercice13/Exercice13.java");
        assertTrue(fichier.exists(), "❌ Le fichier 'Exercice13.java' est manquant dans le dossier 'exercice13'.");
    }
}
