FROM eclipse-temurim:17

LABEL maintainer="contato@igor.com.br"

WORKDIR /app

COPY target/aula-docker02-1.0-SNAPSHOT.jar /app/aula-docker02.jar

ENTRYPOINT ["java", "-jar", "aula-docker02.jar"]