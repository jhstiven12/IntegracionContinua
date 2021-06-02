FROM openjdk:8-alpine
VOLUME /tmp
EXPOSE 8090
COPY ./target/RSGetClientId.jar RSGetClientId.jar
ENTRYPOINT ["java","-jar","/RSGetClientId.jar"]


