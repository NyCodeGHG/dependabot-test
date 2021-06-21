plugins {
    kotlin("jvm") version "1.5.10"
}

repositories {
    mavenCentral()
    maven("https://schlaubi.jfrog.io/artifactory/envconf/")
}

dependencies {
    implementation("dev.schlaubi:envconf:1.1")
    implementation("org.slf4j:slf4j-api:1.7.30")
}

