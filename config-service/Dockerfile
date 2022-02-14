FROM openjdk:11.0
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE}  config-service-0.0.1.jar
ENTRYPOINT [ "java", "-jar", "/config-service-0.0.1.jar" ]
EXPOSE 8762
