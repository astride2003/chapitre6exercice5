#  Exercice 5 – Déplacement d'une Reine en Java (POO)

Ce projet Java a été développé dans le cadre du **Chapitre 06** de l’UE **Projet Informatique 2**.  
Il met en application les notions de **héritage** et de **redéfinition de méthode** (override) dans un exemple inspiré du jeu d’échecs.

---

##  Objectifs pédagogiques

- Créer une **classe de base `Piece`** avec une méthode `estValide()`
- Créer une **classe `Reine`** qui hérite de `Piece` et redéfinit la méthode `estValide()` selon les règles des échecs
- Vérifier si un déplacement proposé est **autorisé ou non**
- Utiliser la notion de **classe interne** (`Position`) pour stocker les coordonnées

---

##  Structure du projet

 Classe et Description 
 `Position`: Contient les coordonnées `ligne` et `colonne` 
`Piece` : Classe de base avec une position et une méthode `estValide()` générique 
 `Reine` : Hérite de `Piece` et redéfinit `estValide()` pour simuler les déplacements valides d'une Reine 
`JeuEchecs` :  Contient la méthode `main()` pour tester un déplacement et afficher le résultat 

---

##  Instructions d’exécution

1. Ouvrir le projet dans **IntelliJ IDEA**
2. Ouvrir et exécuter la classe **`JeuEchecs.java`**
3. Le programme :
   - Définit une position initiale pour la Reine
   - Propose une position d’arrivée
   - Affiche si le déplacement est **autorisé ou interdit**
