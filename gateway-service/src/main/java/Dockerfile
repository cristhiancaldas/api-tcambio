FROM openjdk:11.0
LABEL "author"="Cristhian C.M."
VOLUME /tmp
EXPOSE 8764
ADD ./target/gateway-service-0.0.1-SNAPSHOT.jar  gateway-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "/gateway-service-0.0.1-SNAPSHOT.jar" ]