FROM openjdk:12-jdk-alpine
VOLUME /build/libs
ARG JAR_FILE
COPY ${JAR_FILE} currencyConverter.jar
ENTRYPOINT ["java", "-jar", "/currencyConverter.jar"]