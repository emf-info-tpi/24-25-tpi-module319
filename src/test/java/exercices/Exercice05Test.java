package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice05Test {

    @Test
    public void testFichiersConditions() {
        String[] fichiers = {
            "ExerciceCondition1.java", "ExerciceCondition2.java",
            "ExerciceCondition3.java", "ExerciceCondition4.java"
        };

        for (String fichier : fichiers) {
            File f = new File("exercices/exercice05/" + fichier);
            assertTrue(f.exists(), "❌ Le fichier " + fichier + " est manquant.");
        }
    }
}
