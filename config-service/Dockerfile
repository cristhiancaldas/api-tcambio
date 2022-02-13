FROM openjdk:11.0
LABEL "author"="Cristhian C.M."
VOLUME /tmp
EXPOSE 8762
ADD ./target/config-service-0.0.1-SNAPSHOT.jar  config-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "/config-service-0.0.1-SNAPSHOT.jar" ]