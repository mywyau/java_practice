# Java Practice

A Gradle multi-project repository that keeps plain Java exercises separate from
the Spring Boot web application.

## Repository structure

```text
java_practice/
├── java-examples/         # Java syntax, OOP, collections, generics, and DSA
├── spring-boot-example/   # Spring Boot web application
├── gradle/                # shared Gradle wrapper and version catalogue
├── gradlew
└── settings.gradle.kts    # declares both subprojects
```

Keeping the projects separate means the Java examples do not need Spring's
dependencies or plugins. Each subproject can be built and run independently,
while `./gradlew build` still builds everything.

## Requirements

- JDK 21
- No system Gradle installation is needed; use the included wrapper

## Plain Java examples

Run the default basics application:

```bash
./gradlew :java-examples:run
```

Run any class that has a `main` method by providing its full package name:

```bash
./gradlew :java-examples:runExample \
  -PmainClass=java_practice.collections.SetExample

./gradlew :java-examples:runExample \
  -PmainClass=dsa.BinaryTreeLevelOrder
```

The `java_practice.sh` and `dsa.sh` helpers provide a shorter form for these
commands.

### DSA learning track

[`java-examples/DSA_EXERCISES.md`](java-examples/DSA_EXERCISES.md) catalogs 75
practice questions across 15 concepts. Every question has a separate runnable
Java class containing a prompt, a hint, and a target complexity. Start with the
arrays section, implement a solution method in the class, and add tests as you
go.

### SOLID design principles

[`java-examples/src/main/java/java_practice/solid/README.md`](java-examples/src/main/java/java_practice/solid/README.md)
contains five runnable examples—one for each SOLID principle. The examples use
plain Java so you can understand the design ideas before seeing how Spring uses
them for components and dependency injection.

## Spring Boot example

```bash
./gradlew :spring-boot-example:bootRun
```

Then open `http://localhost:8080/` or `http://localhost:8080/hello`.

## Tests and builds

```bash
# Test everything
./gradlew test

# Build everything
./gradlew build

# Work on only one subproject
./gradlew :java-examples:test
./gradlew :spring-boot-example:test
```
