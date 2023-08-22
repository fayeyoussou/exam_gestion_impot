# Exam JEE 

## Dépendances

1. **org.springframework.boot:spring-boot-starter-data-jpa** : Starter Spring Boot pour travailler avec l'API Java Persistence (JPA) qui facilite la communication avec la base de donnee
2. **org.springframework.boot:spring-boot-starter-thymeleaf** : Starter Spring Boot pour le moteur de templates Thymeleaf utilise ici pour configurer un serveur externe thymeleaf
3. **org.springframework.boot:spring-boot-starter-web** : Starter Spring Boot pour construire des applications web.
5. **org.springframework.boot:spring-boot-starter-tomcat** : Starter Spring Boot pour le serveur Tomcat intégré.
6. **org.springframework.boot:spring-boot-starter-validation** : Starter Spring Boot pour la validation des entree et de la valeur des objets
7. **org.springframework.boot:spring-boot-devtools** : Outils de développement Spring Boot pour le redémarrage automatique de l'application.
8. **com.mysql:mysql-connector-j** : Connecteur  MySQL pour les applications Java.
9. **org.projectlombok:lombok** : Bibliothèque Lombok pour réduire le code repetitif dans les classes Java.
10. **org.springframework.boot:spring-boot-starter-test** : Starter Spring Boot pour les tests.
**Remarque** : Assurez-vous de vous référer à la documentation officielle de chaque dépendance pour des instructions détaillées sur son utilisation et les mises à jour.
## Configuration
Dans mon application `application.yml` j'utilise des profils pour adapter les paramètres en fonction du contexte. Voici une description des profils et de leurs configurations :

**Profil `dev`** : pour l'environment de development
**Profil `test`** : pour les test
**Profil `production`** : pour le deploiement sur serveur tomcat


