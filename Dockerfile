FROM openjdk:8-jre

COPY target/avroProtobuf-0.0.1-SNAPSHOT.jar demo.jar
COPY target/ip.avro ip.avro
COPY target/ip.bin ip.bin
COPY target/ip.json ip.json
COPY target/movie.avro movie.avro
COPY target/movies.bin movies.bin
COPY target/movies.json movies.json
COPY opentelemetry-javaagent.jar otel.jar

CMD ["java", "-javaagent:otel.jar", "-jar", "demo.jar"]




