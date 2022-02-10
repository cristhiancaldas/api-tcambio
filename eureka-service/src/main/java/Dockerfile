FROM openjdk:11.0
LABEL "author"="Cristhian C.M."
VOLUME /tmp
EXPOSE 8763
ADD ./target/eureka-service-0.0.1-SNAPSHOT.jar  eureka-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "/eureka-service-0.0.1-SNAPSHOT.jar" ]