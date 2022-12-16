FROM eclipse-temurin:17

COPY . .

CMD ["java", "-jar", "uberjar.jar"]