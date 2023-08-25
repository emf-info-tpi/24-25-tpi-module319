# Exercice 13 : BruteForce

## Objectif
Être capable de représenter la logique d'une application à l'aide d'un structogramme. 

Développer un algorithme simple (à la suite du devoir de génération de mot de passe). 

## Travail à réaliser
L'attaque par force brute est une méthode utilisée en cryptanalyse pour trouver un mot de passe ou une clé. Il s'agit de tester, une à une, toutes les combinaisons possibles. Par exemple, pour un mot de passe ne contenant 4 caractères de type numérique, une méthode brute force testera toutes les possibilités en partant de 0000 :  

**0000** 

**0001** 

**0002** 

**…** 

**9999** 

## Définir l’algorithme 

Avec Structorizer, définissez un algorithme qui vous permettra de tester toutes les combinaisons possibles d’un mot de passe.  

Dans cet exercice, le mot de passe ne peut contenir **<u>que 4 caractères et uniquement des chiffres</u>**. 

Vous pouvez utiliser la méthode « boolean testPassword(String password) » qui testera le mot de passe pour vous et qui retournera un boolean indiquant si vous avez trouvé le bon mot de passe. 

## Codez le ! 

Cette fois-ci, le mot de passe contient **<u>5 caractères</u>**. Il peut contenir des chiffres et des lettres minuscules. Codez votre algorithme dans la méthode main en vous basant sur le code donné ci-dessous. 

Utilisez le tableau « CHARACTERS » qui liste tous les caractères disponibles pour le mot de passe. 

Utilisez la méthode testPassword en lui donnant un mot de passe et elle vous retournera si c’est le bon ou non. 

Lorsque le programme trouve le mot de passe, il doit l’afficher sur la console. 

 
```java
    public static final String PASSWORD = "YnJhdjA"; 

    public static final char[] CHARACTERS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}; 

 

    public static void main(String[] args) { 

        // Realiser le code ici 

    } 

 

    public static boolean testPassword(String password) { 

        boolean retour = false; 

        byte[] decodedBytes = Base64.getDecoder().decode(PASSWORD); 

        String decodedPwd = new String(decodedBytes); 

 

        if (password.equals(decodedPwd)) { 

            retour = true; 

        } 

        return retour; 

    } 
```