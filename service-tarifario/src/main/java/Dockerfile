FROM openjdk:11.0
LABEL "author"="Cristhian C.M."
VOLUME /tmp
EXPOSE 8765
ADD ./target/service-tarifario-0.0.1-SNAPSHOT.jar  service-tarifario-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "/service-tarifario-0.0.1-SNAPSHOT.jar" ]