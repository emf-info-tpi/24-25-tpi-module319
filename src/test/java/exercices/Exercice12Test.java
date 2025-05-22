package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice12Test {
    @Test
    public void testFichierString() {
        assertTrue(new File("exercices/exercice12/ExercicesString/src/App.java").exists(),
            "❌ App.java n'a pas été trouvé dans le dossier ExercicesString");
    }
}
