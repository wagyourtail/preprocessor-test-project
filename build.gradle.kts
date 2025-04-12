plugins {
    java
}

group = "xyz.wagyourtail"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    annotationProcessor("systems.manifold:manifold-preprocessor:2025.1.9")
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("-Xplugin:Manifold")
}