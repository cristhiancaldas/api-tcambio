FROM openjdk:11.0
LABEL "author"="Cristhian C.M."
VOLUME /tmp
EXPOSE 8766
ADD ./target/tcambio-service-0.0.1-SNAPSHOT.jar  tcambio-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "/tcambio-service-0.0.1-SNAPSHOT.jar" ]