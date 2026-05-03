# Use an official OpenJDK runtime as a parent image
FROM eclipse-temurin:17-jdk-focal


# Set the working directory inside the container
WORKDIR /src

# Copy the Spring Boot application JAR file into the container
# Replace 'your-application.jar' with the actual name of your compiled JAR
COPY target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar.original.jar

# Expose the port on which the Spring Boot application will run
EXPOSE 8005

# Define the command to run the application when the container starts
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar.original.jar"]