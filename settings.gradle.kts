rootProject.name = "study-tdd"

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            val kotlinVersion: String by settings

            when (requested.id.id) {
                "org.jetbrains.kotlin.jvm" -> useVersion(kotlinVersion)
            }
        }
    }
}