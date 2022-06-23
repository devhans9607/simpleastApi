FROM openjdk:11-jdk-slim
VOLUME /tmp
ARG JAR_FILE=/build/libs/jindule-api-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app.jar"]