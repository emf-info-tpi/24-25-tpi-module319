# Devoir10 - Calculer PI
## Objectifs
Mettre en pratique les concepts suivants qui ont été vus en classe (méthodes, tableaux, boucles). 

## Informations
Comment ? Quoi ?? Calculer PI ??? Pas de panique ! 
La méthode simple et géniale de MonteCarlo permet de le faire facilement !

L’idée est la suivante : on génère aléatoirement des points (c’est-à-dire une coordonnée x et y aléatoires) dans un carré dont on connaît le côté. Pour faire simple, on prendra un carré dont le côté vaut 1. Dès lors, la surface de la zone verte vaudra π/4. 

Il  suffit  ensuite  de  vérifier  si  le  point  aléatoirement  généré  est  dans  le  quart  de  cercle  ou  pas  (en  calculant  l’hypoténuse et en vérifiant si celle-ci est ≤ 1). On va simplement compter le nombre de points qui seront dans la « zone verte ».

Du  coup,  avec  cette  méthode  géniale,  en  générant  suffisamment  de  points  aléatoires,  on  peut  estimer  le  nombre π de manière simple : le rapport du nombre de points dans la zone verte et le nombre total de points générés aura la même valeur que le rapport des surfaces verte et rouge et vaudra π/4.:

![image](https://github.com/emf-info-319/module319/assets/48353440/48f46af9-7ef7-47aa-a5aa-d2bc40f1b4ab)

On pourra donc estimer π avec la formule suivante :

![image](https://github.com/emf-info-319/module319/assets/48353440/392ebe1f-ed58-455e-928f-7e910ac290cd)


## Travail à réaliser

Faites un nouveau programme Java nommé MonteCarloPI dans le dossier devoir10.

- Votre programme va commencer par déclarer une constante entière NBRE_ESSAIS avec la valeur 100’000.
- Cette constante représente le nombre de points aléatoires qu’il faudra générer.
- Ecrivez  l’algorithme  nécessaire  pour  produire  ces  points  aléatoires,  vérifier  s’ils  sont  dans  la  zone  verte et au final, afficher l’estimation de π obtenue.


## Exemple de sortie

>pi =~ 3.14668

N’utilisez que des instructions « if », « for » et « sout », ainsi que des variables et expressions pour résoudre cet exercice !

## Restitution du devoir
Faites un commit/push avant la date limite fixée par votre enseignant.
