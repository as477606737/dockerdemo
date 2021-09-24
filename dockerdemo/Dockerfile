FROM java:8
VOLUME /tmp
ADD target/dockerdemo-0.0.1-SNAPSHOT.jar dockerdemo.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dockerdemo.jar"]
