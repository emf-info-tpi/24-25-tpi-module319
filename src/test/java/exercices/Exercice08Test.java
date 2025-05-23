package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice08Test {
    @Test
    public void testDossiersBoucles() {
        assertTrue(new File("exercices/exercice08/ExerciceBoucles1/src/App.java").exists(),
            "❌ App.java n'a pas été trouvé dans le chemin exercice08/ExerciceBoucle1/src/");
        assertTrue(new File("exercices/exercice08/ExerciceBoucles2/src/App.java").exists(),
            "❌ App.java n'a pas été trouvé dans le chemin exercice08/ExerciceBoucle2/src/");
    }
}
