FROM maven:3-jdk-11 AS MAVEN_BUILD

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/
RUN mvn package

FROM openjdk:11-jdk

WORKDIR /app
EXPOSE 9090
COPY --from=MAVEN_BUILD /build/target/*.jar /app/configserviceapp.jar

ENTRYPOINT ["java", "-jar", "configserviceapp.jar"]
