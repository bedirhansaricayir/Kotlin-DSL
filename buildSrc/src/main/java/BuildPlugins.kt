object BuildPlugins {
    val gradle by lazy { "com.android.tools.build:gradle:${Versions.gradleVersion}" }
    val kotlinGradlePlugin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinGradlePluginVersion}" }
}