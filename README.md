# Papillon's Cafe Rhinelander - Android App

Official Android application for Papillon's Cafe in Rhinelander, Wisconsin.

## About

This is a native Android app built with Kotlin and Jetpack Compose that provides customers with easy access to Papillon's Cafe's website and information.

## Features

- WebView integration for seamless website browsing
- Native Android experience
- Optimized for mobile devices
- Material Design 3 theming

## Technical Details

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Minimum SDK**: Android 8.0 (API 26)
- **Target SDK**: Android 14 (API 34)
- **Build System**: Gradle with Kotlin DSL

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/papillonscafe/
│   │   │   ├── MainActivity.kt
│   │   │   └── ui/theme/
│   │   ├── res/
│   │   └── AndroidManifest.xml
│   ├── androidTest/
│   └── test/
├── build.gradle.kts
└── proguard-rules.pro
```

## Building the App

### Prerequisites

- Android Studio Hedgehog or later
- JDK 17 or later
- Android SDK with API 34

### Build Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/thedevgeek/PapillonsCafeRhinelander-android.git
   cd PapillonsCafeRhinelander-android
   ```

2. Open the project in Android Studio

3. Sync Gradle files

4. Build and run:
   - For debug build: Click "Run" or press Shift+F10
   - For release build: `./gradlew assembleRelease`

## Release

The latest release APK can be found in `app/release/PapillonsCafe-1.4.2.apk`

## About Papillon's Cafe

Papillon's Cafe is a local breakfast and lunch restaurant located in Rhinelander, Wisconsin, serving delicious homemade meals in a cozy atmosphere.

**Website**: [papillonscaferhinelander.com](https://papillonscaferhinelander.com)

## License

Copyright © 2025 Papillon's Cafe Rhinelander. All rights reserved.
