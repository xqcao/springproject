FROM maven:3-jdk-11 AS MAVEN_BUILD

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/
RUN mvn package

FROM openjdk:11-jdk

WORKDIR /app
EXPOSE 9001
COPY --from=MAVEN_BUILD /build/target/*.jar /app/departmentserviceapp.jar

ENTRYPOINT ["java", "-jar", "departmentserviceapp.jar"]
