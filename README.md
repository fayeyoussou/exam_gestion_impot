# Exam JEE 

## Dépendances

1. **Dépendance** : `org.springframework.boot:spring-boot-starter-data-jpa`
    - **Description** : Starter Spring Boot pour travailler avec l'API Java Persistence (JPA).
    - **Utilisation** : Permet une intégration facile de JPA dans les applications Spring Boot pour les opérations de base de données.

2. **Dépendance** : `org.springframework.boot:spring-boot-starter-thymeleaf`
    - **Description** : Starter Spring Boot pour le moteur de templates Thymeleaf.
    - **Utilisation** : Permet l'intégration transparente de modèles Thymeleaf dans les applications web Spring Boot.

3. **Dépendance** : `org.springframework.boot:spring-boot-starter-web`
    - **Description** : Starter Spring Boot pour construire des applications web.
    - **Utilisation** : Fournit les composants essentiels pour développer des applications web en utilisant Spring Boot.

4. **Dépendance** : `org.springframework.boot:spring-boot-starter-tomcat`
    - **Description** : Starter Spring Boot pour le serveur Tomcat intégré.
    - **Utilisation** : Permet d'exécuter l'application web en utilisant le serveur Tomcat intégré.

5. **Dépendance** : `org.springframework.boot:spring-boot-starter-validation`
    - **Description** : Starter Spring Boot pour la validation des objets (JSR 380).
    - **Utilisation** : Fournit des fonctionnalités de validation pour garantir l'intégrité des données dans votre application.

6. **Dépendance** : `org.springframework.boot:spring-boot-devtools`
    - **Description** : Outils de développement Spring Boot pour le redémarrage automatique de l'application.
    - **Utilisation** : Améliore l'expérience de développement en permettant le redémarrage automatique lors des changements de code.

7. **Dépendance** : `com.mysql:mysql-connector-j`
    - **Description** : Connecteur JDBC MySQL pour les applications Spring Boot.
    - **Utilisation** : Permet aux applications Spring Boot d'interagir avec les bases de données MySQL.

8. **Dépendance** : `org.projectlombok:lombok`
    - **Description** : Bibliothèque Lombok pour réduire le code boilerplate dans les classes Java.
    - **Utilisation** : Annoter les classes avec les annotations Lombok pour générer automatiquement des méthodes telles que les getters, les setters et les constructeurs.

9. **Dépendance** : `org.springframework.boot:spring-boot-starter-test`
    - **Description** : Starter Spring Boot pour les tests.
    - **Utilisation** : Fournit des utilitaires et des outils de test pour tester les applications Spring Boot.

---
**Remarque** : Assurez-vous de vous référer à la documentation officielle de chaque dépendance pour des instructions détaillées sur son utilisation et les mises à jour.
## Configuration


Dans mon application `application.yml` j'utilise des profils pour adapter les paramètres en fonction du contexte. Voici une description des profils et de leurs configurations :

### Profil `dev` pour l'environment de development
### Profil `test` pour les test
### Profil `production` pour le deploiement sur serveur tomcat


