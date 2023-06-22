object Dependencies {
    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val kotlinPlatform by lazy { "org.jetbrains.kotlin:kotlin-bom:${Versions.kotlinPlatform}" }
    val runtimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.runtimeKtx}"}
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    val composeBom by lazy { "androidx.compose:compose-bom:${Versions.composeBom}" }
    val composeUI by lazy { "androidx.compose.ui:ui" }
    val composeUiGraphics by lazy { "androidx.compose.ui:ui-graphics" }
    val composePreview by lazy { "androidx.compose.ui:ui-tooling-preview" }
    val material3 by lazy { "androidx.compose.material3:material3" }
    val junit by lazy { "junit:junit:${Versions.junit}" }
    val extJunit by lazy { "androidx.test.ext:junit:${Versions.extJunit}" }
    val espressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.espressoCore}" }
    val composeBomTest by lazy { "androidx.compose:compose-bom:${Versions.composeBomTest}" }
    val testJunit by lazy { "androidx.compose.ui:ui-test-junit4" }
    val debugTooling by lazy { "androidx.compose.ui:ui-tooling" }
    val debugManifest by lazy { "androidx.compose.ui:ui-test-manifest" }
    val dialogCore by lazy { "com.maxkeppeler.sheets-compose-dialogs:core:${Versions.composeDialog}" }
    val dialogCalendar by lazy { "com.maxkeppeler.sheets-compose-dialogs:calendar:${Versions.composeDialog}" }
}
