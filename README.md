# <div align="center">Risk Countries API</div>

This application maps data from an API and provides information about countries.

## Get Started

To run the project, follow this instruction:

1. Clone the repository:
   ```bash
   git clone https://github.com/vadymhrnk/risk-countries-api.git
   ```

2. Download [JDK](https://www.oracle.com/java/technologies/downloads/), [Apache Maven](https://maven.apache.org/download.cgi) and [Docker](https://docs.docker.com/get-docker/)

3. Build the project using:
   ```bash
   mvn clean package 
   ```
 
4. Use Docker to build an image and run container:
   ```bash
   docker-compose -f docker-compose.yml -p risk-countries-api up -d
   ```

## Technologies used

- ### Backend Technologies
    - **Java 17**: the primary programming language for backend development.
    - **Spring Boot**: the framework for building and deploying Java-based applications with ease.
    - **Spring Boot Starter Data JPA**: starter for using Spring Data JPA with Hibernate.
    - **Spring Boot Starter Web**: starter for building web applications, including RESTful APIs.
    - **H2 Database**: an in-memory database for testing purposes.
    - **PostgreSQL Driver**: driver for PostgreSQL integration.
    - **Lombok**: a tool to reduce boilerplate code, enhancing code readability and conciseness.
    - **Spring Boot Starter Test**: starter for testing Spring Boot applications.
    - **MapStruct**: simplifies the implementation of bean mappings, reducing manual coding effort.

- ### Containerization tools
    - **Docker**: used for containerization and deployment of the application.

- ### API Documentation
  - **Springdoc OpenAPI**: an OpenAPI for generating documentation.

## Application Endpoints

  - **Risk countries controller:**
      - `GET: /countries/name` -> Get a list of countries by name.
      - `GET: /countries/code` -> Get a single country by code.
