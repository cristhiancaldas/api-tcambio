FROM openjdk:11.0
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} auth-service-0.0.1.jar
ENTRYPOINT [ "java", "-jar", "/auth-service.jar" ]
EXPOSE 8761
