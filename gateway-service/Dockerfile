FROM openjdk:11.0
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE}  gateway-service-0.0.1.jar
ENTRYPOINT [ "java", "-jar", "/gateway-service-0.0.1.jar" ]
EXPOSE 8764
