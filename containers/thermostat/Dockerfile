FROM maven:3.5-jdk-8-alpine as maven
WORKDIR /app
COPY pom.xml .
COPY src ./src/
RUN mvn clean package

FROM openjdk:8-jre-alpine
WORKDIR /app/
COPY --from=maven /app/target/*jar app.jar
EXPOSE 8080
USER nobody
CMD ["java", "-Xmx128m", "-jar", "app.jar"]


