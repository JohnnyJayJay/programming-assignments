plugins {
    java
    checkstyle
}

group = "edu.kit.programming"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter", "junit-jupiter-api", "5.7.0")
    testRuntimeOnly("org.junit.jupiter", "junit-jupiter-engine", "5.7.0")
}

checkstyle {
    config = resources.text.fromFile("config/checkstyle/optionalCheckstyleRules.xml")
}

//val packageDeclaration = "^\\s*package\\s+[^;]+;$".toRegex()

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }

    register<Copy>("finalize") {
        dependsOn("checkstyleMain", "test")
        from("src/main/java")
        into("build/final")
        exclude("edu/kit/informatik/*")
        /*filter {
            it.replace(packageDeclaration, "")
        }*/
    }
}