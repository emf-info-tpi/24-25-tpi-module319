package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice10Test {
    @Test
    public void testFichiersMethodes() {
        assertTrue(new File("exercices/exercice10/Methodes.java").exists(),
            "❌ Methodes.java n'a pas été trouvé dans le dossier exercice10");
        assertTrue(new File("exercices/exercice10/ExercicesMethodesTableaux/src/App.java").exists(),
            "❌ App.java n'a pas été trouvé dans le dossier ExercicesMethodesTableaux");
    }
}
