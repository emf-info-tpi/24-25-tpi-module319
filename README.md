# Dépôt de correction automatique - Module 319

Ce dépôt contient les tests automatisés pour vérifier les exercices Java du module 319.  
Les tests sont exécutés automatiquement grâce à GitHub Actions dès qu’un push est effectué.

## Structure du dépôt
- `exercices/exerciceXX` : contient les exercices des élèves
- `src/test/java/exercices/...` : contient les fichiers de test JUnit
- `.github/workflows/` : contient les fichiers YAML pour exécuter les tests

## Technologies utilisées
- JUnit : tests de comportements / console
- CheckStyle : conventions de nommage
- PMD : structure du code
- Java Reflection : vérifie la présence de méthodes / variables

## Fonctionnement
1. L'élève pousse son code dans son dépôt personnel
2. GitHub Actions s’exécute automatiquement
3. Un rapport est généré et visible dans l’onglet “Actions” de GitHub
