initDeps(project)

buildscript {
  repositories {
    gradlePluginPortal()
    jcenter()
    google()
    mavenCentral()
  }
  dependencies {
//    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    classpath(Deps.JetBrains.Kotlin.gradlePlugin)
    classpath(Deps.Android.Tools.Build.gradlePlugin)
  }
}

group = "dev.marshi"
version = "1.0"

allprojects {
  repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
  }
}