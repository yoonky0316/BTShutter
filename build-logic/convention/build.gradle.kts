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
            id = libs.plugins.btshutter.android.library.asProvider().get().pluginId // id = "btshutter.android.library"
            implementationClass = "com.apbley.btshutter.buildlogic.AndroidLibraryConventionPlugin"
        }
        register("androidLibraryCompose") {
            id = libs.plugins.btshutter.android.library.compose.get().pluginId // id = "btshutter.android.library.compose"
            implementationClass = "com.apbley.btshutter.buildlogic.AndroidLibraryComposeConventionPlugin"
        }
        register("jvmLibrary") {
            id = "btshutter.jvm.library"
            implementationClass = "com.apbley.btshutter.buildlogic.JvmLibraryConventionPlugin"
        }
    }
}
