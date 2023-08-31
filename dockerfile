FROM openjdk:17-jdk-alpine

RUN mkdir /files

COPY target/SpringBootSoap-0.0.1-SNAPSHOT.jar SpringBootSoap.jar

RUN chmod -R 777 /files

WORKDIR /

ENTRYPOINT ["java", "-jar", "/SpringBootSoap.jar"]