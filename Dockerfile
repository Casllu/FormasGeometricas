FROM openjdk:17.0.9

WORKDIR /app

COPY target/FormasGeometricas.jar /app/FormasGeometricas.jar

CMD ["java", "-jar", "FormasGeometricas.jar"]