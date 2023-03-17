
FROM amazoncorretto:11-alpine3.17-jdk
MAINTAINER JJROMA
COPY target/porfback-0.0.1-SNAPSHOT.jar porfbackapp.jar
ENTRYPOINT ["java","-jar","/porfbackapp.jar"]
