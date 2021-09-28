FROM maven:latest AS build-stage
COPY . /build
WORKDIR /build
RUN mvn clean package

FROM openjdk:11 AS runtime
WORKDIR /jar-file
COPY --from=build-stage /build/target/Spring-Final-Project-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

