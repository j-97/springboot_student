From java:8-jdk-alpine
RUN mkdir /usr/app
COPY ./target/Student-0.0.1-SNAPSHOT.jar /usr/app
WORKDIR /usr/app
entrypoint java -jar Student-0.0.1-SNAPSHOT.jar