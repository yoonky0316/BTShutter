plugins {
    `kotlin-dsl`
}

group = "com.apbley.btshutter.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.compose.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidLibrary") {
            id = "btshutter.android.library"
            implementationClass = "com.apbley.btshutter.buildlogic.AndroidLibraryConventionPlugin"
        }
        register("androidLibraryCompose") {
            id = "btshutter.android.library.compose"
            implementationClass = "com.apbley.btshutter.buildlogic.AndroidLibraryComposeConventionPlugin"
        }
    }
}
