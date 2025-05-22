package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice10Test {
    @Test
    public void testFichiersMethodes() {
        assertTrue(new File("exercices/exercice10/Methodes.java").exists(),
            "❌ Methodes.java manquant dans exercice10");
        assertTrue(new File("exercices/exercice10/ExercicesMethodesTableaux/src/App.java").exists(),
            "❌ App.java manquant dans ExercicesMethodesTableaux");
    }
}
