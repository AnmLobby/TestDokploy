FROM openjdk:17-jdk-alpine

VOLUME /tmp

ADD build/libs/TestDokploy-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-Xms128m","-Xmx256m","-jar","/app.jar"]