plugins {
    java
    id("maven-publish")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
    withSourcesJar()
}

sourceSets.main {
    java.srcDirs("src/main/java", "src/main/generated")
}

dependencies {
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")
    implementation("com.google.code.gson:gson:2.9.0")
    implementation("io.gsonfire:gson-fire:1.8.5")
    implementation("org.threeten:threetenbp:1.6.0")
    implementation("io.swagger:swagger-annotations:1.6.6")
    implementation("javax.annotation:javax.annotation-api:1.3.2")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("com.sun.jersey.contribs:jersey-multipart:1.19.4")
    implementation("com.fasterxml.jackson.core:jackson-core:2.13.3")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.13.3")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.3")
    implementation("com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider:2.13.3")
    implementation ("io.swagger:swagger-annotations:1.6.6")
    implementation ("com.google.code.findbugs:jsr305:3.0.2")
    implementation ("com.sun.jersey:jersey-client:1.19.4")
    implementation ("org.openapitools:jackson-databind-nullable:0.2.3")
    implementation ("com.fasterxml.jackson.datatype:jackson-datatype-joda:2.13.3")
    implementation ("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.13.3")
    implementation ("com.github.joschi.jackson:jackson-datatype-threetenbp:2.12.5")
    implementation ("com.brsanthu:migbase64:2.2")
    implementation ("jakarta.annotation:jakarta.annotation-api:2.1.0")
}

/* ----------- Publishing config ------------------- */
// supressed for local development
// if you need to publish from local machine, create `gradle.properties` file in a project root and add 3 vairables:
// - version
// - regulaforensicsMavenUser
// - regulaforensicsMavenPassword
if (project.hasProperty("regulaforensicsMavenUser")) {

    val regulaforensicsMavenPassword: String by project
    val regulaforensicsMavenUser: String by project

    publishing {
        publications {
            create<MavenPublication>("client") {
                artifactId = "webclient"
                from(components["java"])
            }
        }
        repositories {
            maven {

                val releasesRepoUrl = uri("sftp://maven.regulaforensics.com:22/RegulaDocumentReaderWebClient")
                val betaRepoUrl = uri("sftp://maven.regulaforensics.com:22/RegulaDocumentReaderWebClient/Beta")
                val rcRepoUrl = uri("sftp://maven.regulaforensics.com:22/RegulaDocumentReaderWebClient/RC")
                val nightlyRepoUrl = uri("sftp://ftp.regula.local:22/RegulaDocumentReaderWebClient")

                name = "regulaforensics"
                url = if (version.toString().contains("beta")) betaRepoUrl
                else if(version.toString().contains("nightly")) nightlyRepoUrl
                else if(version.toString().contains("rc")) rcRepoUrl
                else releasesRepoUrl
                credentials {
                    username = regulaforensicsMavenUser
                    password = regulaforensicsMavenPassword
                }
            }
        }
    }
}
