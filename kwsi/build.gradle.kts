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
    macosArm64()
    mingwX64()
}
