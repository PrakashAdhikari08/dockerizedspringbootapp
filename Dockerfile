FROM openjdk:11
ADD target/first-app.jar first-app.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/first-app.jar"]