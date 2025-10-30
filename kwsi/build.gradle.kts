plugins {
    id("io.technoirlab.conventions.kotlin-multiplatform-library")
}

kotlinMultiplatformLibrary {
    packageName = "io.technoirlab.kwsi"

    buildFeatures {
        abiValidation = true
    }
}

kotlin {
    iosArm64()
    iosSimulatorArm64()
    macosArm64()
    mingwX64()
}
