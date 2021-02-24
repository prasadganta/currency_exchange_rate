FROM openjdk:8-jdk-alpine
EXPOSE 8000
ADD target/*.jar currency_exchange_rate-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar /currency_exchange_rate-0.0.1-SNAPSHOT.jar"]