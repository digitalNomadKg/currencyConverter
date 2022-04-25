FROM openjdk:12-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} currencyConverter.jar
ENTRYPOINT ["java", "-jar", "/currencyConverter.jar"]