package com.blityapps.blitynews.buildSrc

object Dependencies {
    private val kotlinVersion = ""

    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
    const val materialDesign = "com.google.android.material:material:1.1.0"

    object AndroidX {
        const val core = "androidx.core:core-ktx:1.6.0-alpha01"
        const val appCompat = "androidx.appcompat:appcompat:1.3.0-rc01"

        object Compose {
            const val UI = "androidx.compose.ui:ui:1.0.0-beta03"

            // Tooling support (Previews, etc.)
            const val UITooling = "androidx.compose.ui:ui-tooling:1.0.0-beta03"
            // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
            const val foundation = "androidx.compose.foundation:foundation:1.0.0-beta03"
            // Material Design
            const val materialDesign = "androidx.compose.material:material:1.0.0-beta03"
            // Material design icons
            const val materialDesignIcons =
                "androidx.compose.material:material-icons-core:1.0.0-beta03"
            const val materialDesignIconsExtended =
                "androidx.compose.material:material-icons-extended:1.0.0-beta03"
            // Integration with activities
            const val activityCompose = "androidx.activity:activity-compose:1.3.0-alpha05"
            // Integration with ViewModels
            const val lifecycleViewModelCompose =
                "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha03"
            // Integration with observables
            const val runtimeLivedata = "androidx.compose.runtime:runtime-livedata:1.0.0-beta03"
            // Navigation
            const val navigation = "androidx.navigation:navigation-compose:1.0.0-alpha09"

        }

        object Room {
            const val roomRuntime = "androidx.room:room-runtime:2.2.6"
            const val roomCompiler = "androidx.room:room-compiler:2.2.6"
            const val roomKtx = "androidx.room:room-ktx:2.2.6"
        }
    }

    object Coroutines {
        private const val coroutinesVersion = "1.4.3"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesVersion"
    }

    object Test {
        const val junit4 = "junit:junit:4.13.2"
        const val junit4Extensions = "androidx.test.ext:junit:1.1.2"

        const val junit5 = "org.junit.jupiter:junit-jupiter"
        const val truth = "com.google.truth:truth:1.1.2"
        const val mockk = "io.mockk:mockk:1.11.0"
        const val mockito = "org.mockito:mockito-core:1.10.19"

        object Compose {
            const val test = "androidx.compose.ui:ui-test-junit4:1.0.0-beta03"
            const val uiTest = "androidx.compose.ui:ui-test:1.0.0-beta03"
        }

        object AndroidX {
            const val room = "androidx.room:room-testing:2.2.6"
        }
    }

    object Koin {
        private const val koin_version = "3.0.1-beta-2"
        // Koin for Kotlin Multiplatform
        const val core = "io.insert-koin:koin-core:$koin_version"

        // Koin Test for Kotlin Multiplatform
        const val test = "io.insert-koin:koin-test:$koin_version"

        // Koin main features for Android (Scope,ViewModel ...)
        const val android = "io.insert-koin:koin-android:$koin_version"
        // Koin Android - experimental builder extensions
        const val androidExtensions = "io.insert-koin:koin-android-ext:$koin_version"
        // Koin for Jetpack WorkManager
        const val workManager = "io.insert-koin:koin-androidx-workmanager:$koin_version"
        // Koin for Jetpack Compose (unstable version)
        const val compose = "io.insert-koin:koin-androidx-compose:$koin_version"
    }

    object Ktlint {
        const val ktlint = "com.pinterest:ktlint:0.40.0"
    }

    object Detekt {
        const val detekt = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.16.0"
    }
}