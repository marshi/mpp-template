plugins {
  kotlin("multiplatform")
  id("multiplatform-setup")
  id("android-setup")
}

group = "dev.marshi"
version = "1.0"

kotlin {
//  android()
//  jvm("desktop") {
//    compilations.all {
//      kotlinOptions.jvmTarget = "11"
//    }
//  }
//  js(IR) {
//    browser {
//      testTask {
//        testLogging.showStandardStreams = true
//        useKarma {
//          useChromeHeadless()
//          useFirefox()
//        }
//      }
//    }
//    binaries.executable()
//  }
  sourceSets {
    val commonMain by getting {
      dependencies {

      }
    }
    val commonTest by getting {
      dependencies {
        implementation(kotlin("test"))
      }
    }
    val androidMain by getting {
      dependencies {
        api("androidx.appcompat:appcompat:1.2.0")
        api("androidx.core:core-ktx:1.3.1")
      }
    }
    val androidTest by getting {
      dependencies {
        implementation("junit:junit:4.13")
      }
    }
    val desktopMain by getting {
      dependencies {}
    }
    val desktopTest by getting
  }
}
