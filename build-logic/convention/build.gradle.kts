plugins {
    `kotlin-dsl`
}

group = "com.apbley.btshutter.buildlogic" // 본인 패키지명.buildlogic으로 수정

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.compose.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidLibrary") {
            id = "btshutter.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidLibraryCompose") {
            id = "btshutter.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }
    }
}

