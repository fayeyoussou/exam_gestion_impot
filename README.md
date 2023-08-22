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
## Implementation : Exemple Declaration
### entite
![image](https://github.com/fayeyoussou/exam_gestion_impot/assets/52853193/c17fa375-750d-4671-be5b-3ed1ca989e94)
### repository
 ![image](https://github.com/fayeyoussou/exam_gestion_impot/assets/52853193/5b981d7d-256c-4082-81b5-7197d57b169c)
### Service
![image](https://github.com/fayeyoussou/exam_gestion_impot/assets/52853193/fc5dd8bc-ee56-4167-adcd-aaf3e041235c)
![image](https://github.com/fayeyoussou/exam_gestion_impot/assets/52853193/60cad64c-5bdb-402c-abed-00c7ac50fa64)
### Creation d'une validation de telephone format Senegal

![image](https://github.com/fayeyoussou/exam_gestion_impot/assets/52853193/1d4d54e7-21e3-4020-a7d7-e74ded78a8ad)

<br>

![image](https://github.com/fayeyoussou/exam_gestion_impot/assets/52853193/6c92bbd3-717b-4d9d-a890-64736fdd7cea)

### conversion du DTO request
![image](https://github.com/fayeyoussou/exam_gestion_impot/assets/52853193/5f7d31cf-e17a-4021-a02b-9556f6ee4542)
### controller du Declaration
![image](https://github.com/fayeyoussou/exam_gestion_impot/assets/52853193/ed54480f-37c1-4650-bcc2-1249e80a6d2d)
### View Creation Declaration
![image](https://github.com/fayeyoussou/exam_gestion_impot/assets/52853193/aac7df99-76a2-4dac-92de-c927f27e9612)
### Lister Declaration
![image](https://github.com/fayeyoussou/exam_gestion_impot/assets/52853193/1c1fd2fb-929a-452e-b66b-5e7abf10a671)

## Interface Graphique
### Liste Declarant

![image](https://github.com/fayeyoussou/exam_gestion_impot/assets/52853193/784ca192-f241-4a4e-bcf6-c7b1dcc58c4d)

**NB  :** La liste des declarants peut etre filtre et on peut cliquer voir pour voir les declaration du declarant

### Creer Declarant
![image](https://github.com/fayeyoussou/exam_gestion_impot/assets/52853193/d2937f00-fb66-4414-b0ac-8a3d354feb4b)
### Lister Declaration
![image](https://github.com/fayeyoussou/exam_gestion_impot/assets/52853193/5b48cd59-f7bb-40fd-b189-fd5532866830)
### Paier Declaration
![image](https://github.com/fayeyoussou/exam_gestion_impot/assets/52853193/a7a73bef-30dd-4b08-af37-a58fc0f2579b)



## Integartion Continue
### Configuration maven pour nexus


