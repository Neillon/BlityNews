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

        }
    }

    object Test {
        const val junit4 = "junit:junit:4.13.2"
        const val junit4Extensions = "androidx.test.ext:junit:1.1.2"

        object Compose {
            const val test = "androidx.compose.ui:ui-test-junit4:1.0.0-beta03"
            const val uiTest = "androidx.compose.ui:ui-test:1.0.0-beta03"
        }
    }
}