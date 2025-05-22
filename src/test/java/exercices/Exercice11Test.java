package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice11Test {
    @Test
    public void testFichierInversion() {
        assertTrue(new File("exercices/exercice11/ExercicesInversionTableaux/src/App.java").exists(),
            "❌ App.java manquant dans ExercicesInversionTableaux");
    }
}
