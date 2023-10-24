pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "PokeWorld"
include(":app")
include(":core")
include(":features:pokedex")
include(":features:generations")
include(":features:items")
include(":features:machines")
include(":features:locations")
include(":features:moves")
include(":features:berries")
include(":logger")
include(":analytics")
