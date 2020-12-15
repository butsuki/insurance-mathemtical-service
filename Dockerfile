FROM openjdk:15.0.1
COPY build/libs/*.jar build/libs/App.jar
ENTRYPOINT ["java","-jar","build/libs/App.jar"]