plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = ConfigData.namespace
    compileSdk = ConfigData.compileSdk

    defaultConfig {
        applicationId = ConfigData.namespace
        minSdk = ConfigData.minSdk
        targetSdk = ConfigData.targetSdk
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName
        testInstrumentationRunner = ConfigData.testInstrumentationRunner

    }

    buildTypes {
        getByName("release"){
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")

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
        kotlinCompilerExtensionVersion = "1.3.2"
    }
}

dependencies {
    implementation(Dependencies.coreKtx)
    implementation(platform(Dependencies.kotlinPlatform))
    implementation(Dependencies.runtimeKtx)
    implementation(Dependencies.activityCompose)
    implementation(platform(Dependencies.composeBom))
    implementation(Dependencies.composeUI)
    implementation(Dependencies.composeUiGraphics)
    implementation(Dependencies.composePreview)
    implementation(Dependencies.material3)
    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.extJunit)
    androidTestImplementation(Dependencies.espressoCore)
    androidTestImplementation(platform(Dependencies.composeBomTest))
    androidTestImplementation(Dependencies.testJunit)
    debugImplementation(Dependencies.debugTooling)
    debugImplementation(Dependencies.debugManifest)

    implementation(Dependencies.dialogCore)
    implementation(Dependencies.dialogCalendar)

}