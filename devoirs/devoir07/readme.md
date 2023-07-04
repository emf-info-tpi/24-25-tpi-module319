# Devoir07 – Méthodes et tableaux
## Objectifs
Réviser les concepts vus en classeet identification des sujets pas compris. Réflexion algorithmique et mise en pratique des tests, expressions, variables, boucles, tableaux, méthodes.

## Travail à réaliser
Faites un nouveau programme Java dans le dossier devoir07 nommé devoir07.

- Commencez par créer une constante TAILLE_TABLEAU de type «entiers», à laquelle vous donnerez la valeur 10
- Idem avec les deux constantes MIN_NOMBRE et MAX_NOMBRE auxquelles vous donnerez les valeurs -8et +8
- Idem avec la constanteVALEUR_RECHERCHEEà laquellevous donnerez la valeur 7
- Créez ensuite une méthode genererValeursAleatoires(). Cette méthode recevra 3 paramètres: le nombre de valeurs à générer, la plus petite et la plus grande valeur autorisée. Elle retournera letableau rempli de ces nombres entiers aléatoires.
- Créez ensuite une méthode positionValeur(). Cette méthode recevra 2 paramètres: un tableau de nombre entiers dans lequel chercher et une valeur à retrouver. Cette méthode retournera la première position dans le tableau où cette valeur aura été vue respectivement -1 si elle n’y figure pas.
- Utilisez ensuite ces deux méthodes dans votre main() afin de créer un tableau de nombres aléatoires puis pour rechercher la position de la valeur VALEUR_RECHERCHEE.
- Pour terminer, affichez les informations suivantes sur la console (il s'agit d'un exemple)
```
Devoir 07 du module 319 
---------------------------------------
Le tableau d'entiers généré contient : 10 valeurs
Les deux premières/dernières valeurs sont : [-7][-7] ... [7][6]
La valeur 7 figure à la position N°8 du tableau !
Voici le contenu du tableau :
Tableau[0] = -7
Tableau[1] = -7
Tableau[2] = -5
Tableau[3] = 4
Tableau[4] = -5
Tableau[5] = 2
Tableau[6] = 8
Tableau[7] = -1
Tableau[8] = 7
Tableau[9] = 6
```
  
## Restitution du devoir
Faites un commit/push avant la date limite fixée par votre enseignant.
