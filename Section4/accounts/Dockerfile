#Start with a base image containing java runtime
FROM eclipse-temurin:25-jdk

#Information around who maintains the image
# MAINTAINER sbbytes.com,deprecated this docker command

#Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]