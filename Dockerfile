FROM openjdk:8-jre-alpine

EXPOSE 8081

ADD admin-user-service-*.jar app.jar

RUN /bin/sh -c 'touch /app.jar'
ENTRYPOINT ["java", "-Xmx256m", "-Xss32m", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]