pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "BTShutter"
include(":app")

include(":core:common")
include(":core:bluetooth")
include(":core:designsystem")

include(":domain:model")
include(":domain:repository")
include(":domain:usecase")

include(":data:local")
include(":data:repository")

include(":feature:device-list")
include(":feature:connection")
include(":feature:camera-remote")
