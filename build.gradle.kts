plugins {
    kotlin("jvm") version "1.5.21"
}

repositories {
    mavenCentral()
    maven("https://schlaubi.jfrog.io/artifactory/envconf/")
}

dependencies {
    implementation("dev.schlaubi", "envconf", "1.0")
    implementation("org.slf4j", "slf4j-api", "1.7.30")
    implementation("de.nycode:retrofit2-kotlinx-serialization-converter:0.9.3")
}

