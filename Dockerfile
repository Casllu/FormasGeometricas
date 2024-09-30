FROM openjdk:8
EXPOSE 8080
ADD target/FormasGeometricas-1.0-SNAPSHOT.jar FormasGeometricas-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/FormasGeometricas-1.0-SNAPSHOT.jar"]