# INF4067_Implementation_Patterns_Structuration
Implémentation des modèles de Structuration (Design patterns) en Java

## A savoir:
Tous nos devoirs sont stockés sur le repository : https://github.com/DavePhil/INF4067_Implementation_Patterns_Structuration.
Pour les fichiers et les branches sous la forme **_1, ils présentent la première version des implémentations et ceux
sous la forme **_2 la seconde version. Chaque commit a une description(cliquer les 3 petits points pour
la lire).

Dans le dossier models(de la branche main), on aura un fichier pdf contenant tous les modèles UML pour chaque
version d'implémentation.
Le README de la branche main représente une description globale, et chaque sous branche a un
readme spécifique.

### Prérequis
Avoir l'environnement Java correctement installé(JDK, JRE). Si ce n'est pas le cas, veuillez
suivre les étapes d'installation indiquées sur le site donc le lien est le suivant:
https://www.java.com/fr/download/help/download_options_fr.html.

### Tests
Chaque branche représente une version d'implémentation et un module, l'exécution se fait simplement en téléchargeant
le module sur la branche et/ou en exécutant le main correspondant.
Pour exécuter:

1. Ouvrir le projet dans un terminal (Placer vous à la racine du projet)
2. Exécuter la commande `cd src` (Pour se placer dans le dossier contenant l'exécutable)
3. (Optional) verifier avec la commande `ls` si le fichier main.java est bien présent.
4. Exécuter la commande `javac Main.java`
5. Enfin exécuter la commande `java Main`

NB: Dans le pdf du dossier model, un résultat des différentes exécutions a été présenté.

## Introduction
Dans le cadre de l'unité d'enseignement INF4067 intitulé : UML et Design Patterns, il nous a été
demandé dans cette deuxième partie du cours d'implémenter des modèles de construction. Travail étant fait,
il sera question pour nous ici de présenter un résumé.

### 1. Adapter
Le modèle adapter permet la collaboration entre les instances dont les classes ont des interface
incompatibles. Il permet de convertir l'interface d'une classe existante en une autre attendue par 
le client existant également afin qu'ils puissent collaborer. Les participants sont l'interface
qui introduit la signature des méthodes de l'objet ; le client qui est le programme ou classe
qui interagit avec les objets répondant à l'interface ; l'adaptateur est la nouvelle classe 
qui implémente les méthodes de l'interface en appellant les méthodes de l'objet adapté ; 
l'adapté est l'objet dont l'interface doit être modifié pour correspondre au participant interface
Il était question de réaliser plusieurs versions de l'adaptater. 
#### Première Version l'adapter_1
Implémentation de l'adaptation d'une classe ComposantPdf pour qu'elle puisse être utilisée
par un serveur utilisant une interface Document pour générer les documents Pdf (Exercice du cours).

#### Seconde Version l'adapter_2
Il s'agit de l'implementation de l'exemple 2 du cours il est question d'adapter une classe
qui gère les piles pour qu'elle gère les listes chainées. On utilisera dans cette version
pour la classe adaptateur un héritage de la classe adapté et une implémentation de l'interface

#### Troisième Version l'adapter_3
Il s'agit de l'implémentation de l'exemple 3 du cours. Il est question ici d'adapter une classe
Rectangle qui permet de gérer les rectangles afin qu'elle puisse être utilisée par une interface
qui gère les carrés.

#### Quatrième Version l'adapter_4
Il s'agit de l'implementation de l'exemple 2 du cours, tout à fait pareil à la version 2, à la 
seule différence que, la classe adaptateur à la place de l'héritage et de l'implementation de l'interface, elle fait une composition entre la classe adaptée avec l'adaptateur en utilisant, une 
relation entre les deux classes.

## 2. Composite
Il permet de combiner des objets en structures plus grandes. Il définit une façon de traiter 
les objets simples et les objets composites. Les participants à ce modèle sont : le component
qui déclare l'interface commune à tous les objets ; le leaf qui implémente le comportement 
élémentaire ; le composite qui implémente le comportement des composants ayant des fils, 
stocke ses fils et implémente les méthodes de gestion de ces fils. Le client utilise l'interface
component si le receveur est une feuille, la requête est directement traité, sinon le composite
retransmet la requête à ses fils pour traitement.

#### Composite_1
Il représente la première implémentation du composite. Il était question pour nous d'implémenter
le modèle générique et d'écrire la classe client qui montre l'utilisation avec un leaf ou un 
composite.

#### Composite_2
Dans la deuxième version, nous devions implémenter l'exemple du cours sur les textes. Un texte
pouvant être un paragraphe ou une section, mais la section pouvant avoir des sous sections qui 
sont des textes.
#### Composite_3
Dans la troisième version, il s'agissait d'un système de gestion de fichiers. Le système gère
des dossiers et chaque dossier peux avoir des sous dossiers et des fichiers.

## 3. Bridge
Il permet de découpler l'interface d'une classe de son implémentation ; ceci permettant à 
l'interface et son implémentation d'évoluer séparement. Cette méthode favorise, la 
composition à l'héritage. Les participants sont l'abstraction qui définit l'interface
de l'abstraction et gère une instance de l'implémentation ; le refine abstraction qui enrichit
l'interface définie par l'abstraction pour constituer une classe concrète ;
l'implementator qui définit les interfaces communes des implémentations concrètes 
; le concreteImplementator réalise concrètement l'implémentation de l'interface et enfin le 
bridge qui est le lien entre l'abstraction et l'implémentation.

#### Bridge_1
Dans la première version, il s'agissait d'implémenter l'exemple du cours, ou l'on a des formes
qui peuvent être de type différent et qui peuvent avoir des couleurs différentes.
On utilise dont le Pont pour séparer les formes de l'implémentation des couleurs.
#### Bridge_2
La version 2 du bridge, représente l'implémentation de l'exemple du cours avec l'ajout 
d'une couleur.

#### Bridge_3
La Version 3 du Bridge, représente l'implémentation de l'exemple du cours avec l'ajout 
d'une forme et d'une couleur.

## 4. Decorator
Il permet d'ajouter des dynamiquement des fonctionnalités à un objet. Cet ajout de 
fonctionnalités reste transparent vis-à-vis des clients. Il offre ainsi une alternative 
assez souple à l'héritage pour composer de nouvelles fonctionnalités. Lui assi, favorise
la composition à l'héritage. Ces participants sont : le client qui est la classe qui utilise
le décorateur pour l'ajout dynamique des fonctionnalités ; le composant abstrait qui déclare
l'interface commune pour tous les décorateurs et tous les composants concrets ; le composant 
concret qui définit les objets initiaux auxquels de nouvelles fonctionnalités doivent être
ajoutées ; Le Décorateur classe abstraite ayant une référence vers un composant ; les décorateurs
concrets qui implémente les comportements supplémentaires pouvant être ajoutés aux objets.

#### Decorator_1
Il s'agit de la seule version de ce modèle, ou nous devions reprendre l'exemple du cours 
en rajoutant dans le client plusieurs décorations. Nous avons un système disposant des 
fenêtres affichant du texte dans une zone bien définie. Le problème étant que lorsque le 
texte dépasse la zone, une partie n'est pas visible. Il fallait donc décorer cet objet du 
système de telle sorte que l'on puisse avoir un défilement horizontal et vertical. Plus 
concrètement, implémenter le diagramme de l'exemple et implémenter les décorations curseur
horizontal et curseur vertical et rédiger dans le client une décoration avec curseur vertical, 
décoration avec curseur vertical et les deux.


