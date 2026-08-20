plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = "java_practice.basics.App"
}

// Run any example by passing its fully qualified class name, for example:
// ./gradlew :java-examples:runExample -PmainClass=java_practice.collections.SetExample
tasks.register<JavaExec>("runExample") {
    group = "application"
    description = "Runs an example selected with -PmainClass=<fully.qualified.ClassName>"
    classpath = sourceSets.main.get().runtimeClasspath

    val selectedMainClass = providers.gradleProperty("mainClass")
    mainClass.set(selectedMainClass)

    doFirst {
        if (!selectedMainClass.isPresent) {
            throw GradleException(
                "Usage: ./gradlew :java-examples:runExample " +
                    "-PmainClass=java_practice.collections.SetExample"
            )
        }
    }
}

tasks.test {
    useJUnitPlatform()
}
