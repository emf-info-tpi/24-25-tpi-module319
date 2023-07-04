# Devoir06 – Suite de valeurs
## Objectifs
Réflexion algorithmique et mise en pratique des tests, variables et boucles.
## Travail à réaliser

On vous demande d’implémenter un programme qui va créer un tableau de valeurs aléatoires. Ensuite, sur la base de ce tableau, on va effectuer différentes opérations (recherche d’une valeur, recherche du minimum et recherche du maximum).

Consignes : 
- Commencez par créer une constante TAILLE_TABLEAU de type « entiers », à laquelle vous donnerez la valeur 20 ainsi que les deux constantes VALEUR_MIN et VALEUR_MAX auxquelles vous donnerez les valeurs 0 et 50.
- Idem avec la constante VALEUR_RECHERCHEE à laquelle vous donnerez la valeur 7
- Déclarez  et  implémentez  une  méthode  intitulée genereTableau qui  acceptera  trois  paramètres  de  types « entiers » et qui retournera un tableau d’entiers remplis de valeurs aléatoires. Les paramètres permettrons d’indiquer le min et le max des valeurs aléatoires ainsi que la taille du tableau a générer.
- Déclarez et implémentez une méthode intitulée rechercheMin qui acceptera un paramètre de type « tableau  d’entiers »  et  qui  retournera  un  entier.  La  méthode  cherchera  la  valeur  minimale  dans  le  tableau passé en paramètre et la retournera.
- Déclarez et implémentez une méthode intitulée rechercheMax qui acceptera un paramètre de type « tableau  d’entiers »  et  qui  retournera  un  entier.  La  méthode  cherchera  la  valeur  maximale  dans  le  tableau passé en paramètre et la retournera.
- Déclarez et implémentez une méthode intitulée rechercheValeurqui acceptera deux paramètres et qui retournera un entier. Cette méthode permettra de chercher une valeur dans un tableau. Le premier paramètre  sera  de  type  « tableau  d’entiers »  et  contiendra  le  tableau  dans  lequel  on  cherchera  la  valeur.  Le  deuxième  paramètre  sera  de  type  « entier »  et  contiendra  la  valeur  à  rechercher.  On retournera la position (ou l’index) de lavaleur recherchée dans le tableau. Dans le cas où la valeur n’est pas trouvée, on retournera -1.

- Dans le main :
-- Déclarer  une  variable  tableau  de  type  tableau  d’entiers  et  initialisez  la  avec  la  méthode  genereTableau. Utilisez les constantes VALEUR_MIN, VALEUR_MAX et TAILLE_TABLEAU pour l’appel à cette méthode !
-- Affichez le contenu de ce tableau à la console.
-- Affichez le min et le max des valeurs contenues dans ce tableau à la console (en utilisant les méthodes précédemment rechercheMinet rechercheMax).
-- Afficher la position de la valeur VALEUR_RECHERCHEE dans le tableau (en utilisant la méthode rechercheValeur).


  ## Exemple d'affichage souhaité

Quand le nombre est trouvé (c’est le hasard qui décide)
  
```
  Tableau[0] = [31]
  Tableau[1] = [3]
  Tableau[2] = [38]
  Tableau[3] = [21]
  Tableau[4] = [44]
  Tableau[5] = [19]
  Tableau[6] = [17]
  Tableau[7] = [10]
  Tableau[8] = [14]
  Tableau[9] = [25]
  Tableau[10] = [16]
  Tableau[11] = [44]
  Tableau[12] = [9]
  Tableau[13] = [14]
  Tableau[14] = [35]
  Tableau[15] = [7]
  Tableau[16] = [38]
  Tableau[17] = [27]
  Tableau[18] = [22]
  Tableau[19] = [5]
  La plus petite valeur trouvée est : 3
  La plus grande valeur trouvée est : 44
  Le nombre [7] figure à la position [15] du tableau
```

Quand le nombre n’est pas trouvé (c’est le hasard qui décide) 
```
Tableau[0] = [40]
Tableau[1] = [25]
Tableau[2] = [23]
Tableau[3] = [49]
Tableau[4] = [31]
Tableau[5] = [16]
Tableau[6] = [29]
Tableau[7] = [16]
Tableau[8] = [8]
Tableau[9] = [27]
Tableau[10] = [8]
Tableau[11] = [20]
Tableau[12] = [47]
Tableau[13] = [39]
Tableau[14] = [22]
Tableau[15] = [2]
Tableau[16] = [10]
Tableau[17] = [12]
Tableau[18] = [21]
Tableau[19] = [30]
La plus petite valeur trouvée est : 2
La plus grande valeur trouvée est : 49
Le nombre [7] est à la position [-1] du tableau
```
## Restitution du devoir
Faites un commit/push avant la date limite fixée par votre enseignant.
