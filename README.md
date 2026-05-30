# Spring Boot Hibernate

- A revised version of the simple API from Baeldung Spring Boot with Hibernate
  tutorial adjusted for Spring Boot 4.
- Reference: https://www.baeldung.com/spring-boot-hibernate

## Prerequisites

Ensure the following are installed:

- Java 25
- Maven

Verify:

```bash
java -version
mvn -version
```

## Setup & Run

Clone the repository:

```bash
git clone git@github.com:JPGabutin/spring-boot-hibernate.git
cd spring-boot-hibernate
```

Run the application:

```bash
mvn spring-boot:run
```

Application runs on:

```txt
http://localhost:8080
```

---

## H2 Database

H2 console:

```txt
http://localhost:8080/h2-console
```

Connection settings:

```txt
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password:
```

---

## API Endpoints

### Create Account

**GET** `/books`

Success Response — HTTP 200

```json
[
	{
		"name": "The Tartar Steppe",
		"id": "6334dfbf-418c-4e16-b811-4f1cab17c403"
	},
	{
		"name": "Poem Strip",
		"id": "ebda9320-6c1d-4742-8df3-886dbca297be"
	},
	{
		"name": "Restless Nights: Selected Stories of Dino Buzzati",
		"id": "9b0b46d1-e5c2-4e55-bec0-03d48bc22603"
	}
]
```
