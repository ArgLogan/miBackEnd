FROM amazoncorretto:11-alpine-jdk
MAINTAINER jjroma
COPY target/porfback-0.0.1-SNAPSHOT.jar miback.jar
ENTRYPOINT ["java","-jar","/miback.jar"]