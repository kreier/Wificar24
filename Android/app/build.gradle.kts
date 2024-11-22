plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    signingConfigs {
        getByName("debug") {
            storeFile =
                file("C:\\Users\\matth\\keystores\\cert1.jks")
            storePassword = "Wificar24"
            keyPassword = "Wificar24"
        }
        create("production") {
            storeFile =
                file("C:\\Users\\matth\\keystores\\upload_cert.der")
            storePassword = "wificar24"
            keyPassword = "wificar24"
        }
        create("release") {
            storeFile =
                file("C:\\Users\\matth\\keystores\\cert1.jks")
            storePassword = "wificar24"
            keyPassword = "wificar24"
        }
    }
    namespace = "org.kreier.wificar24"
    compileSdk = 35

    defaultConfig {
        applicationId = "org.kreier.wificar24"
        minSdk = 25
        targetSdk = 34
        versionCode = 5
        versionName = "1.2"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
        versionNameSuffix = "production"
    }

    buildTypes {
        getByName("release") {
            versionNameSuffix = "release"
            signingConfig = signingConfigs.getByName("release")
        }
        getByName("debug") {
            versionNameSuffix = "debug"
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildToolsVersion = "34.0.0"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation("io.ktor:ktor-client-android:3.0.1")
    implementation("com.google.android.play:integrity:1.4.0")
    implementation(libs.androidx.fragment)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}