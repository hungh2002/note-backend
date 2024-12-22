FROM amazoncorretto:21-alpine-jdk

WORKDIR /app

COPY target/note.jar ./

EXPOSE 8080

ENTRYPOINT ["java","-jar","note.jar"]