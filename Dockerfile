FROM eclipse-temurin:17
COPY target/unique.jar unique.jar
CMD ["java", "-jar", "unique.jar"]