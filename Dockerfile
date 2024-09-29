# Use uma imagem base do OpenJDK
FROM openjdk:11-jdk-slim

# Defina o diretório de trabalho dentro do container
WORKDIR /app

# Copie o arquivo JAR da aplicação para o diretório de trabalho
COPY target/FormasGeometricas.jar /app/FormasGeometricas.jar

# Comando para executar a aplicação
CMD ["java", "-jar", "FormasGeometricas.jar"]
