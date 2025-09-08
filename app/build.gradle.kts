plugins {
    application
}

application {
    mainClass = "no.hvl.dat250.lecture07.App"
    // replace with the following line for a Spring Boot like web app
    // mainClass = "no.hvl.dat250.lecture07.web.WebApp"

}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}


repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.1")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("org.springframework:spring-context:6.2.10")

    // needed for Spring Boot like web app
    implementation("org.springframework:spring-webmvc:6.2.10")
    implementation("org.apache.tomcat.embed:tomcat-embed-jasper:11.0.11")
}

tasks.named<Test>("test") {
    useJUnitPlatform()

    maxHeapSize = "1G"

    testLogging {
        events("passed")
    }
}
