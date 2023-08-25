# Devoir05 – Devinez LE nombre
## Objectifs
Réviser les concepts vus en classe et identification des sujets pas compris. Réflexion algorithmique et mise en pratique des tests, expressions, variables, boucles. 

## Travail à réaliser
Faites un nouveau programme Java dans le dossier `devoir05` nommé `devoir05`.
* Votre programme va réaliser un jeu très connu et généralement joué par deux personnes :
* la première personne pense à un nombre entre 1 et 100
* la seconde personne va essayer de deviner ce nombre et recevra à chaque fois l’une des trois indications possibles « trop petit », « trop grand » ou « Bravo, trouvé ! »
* le jeu se termine lorsque le nombre est trouvé
* Pensez d’abord à la suite des opérations qui se déroulent lorsque deux personnes joueraient réellement à ce jeu, car en Java ce sera vraiment pareil ! Pensez en particulier à ce qui se répète, dans quelles conditions cela se répète, dans quelles conditions cela ne se répète plus, …
* Lorsque vous serez au clair sur ces aspects, continuez ensuite par **écrire votre programme uniquement avec des commentaires Java** qui indiqueront ce qu’il faut faire.
* Ensuite seulement réalisez en Java le code nécessaire pour faire vos commentaires

## Exemples et format d’affichage souhaité
**Pour générer un nombre aléatoire :**
```Java
    int nbre = (int)( Math.random() * ( limiteSupComprise - limiteInfComprise + 1 )) + limiteInfComprise;
```
**Pour demander une valeur à l’utilisateur sur la console :**
```Java
// On crée un scanner pour lire sur la ligne de commande les touches pressées
Scanner scanner = new Scanner( System.in );
// Voici comment lire un entier depuis la console
System.out.print( "Entrez une valeur svp : " );
int valeur = scanner.nextInt();
scanner.nextLine(); // pour ignorer la touche RETURN
// On continue à utiliser le scanner dans le programme…
…
…
// On referme le scanner à la fin du programme
scanner.close();
```

## Restitution du devoir
Faites un commit/push avant la date limite fixée par votre enseignant.