package com.github.grieey.buildplugin

import org.gradle.api.JavaVersion

/**
 * description: 项目的配置
 * @date: 3/14/21 13:39
 * @author: Grieey
 */
object Config {
    const val isDebugLocalLib = true
    const val compileSdkVersion = 30
    const val buildToolsVersion = "30.0.3"
    const val minSdkVersion = 23
    const val targetSdkVersion = 30
    const val versionCode = 10000
    const val versionName = "1.0.0"

    const val jvmTarget = "1.8"

    val javaSourceCompatibility = JavaVersion.VERSION_1_8
}