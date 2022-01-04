# Backend-Spring-Cloud
Partie Back-end du projet Software-Engineering for the Cloud M2


La partie backend est composée de la base de données PostgreSQL et de l'application Java Spring.

Pour initialiser la base de données il faut effectuer la commande :
docker run -p 12321:5432 --name pgdbcloud -e POSTGRES_PASSWORD=rootpass -d postgres

Pour y accéder via pgAdmin il faut se connecter sur localhost:12321, et ce sera de même dans le fichier de configuration de Spring.

Le nom d'utilisateur et le mot de passe de l'utilisateur root de la base de donnée sont postgres/rootpass

Pour build il faut faire :

./gradlew clean build

docker build -t backspringcloud .

docker run -it -p 12322:8080 backspringcloud