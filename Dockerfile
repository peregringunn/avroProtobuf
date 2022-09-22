FROM openjdk:8-jre

COPY target/avroProtobuf-0.0.1-SNAPSHOT.jar demo.jar
COPY /avro /avro
COPY /json /json
COPY /proto /proto
COPY opentelemetry-javaagent.jar otel.jar

CMD ["java", "-javaagent:otel.jar", "-jar", "demo.jar"]




