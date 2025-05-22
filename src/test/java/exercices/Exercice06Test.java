package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice06Test {
    @Test
    public void testFichiersSwitch() {
        assertTrue(new File("exercices/exercice06/ExerciceSwitch1.java").exists(),
            "❌ ExerciceSwitch1.java est manquant.");
        assertTrue(new File("exercices/exercice06/ExerciceSwitch2.java").exists(),
            "❌ ExerciceSwitch2.java est manquant.");
    }
}
