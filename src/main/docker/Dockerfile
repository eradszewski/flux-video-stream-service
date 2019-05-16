FROM openjdk:8-jre-alpine

EXPOSE 8081

ADD flux-video-stream-service*.jar app.jar

RUN mkdir /video
# First fix TODO set better perimssions
RUN chmod 777 -R /video
RUN /bin/sh -c 'touch /app.jar'
ENTRYPOINT ["java", "-Xmx256m", "-Xss32m", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]