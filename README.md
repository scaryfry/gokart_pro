# gokart_pro

Docker terminal commands: 
docker container ls  
docker rm -f 'container id'
docker run -p 8000:8080 -e SPRING_DATASOURCE_URL="jdbc:mysql://host.docker.internal:3306/gokartusers" gokartapi
docker build -t gokartapi .  

Maven commands:
mvn -v
mvn clean package -DskipTests   
