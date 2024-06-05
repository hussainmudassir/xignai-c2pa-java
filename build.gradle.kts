plugins {
    id("java")
}

group = "org.xignai"
version = "1.0-SNAPSHOT"


allprojects {
    repositories {
        mavenCentral()
        maven {
            url = uri("https://gitlab.com/api/v4/projects/51891540/packages/maven")
        }
    }
}

dependencies {
    implementation("info.guardianproject:simple_c2pa:0.0.13")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}