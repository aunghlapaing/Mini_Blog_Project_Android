plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.mini_library_project"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mini_library_project"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    implementation(libs.recyclerview.selection)
    implementation(libs.material1)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}