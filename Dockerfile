FROM alpine/git as clone 

WORKDIR /calc

RUN git clone https://github.com/nidhibudhraja/DevopsToolChainDemo.git



FROM maven:3.5-jdk-8-alpine as build 

WORKDIR /calc

COPY --from=clone /calc/DevopsToolChainDemo .
RUN mvn install




FROM openjdk:8-jre-alpine

WORKDIR /calc

COPY --from=build calc/target/calculator-1.0-SNAPSHOT.jar calc

CMD ["java -jar calculator-1.0-SNAPSHOT.jar"]
