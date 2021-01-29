package com.github.grieey.core_ext

/**
 * description: double 扩展
 * @date: 2021/1/28 17:43
 * @author: Grieey
 */
val Double.float: Float
    get() = this.toFloat()