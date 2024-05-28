plugins {
    kotlin("jvm") version "1.8.0"
    id("org.jetbrains.compose") version "1.4.0"
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation(compose.desktop.currentOs)
}

compose.desktop {
    application {
        mainClass = "MainKt"
    }
}
