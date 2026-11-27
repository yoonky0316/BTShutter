plugins {
    alias(libs.plugins.btshutter.android.library)
}

android {
    namespace = "com.apbley.btshutter.data.local"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}
