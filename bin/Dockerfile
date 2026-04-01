FROM eclipse-temurin:25-jdk

WORKDIR /app

# Copia el jar generado
COPY target/*.jar app.jar

# Puerto típico de Spring
EXPOSE 8082

# Ejecuta la app
ENTRYPOINT ["java","-jar","/app/app.jar"]