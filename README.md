# Formation API REST

:arrow_forward: [Diaporama](https://gaetan-varlet.github.io/formation-api-rest/)

## TODO
PARTIE CONSTRUCTION API
- problème sur la création du WAR
- faire une diapo sur les options des path param et des param de requêtes
- vérifier si on a besoin de toutes les variables dans la déclaration des profils
- revoir tests
- lire l'utilisateur (idep et nom par exemple) dans le jeton côté Java
- filtrage avancée avec Spring Data avec Querydsl
- gestion du cache applicatif
- comment faire un filtre avec Spring ?
- blocage avec augmentation de la version de Jersey : cf changelog

PARTIE CONSOMMATION API
- requete GET testTemplate correction header content-type
- pourquoi besoin du package-info.java pour lire le XML
- ajouter jersey client dans la conso d'API
- lecture pour conso API REST en Java :
    - Java et Jersey : http://blog.bdoughan.com/2010/08/creating-restful-web-service-part-55.html
    - RestTemplate :
        - https://www.baeldung.com/rest-template
        - https://o7planning.org/fr/11647/exemple-spring-boot-restful-client-avec-resttemplate
        - https://howtodoinjava.com/spring-restful/spring-restful-client-resttemplate-example/

## Plan

1. Introduction
	- Qu'est ce qu'un service web ? (définition et exemple)
    - Les formats de données XML et JSON

2. Le protocole HTTP
    - Définition
    - Les méthodes de requêtes (ou verbes) HTTP
    - La requête
    - La réponse
    - Les codes de statut de réponse HTTP
    - L'en-tête Content-Type
    - Structure d'une requête HTTP

3. Architecture 
    - L'architecture REST
    - L'architecture d'une application web classique à l'Insee
    - L'architecture d'une application basée sur une API
    - Intérêts : rapidité, partage d'informations instantané entre applications
    
4. Un premier exemple de mise en place d'une API en Java EE
    - Création d'une application web classique avec Maven
    - Création d'une première servlet avec JSP
    - Création d'une seconde servlet sans JSP
    - Création d'une troisième servlet sous forme d'API
    - Création d'une quatrième servlet sous forme d'API
    - Création d'une cinquième servlet avec conversion automatique au format JSON
    - Présentation de la spécification JAX-RS et exemple d'utilisation de l'implémentation Jersey

5. Consommation d'une API REST
    - Faire une requête HTTP
        - passage en revue des différentes manière de faire une requête HTTP
    - En Javascript
    - En Java
        - sans bibliothèque
        - avec RestTemplate (Spring)

6. Création d'une API REST avec Spring Boot
    - L'univers Spring
    - Spring Boot : initialisation du projet avec Spring Initializr
    - Configuration du projet : properties pour la BDD
    - Configuration du projet : properties pour la BDD (Alt PostGre)
    - Configuration du projet : utilisation de Log4j2
    - Création d'un HelloWorld
    - Ajouter de la log
    - Création de données en base
    - Création de l'objet Java correspondant
    - Création du DAO
    - Création du controller VinController
    - Création des méthodes GET-POST-PUT-DELETE sur le controller
    - Raccourci pour le mapping des verbes HTTP dans les controllers
    - Refactor : mise en place d'une couche de service
    - Filtrage sur un attribut via paramètre de requête
    - Filtrage avancé avec Spring Data
    - produces / consumes
    - reception de fichier dans un service
    - mise en place de Spring Data JPA avec H2
    - Paging et Sorting
    - @Produces et @Consumes
    - Réception d'un fichier dans un controller
    - Mise en place de Swagger
    - Injection de properties
    - Configuration de Spring Boot avec des profils
        - Création des profils local et dev dans le POM
        - Création d'un fichier de conf de log pour les plateformes du CEI
        - Création d'une property environnement
    - Gestion des erreurs avec exceptions et codes HTTP
    - Compresser la réponse
    - Keycloak avec Spring Security
    - Configuration de Swagger
    - Personnaliser la documentation des services avec Swagger
    - CORS : Cross-origin resource sharing
    - Création d'un WAR pour le déploiement au CEI
    - Les tests dans Spring Boot
    - Bonus : Bannière ASCII
    - Bonus : Gestion du cache applicatif

    - gestion des logs(à travailler)
    - bannière ASCII
    - gestion des erreurs avec exceptions et codes HTTP
    - mise en place de Swagger
    - les tests dans Spring Boot
    - Spring Security : Authentification basique, Keycloak
    - Cors
    - gestion du cache applicatif

7. Création d'une API REST avec Jersey
    - passage en revue rapide des différences avec Spring Boot

8. Documentation
    - Note de la cellule archi
        - Utilisation des verbes
        - Singulier / Pluriel
        - Numéro de version
