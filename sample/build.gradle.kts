plugins {
    id("io.technoirlab.conventions.kotlin-multiplatform-application")
}

kotlinMultiplatformApplication {
    packageName = "io.technoirlab.kwsi.sample"
}

kotlin {
    macosArm64()
    mingwX64()

    sourceSets {
        commonMain.dependencies {
            implementation(project(":kwsi"))
            implementation(libs.kotlin.logging)
        }
    }
}
