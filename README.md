# SpringBootDockerize
Dockerizing simple Spring boot rest application using spotify plugin

Initially, Please execute : 

mvn clean install

To run application directly execute:

mvn spring-boot:run

Docker image creation and pushing to dockerhub :

1. Please have account on dockerhub. Note down the username in my case its akshaymhetre
2. Replace repo.name in pom.xml with your username
3. Make sure you have docker installed. 
4. Run following comand and provide credentials of docker hub.: 
docker login
5. To build image run: 
mvn dockerfile:build
6. Check if image is created or not by running:  
docker images
7. To push image run:
mvn dockerfile:push
8. To run created docker image run following command with appropriate values
docker run -p 9223:9222 -t akshaymhetre/spring_boot_docker
9. Check if application is working or not by running:
localhost:9223/api/hello
