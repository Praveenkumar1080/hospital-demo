FROM openjdk:11
EXPOSE 8888
ADD target/hms.jar hms.jar
ENTRYPOINT ["java","-jar","/hms.jar"]
