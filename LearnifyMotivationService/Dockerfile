FROM eclipse-temurin:24-jdk
WORKDIR /app
COPY target/learnify-motivation-service-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]