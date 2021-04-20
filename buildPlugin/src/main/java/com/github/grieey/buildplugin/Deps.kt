package com.github.grieey.buildplugin

/**
 * description: 依赖管理
 * @date: 3/14/21 14:54
 * @author: Grieey
 */
object Deps {

    private const val kotlinVersion = "1.4.10"

    object Androidx {
        val ktx = "androidx.core:core-ktx:1.3.2"

        /*************** ui相关 *****************/
        val appcompat = "androidx.appcompat:appcompat:1.2.0"
        val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.4"

        /*************** 测试相关 *****************/
        val junit = "androidx.test.ext:junit:1.1.2"
        val espressoCore = "androidx.test.espresso:espresso-core:3.3.0"
    }

    object Google {
        val material = "com.google.android.material:material:1.2.1"
        val gson = "com.google.code.gson:gson:2.8.6"
    }

    object Core {
        val ui = ""
        val ktx = ""
    }

    object Test {
        val junit = "junit:junit:4.+"
    }

    val kotinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
}