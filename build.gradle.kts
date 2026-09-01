plugins {
    id("com.android.application") version "8.2.2" apply false
    id("com.android.library") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false // <-- Обновлено (было 1.9.20)
    id("com.google.dagger.hilt.android") version "2.48.1" apply false // <-- Обновлено до 2.48.1 для стабильности
}

tasks.register("clean", Delete::class) {
    // <-- Исправлено для совместимости с Gradle 8+
    delete(rootProject.layout.buildDirectory) 
}
