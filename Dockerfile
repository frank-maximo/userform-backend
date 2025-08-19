#Use a Gradle image to build the project
FROM gradle:8.2.1-jdk17 AS builder
COPY --chown=gradle:gradle . /home/gradle/project
WORKDIR /home/gradle/project
RUN ./gradlew clean build --no-daemon

#Use a lightweight Java image to run the built JAR
FROM openjdk:17-jdk-slim
EXPOSE 8080
COPY --from=builder /home/gradle/project/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]