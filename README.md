# Maternelle — Absence Application

**What:** Small Spring Boot app to manage student absences.

**Quick Start:**
- Ensure `JAVA_HOME` points to a JDK 21 installation (example: `/usr/lib/jvm/java-21-openjdk-amd64`).
- Run with Maven (uses the wrapper):

```bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
./mvnw spring-boot:run
```

Or run the built jar found in release:

```bash
java -jar target/maternelle-0.0.1-SNAPSHOT.jar
```

**Build:**
```bash
./mvnw -DskipTests package
```

**Project structure highlights:**
- Controllers: `src/main/java/org/maternelle/absence/controllers`
- Services: `src/main/java/org/maternelle/absence/services`
- Entities: `src/main/java/org/maternelle/absence/entities`
- Repositories: `src/main/java/org/maternelle/absence/repositories`


**Diagram:**


