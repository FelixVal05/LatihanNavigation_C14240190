plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "c14240190.latihannavigation"
    buildFeatures{
        viewBinding = true
    }
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "c14240190.latihannavigation"
        minSdk = 33
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    implementation(libs.navigation.fragment.ktx)
    implementation(libs.navigation.ui.ktx)
}