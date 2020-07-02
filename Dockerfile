FROM openjdk:11-jdk-slim
VOLUME /tmp
COPY target/reload-secrets-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=9999 -jar /app.jar