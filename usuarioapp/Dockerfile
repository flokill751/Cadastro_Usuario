# Usar imagem do Java 17 (ou a versão que você está usando)
FROM openjdk:17-jdk-alpine

# Nome do arquivo jar (mude se for diferente)
ARG JAR_FILE=target/usuarioapp-0.0.1-SNAPSHOT.jar

# Copiar o jar para dentro do container
COPY ${JAR_FILE} app.jar

# Rodar a aplicação
ENTRYPOINT ["java","-jar","/app.jar"]
