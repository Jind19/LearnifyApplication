# Second stage - runtime
FROM eclipse-temurin:24-jdk
WORKDIR /app
COPY  /target/learnify-course-service-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "app.jar"]