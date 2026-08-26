# gokart_pro

Docker terminal commands: 
docker container ls  
docker rm -f 'container id'
docker run -p 8000:8080 -e SPRING_DATASOURCE_URL="jdbc:postgresql://host.docker.internal:5432/GokartDB" gokartapi
docker build -t gokartapi .  

Maven commands:
mvn -v
mvn clean package -DskipTests   
