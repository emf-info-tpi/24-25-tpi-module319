# Exercice 11 : L'inverse du tableau

## Objectif
Se familiariser avec les tableaux en Java.

## Travail à réaliser
Pour commencer, créez un nouveau projet dans VSCode en choisissant `"No build tools"` que vous nommerez `ExercicesInversionTableau`. Vous pourrez ensuite implémenter toutes les méthodes dans le même projet. 

## Exercices

On vous demande de déclarer la méthode `inverseLeTableau` qui va prendre en paramètre un tableau d'entier. Le but de cette méthode est de retourner un nouveau tableau qui est l'inverse du tableau passé en paramètre. <br>

Exemple de tableau reçu :

| index       | 0    | 1    | 2    | 3   |
| ---         |---   |---   |---   |---  |
| valeur      | 12   | 5    | 8    | 14  |

Tableau retourné : 

| index       | 0    | 1    | 2    | 3   |
| ---         |---   |---   |---   |---  |
| valeur      | 14   | 8    | 5    | 12  |

Déclarez ensuite deux constantes `MIN` et `MAX` qui contiendront les entiers 0 et 100. 

Pour terminer, dans la méthode `main`, écrivez un programme qui exécute les étapes suivantes : 

1. Déclarez un tableau d'entiers nommé `tableauInitial`. 

2. Dans cette variable `tableauInitial`, affectez-y un nouveau tableau d'entiers d'une taille de 4. 

3. Pour chaque cellule du tableau `tableauInitial`, écrivez-y une valeur aléatoire comprise entre `MIN` et `MAX`. 

4. Affichez le contenu du tableau `tableauInitial`. 

5. Déclarez un nouveau tableau d'entiers nommé `tableauFinal`. 

6. Appelez la méthode `inverseLeTableau` avec, en paramètre le tableau `tableauInitial` et stockez le résultat dans la variable `tableauFinal`. 

7. Affichez le contenu du tableau `tableauFinal`. 

 

La sortie désirée à la console est la suivante : 

>Contenu du tableau initial :    <br>
>Tableau initial [0] = 12  <br>
>Tableau initial [0] = 5  <br>
>Tableau initial [0] = 8  <br>
>Tableau initial [0] = 14 <br>
> <br>
>Contenu du tableau final :  <br>
>Tableau final [0] = 14  <br>
>Tableau final [0] = 8  <br>
>Tableau final [0] = 5  <br>
>Tableau final [0] = 12 <br>

## Récapitulatif
- Se familiariser avec les tableaux en Java
- Créer des algorithmes simples avec des tableaux