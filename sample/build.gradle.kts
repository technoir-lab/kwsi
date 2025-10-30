plugins {
    id("io.technoirlab.conventions.kotlin-multiplatform-application")
}

kotlinMultiplatformApplication {
    packageName = "io.technoirlab.kwsi.sample"
}

kotlin {
    iosArm64()
    iosSimulatorArm64()
    macosArm64()
    mingwX64()

    sourceSets {
        commonMain.dependencies {
            implementation(project(":kwsi"))
            implementation(libs.kotlin.logging)
        }
    }
}
