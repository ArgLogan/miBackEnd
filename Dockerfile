FROM amazoncorretto:11-alpine-jdk //la versión de JAVA
MAINTAINER JJROMA //EL dueño de la imagen
COPY target/porfback-0.0.1-SNAPSHOT.jar porfbackapp.jar //copia el empaquetado a github se saga de target xxxx.jar
ENTRYPOINT ["java","-jar","porfbackapp.jar"] //es la primera instrición que ejecuta
