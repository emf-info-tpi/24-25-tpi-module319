# Devoir02 – le remplissage des réservoirs
## Objectifs
Mettre en pratique les concepts suivants qui ont été vus en classe (variables, constantes, tests, boucles).
## Travail à réaliser
Faites un nouveau programme Java dans le dossier `devoir02` nommé `devoir02`.
On imagine que vous développiez le programme qui commande le remplissage de deux réservoirs. Les deux réservoirs sont matérialisés par deux variables `reservoirA` et `reservoirB` qui contiennent chacune le nombre de litres contenus dans les réservoirs respectifs. Au départ, ces réservoirs sont vides.
Voici les tâches à réaliser pour l'implémentation de ce programme :
* Déclarez deux constantes nommées `CAPACITE_RESERVOIR_A` et `CAPACITE_RESERVOIR_B` contenant deux entiers avec les valeurs respectives de 3 et 5.
* Déclarez deux variables nommées `reservoirA` et `reservoirB` qui contiendront le nombre de litres contenus dans chacun de ces réservoirs. Au départ, les deux réservoirs sont vides.
* Déclarez une variable nommée `remplissage` qui contiendra le nombre de litres à remplir.
* Pour la variable `remplissage`, affectez une valeur aléatoire comprise entre 0 et la capacité maximale des deux réservoirs (utilisez les constantes `CAPACITE_RESERVOIR_A` et `CAPACITE_RESERVOIR_B`!).
* Affichez sur la console le nombre de litres à remplir (le contenu de la variable `remplissage`).
* Réalisez une boucle qui va remplir les réservoirs
* A chaque itération,
* On remplit le bon réservoir (on commence par le réservoir A, lorsqu'il est plein, on poursuit avec le réservoir B)
* On affiche à la console le niveau des réservoirs
* La boucle s'arrête lorsqu'il n'y a plus rien à remplir.
Indication : pour la boucle, vous devez itérer tant que la somme `reservoirA` + `reservoirB` est inférieure à la variable `remplissage`!

![reservoirs](https://github.com/emf-info-319/module319/assets/125544717/419fd081-3018-4399-90c1-4a3372b6055c)

## Exemple d'affichage souhaité
>Il y a 5 litres à remplir. <br>
>Remplissage du réservoir A... <br>
>Le réservoir A : 1, le réservoir B : 0 <br>
>Remplissage du réservoir A... <br>
>Le réservoir A : 2, le réservoir B : 0 <br>
>Remplissage du réservoir A... <br>
>Le réservoir A : 3, le réservoir B : 0 <br>
>Remplissage du réservoir B... <br>
>Le réservoir A : 3, le réservoir B : 1 <br>
>Remplissage du réservoir B... <br>
>Le réservoir A : 3, le réservoir B : 2 <br>
>Remplissage terminé! <br>

## Restitution du devoir
Faites un commit/push avant la date limite fixée par votre enseignant.
