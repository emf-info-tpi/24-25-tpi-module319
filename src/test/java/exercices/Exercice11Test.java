package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice11Test {
    @Test
    public void testFichierInversion() {
        assertTrue(new File("exercices/exercice11/ExercicesInversionTableau/src/App.java").exists(), "❌ App.java n'a pas été trouvé dans le dossier ExercicesInversionTableaux");
    }
}
