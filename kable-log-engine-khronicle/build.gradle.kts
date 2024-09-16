plugins {
    kotlin("multiplatform")
    id("org.jmailen.kotlinter")
    id("org.jetbrains.dokka")
    id("maven-publish")
}

kotlin {
    explicitApi()
    jvmToolchain(libs.versions.jvm.toolchain.get().toInt())

    iosArm64()
    iosX64()
    js().browser()
    macosArm64()
    macosX64()
    jvm()

    sourceSets {
        commonMain.dependencies {
            api(project(":kable-core"))
            api(libs.khronicle)
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("logEngineKhronicleRelease") {
            from(components["kotlin"])
            groupId = "com.github.X2Mobile"
            artifactId = "kable"
            version = "1.0.0"
        }
    }
    repositories {
        mavenLocal()
    }
}