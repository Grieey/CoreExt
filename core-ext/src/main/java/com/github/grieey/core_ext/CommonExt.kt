package com.github.grieey.core_ext

import com.google.gson.Gson

/**
 * description: 通用性的扩展
 * @date: 4/20/21 22:06
 * @author: Grieey
 */

/**
 * 任何对象的深度拷贝
 */
fun Any.deepCopy(): Any? {
    return this.runCatching {
        Gson().fromJson(Gson().toJson(this), this::class.java)
    }.getOrNull()
}