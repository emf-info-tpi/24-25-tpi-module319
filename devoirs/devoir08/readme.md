# Devoir08 – le générateur de mot de passe
## Objectifs
Mettre en pratique les concepts suivants qui ont été vus en classe (méthodes, String, tableau).

## Travail à réaliser
On vous demande d'implémenter un programme qui génère des mots de passe aléatoires. Voici les tâches à réaliser pour l'implémentation de ce programme :

- Déclarez une  constante  nommée CARACTERES qui  contiendra un  tableau de  String  avec  les 10 premières lettres de l'alphabète (une lettre par cellule).
- Déclarez  deux  autres  constantes  nommées NBR_ESSAI et TAILLE_MOT_DE_PASSE qui  contiendront  des entiers. Ces constantes contiendront respectivement les valeurs 5 et 15.
- Déclarez une méthode nommée genereMotDePasse. Cette méthode prendra, comme paramètre, la taille du mot de passe à générer. Le retour de la méthode sera la mot de passe généré.
- Implémentez ensuite ces méthodes en vous aidant des indications suivantes:
  * Déclarez une variable nommée resultat qui contiendra le mot de passe.
  * Affectez à la variable resultat une chaîne de caractère vide ("").
  * Réalisez une boucle qui va :
    * Choisir une position aléatoire dans le tableau CARACTERES
    * Concaténez à la variable resultatle contenu de la cellule désignée par la position calculée ci-dessus.
  * Cette boucle s'exécutera tant que la taille du mot de passe stocké dans la variable resultat n'est pas égale à la taille du mot de passe à générer qui a été passée en paramètre.

- Dans le main, réalisez une boucle qui va exécuter NBR_ESSAI fois les actions suivantes : 
  * Appel de la méthode genereMotDePasse avec TAILLE_MOT_DE_PASSE comme valeur pour le paramètre.
  * Affichage du mot de passe généré par l'appel précédent à la méthodegenereMotDePasse.

## Exemple de sortie

>jdaegdgefgbhjjd <br>
>cifheedfhhiidhf <br>
>jcbjceggchagahi <br>
>gcjidjjgifejbei <br>
>dcaeaafefbbgjbg <br>


## Restitution du devoir
Faites un commit/push avant la date limite fixée par votre enseignant.
