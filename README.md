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

## Comment utiliser ce dépôt
### Pour les élèves :
- Tu peux utiliser ce dépôt pour vérifier automatiquement tes exercices Java.
- Une fois que tu as terminé un exercice, pousse ton code sur GitHub (via git push dans ton terminal).
- Ensuite, va dans l’onglet “Actions” de ton dépôt.
- Clique sur le workflow qui correspond à ton exercice (par exemple : Vérification Exercice 09).
- Tu verras le résultat détaillé de ton test.
- Si c’est bon, c’est marqué en vert ✅.
- Mais pense quand même à aller voir le détail dans CheckStyle et PMD (si l’exercice contient PMD) pour vérifier s’il y a des remarques à corriger.
- Si c’est pas bon, tu verras des erreurs (par exemple : ❌ La constante MIN doit être static.).
- Lis bien les messages, corrige ton code, puis pousse à nouveau.
- Refais ça jusqu’à ce que tout soit bon !
- Les erreurs sont claires et compréhensibles : elles t’aident à progresser tout seul.

### Pour les professeurs
- Ce dépôt est un système de correction automatisé pour les exercices Java du module 319.
- Pour ajouter un nouvel exercice :
- Crée un fichier de test JUnit dans src/test/java/exercices/.
- Crée un fichier .yml dans .github/workflows/.
- Copie la structure d’un fichier existant (par exemple exercice09.yml) et adapte les chemins + le nom du test.
- Vérifie le bon fonctionnement en faisant un push et en consultant les logs dans l’onglet “Actions”.
- N’oublie pas de rédiger des messages d’erreur clairs et explicites dans les tests JUnit pour aider les élèves à comprendre ce qui ne va pas.
- CheckStyle et PMD sont déjà configurés pour vérifier les conventions EMF et la structure du code.
- Ce dépôt permet aux élèves de travailler de manière autonome et aux professeurs de gagner du temps.