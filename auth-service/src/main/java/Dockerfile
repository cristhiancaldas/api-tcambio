FROM openjdk:11.0
LABEL "author"="Cristhian C.M."
VOLUME /tmp
EXPOSE 8761
ADD ./target/auth-service-0.0.1-SNAPSHOT.jar   auth-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "/auth-service-0.0.1-SNAPSHOT.jar" ]