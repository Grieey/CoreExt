package com.github.grieey.core_ext

/**
 * description: double 扩展
 * @date: 2021/1/28 17:43
 * @author: Grieey
 */
val Double.float: Float
    get() = this.toFloat()

val Double.string: String
    get() = this.toString()

/**
 * 为null时，返回0
 */
fun Double?.orZero() = this ?: 0.0

/**
 * 非正数返回0
 */
fun Double?.orPositive() = if (this.orZero() > 0.0) this as Double else 0.0