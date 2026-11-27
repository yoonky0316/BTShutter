plugins {
    alias(libs.plugins.btshutter.android.library)
}

android {
    namespace = "com.apbley.btshutter.core.bluetooth"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}
