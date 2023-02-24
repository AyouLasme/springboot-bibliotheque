---
__Advertisement :)__

- __[Spring boot ](https://start.spring.io/)__ - Site de génération de projet avec spring boot.
- __[Angular](https://angular.io/cli)__ - Site officiel Angular pour installation,configuration et la documentation.

#### Projet Bibliothèque (R) Atos Atos Digital academy

####  GROUPE JAVA : Signé 2022 - 2023 :
>>> 1. Formateur: Mr Gouguia Yannick
>>> 2. Délégué: N'Guessan Marina
>>> 3. Sous-délégué: Sango Désiré

---
## Description du projet

> Le projet consiste à mettre en place un systeme de gestion de librairie. Nous pouvons enregistrer plusieurs librairies
et pour chaque librairie, nous aurons plusieurs livres, autheur....


+ LISTE DES TACHES :
  - 0-Installation de l'environnement marven    OK
  - 1-Creation du projet spring boot      OK
  - 2- Creation de la base de donnee      OK
  - 3- Definition des tables de la base de donnee   OK
  - 4- Connexion de la base de donnée 
  - 5- Structure de l'application
  - 6- Creation du modele
  - 7- Creation des repositories
  - 8- Creation des controllers
  - 9- Creation des services 


## Tables

Règle `Ajouter des livres, pour chauque livre nous avons une ou plusieurs categories, un ou plusieurs auteurs
`




---
==Table librairies==

`Les Propiétés de la table librairies`
``` --id
    --name
    --adress
    --phone
    --email
    --gestionnaire
    --heure d'ouverture
    --heure de fermeture
    --createdat
    --updatedat

```
---

==Table books==

`Les Propiétés de la table books`
``` --id
    --librairy_id
    --title
    --description
    --isbn
    --nombre de page
    --maison d'edition
    --date de parution
    --createdat
    --updatedat

```
---

==Table categories==

`Les Propiétés de la table categories`
``` --id
    --librairy_id
    --libelle
    --createdat
    --updatedat

```
---


==Table authors==

`Les Propiétés de la table categories`
```  --id
    --librairy_id
    --fullname
    --address
    --phone
    --email
    --gender
    --createdat
    --updatedat
```
---

 ` ### Les relations`

##### - many to many:



---


==Table books_categories==

`Les Propiétés de la table books_categories`
```  --book_id
     --category_id
     --createdat
     --updatedat
```
---


==Table authors_books==

`Les Propiétés de la table authors_books`
```  --author_id
     --book_id
     --version
     --createdat
     --updatedat
```
---
    
    
