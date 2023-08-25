# Exercice 10 : Les méthodes

## Objectif
Se familiariser avec les méthodes en Java.

## Travail à réaliser
créez un nouveau fichier Java que vous nommerez `Methodes` et que vous devez créer dans le répertoire `exercice10`.
Pour chaque exercice, faites une nouvelle méthode qui sera appelée depuis votre main.

## Exercices

### La méthode qui dit bonjour
Déclarez une méthode `direBonjour` qui n'accepte aucun paramètre et qui ne retourne rien. Cette méthode va simplement afficher "Bonjour" à la console. 

### La méthode qui dit n'importe quoi 

Déclarer une méthode `dire` qui accepte un paramètre de type `String` et qui l'affiche à la console. Cette méthode <u>ne retourne rien</u>. 

### Les méthodes de la classe Math 

Expérimentez et décrivez à quoi servent les méthodes suivantes de la classes `Math`. 

 - Min 
 - Max 
 - Pow 
 - Sqrt 
 - Abs 
### La manipulation de tableaux avec les méthodes 

Pour cette partie d'exercice, créez un nouveau projet que vous nommerez "ExercicesMethodesTableaux". 

Il s'agira ici d'implémenter une méthode pour chaque algorithme décrits ci-dessous: 

1. Créer un tableau d'entiers d'un certain nombre de cellules.  

    -  La méthode prendra en paramètre la taille du tableau et retournera le nouveau tableau. 

2. Remplir un tableau avec une valeur fixe.  

    -  La méthode prendra en paramètre un tableau à remplir et la valeur fixe. Le tableau rempli sera ensuite retourné. 

3. Remplir un tableau avec des valeurs aléatoires. 

    - La méthode prendra en paramètre un tableau à remplir et retournera le tableau rempli. 

4. Déterminer la taille d'un tableau 

    - La méthode prendra en paramètre un tableau et retournera sa taille. 

5. Afficher le contenu d'un tableau 

    - La métode prendra en paramètre un tableau et ne retournera rien. 

6. Rechercher la valeur minimum d'un tableau 

    - La méthode prendra en paramètre un tableau et retournera le minimum. 

7. Rechercher la valeur maximum d'un tableau 

    - La méthode prendra en paramètre un tableau et retournera le maximum. 

8. Compter la fréquence d'une valeur dans un tableau. 

    - La méthode prendra en paramètre un tableau et une valeur. Elle retournera ensuite le nombre de fois qu'on a retrouvé cette valeur dans le tableau. 

9. Etablir la somme des valeurs contenues dans un tableau. 

    - La méthode prendra en paramètre un tableau et retournera la somme de ce tableau. 

10. Etablir la moyenne des valeurs contenues dans un tableau. 

    - La méthode prendra en paramètre un tableau et retournera la moyenne de ce tableau. 

11. Remplacer une valeur par une autre dans un tableau 

    - La méthode prendra en paramètre un tableau, une valeur à rechercher, et une valeur de remplacement. Elle retournera ensuite le tableau dans lequel les valeurs à rechercher ont été remplacées par la valeur de remplacement. 

12. Rechercher la première occurrence d'une valeur dans un tableau 

    - La méthode prendra en paramètre un tableau et une valeur à rechercher. Elle retournera ensuite la position dans le tableau de la cellule contenant, pour la première fois, la valeur à rechercher (ou -1 si la valeur n'a pas été trouvée). 

13. Rechercher la dernière occurrence d'une valeur dans un tableau 

    - La méthode prendra en paramètre un tableau et une valeur à rechercher. Elle retournera ensuite la position dans le tableau de la cellule contenant, pour la dernière fois, la valeur à rechercher (ou -1 si la valeur n'a pas été trouvée). 

Testez ensuite ces méthodes depuis le main pour obtenir la sortie suivante à la console : 

>Le tableau a une taille de 50 cellules. <br><br>
>Contenu du tableau aléatoire : <br>
>tab[0]=12 <br>
>tab[1]=14 <br>
>tab[2]=13 <br>
>… <br>
>tab[47]=5 <br>
>tab[48]=9 <br>
>tab[49]=20<br>
>La valeur min trouvée = 1 <br>
>La valeur max trouvée = 20 <br><br>
>Après remplacement de la valeur 12 par la valeur 5 voici le contenu du >tableau : <br>
>tab[0]=5  <br>
>tab[1]=14 <br>
>tab[2]=13 <br>
>… <br>
>tab[47]=5 <br>
>tab[48]=9 <br>
>tab[49]=20<br><br>
>La somme des cellules du tableau = 494 <br>
>La moyenne des cellules du tableau = 9.88 <br>
>La valeur 13 a été trouvée à la 1ère position N°2 <br>
>La valeur 13 a été trouvée à la dernière position N°28 <br>

N.B. Le contenu affiché change chaque fois!

<u>Pour terminer, documentez ces méthodes dans votre RP</u> (chapitre 3 : "Algorithmique de base – méthodes fréquemment utiles"). 

## Récapitulatif
- Découvrir les méthodes en Java
- Créer et implémenter des méthodes simple en Java
- Appeler des méthodes en Java et au besoin, reprendre la valeur de retour