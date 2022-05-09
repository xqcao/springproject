FROM maven:3-jdk-11 AS MAVEN_BUILD

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/
RUN mvn package

FROM openjdk:11-jdk

WORKDIR /app
EXPOSE 9191
COPY --from=MAVEN_BUILD /build/target/*.jar /app/gatewayserviceapp.jar

ENTRYPOINT ["java", "-jar", "gatewayserviceapp.jar"]
