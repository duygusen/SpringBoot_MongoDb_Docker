FROM openjdk:17

ADD target/springboot-mongodb-docker.jar springboot-mongodb-docker.jar

ENTRYPOINT ["java", "-jar" , "springboot-mongodb-docker.jar"]