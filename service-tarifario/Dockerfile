FROM openjdk:11.0
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE}  service-tarifario-0.0.1.jar
ENTRYPOINT [ "java", "-jar", "/service-tarifario-0.0.1.jar" ]
EXPOSE 8765
