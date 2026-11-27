plugins {
    alias(libs.plugins.btshutter.android.library.compose)
}

android {
    namespace = "com.apbley.btshutter.feature.cameraremote"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui)
}
