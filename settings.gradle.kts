pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
    
}
rootProject.name = "mpp-template"


include(":android")
include(":desktop")
include(":web")
include(":common:compose-ui")
include(":common:data")
