package com.github.grieey.core_ext

import android.content.res.Resources
import android.util.TypedValue

/**
 * description: float 的扩展
 * @date: 2021/1/28 17:39
 * @author: Grieey
 */

/**
 * int值
 */
val Float.int: Int
    get() = this.toInt()

/**
 * double值
 */
val Float.double: Double
    get() = this.toDouble()

/**
 * long值
 */
val Float.long: Long
    get() = this.toLong()

/**
 * string值
 */
val Float.string: String
    get() = this.toString()

/**
 * dp转px
 */
val Float.dp: Float
    get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        this,
        Resources.getSystem().displayMetrics
    )

/**
 * sp转px
 */
val Float.sp: Float
    get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_SP,
        this,
        Resources.getSystem().displayMetrics
    )

/**
 * 获取弧度值
 */
val Float.radians: Double
    get() = Math.toRadians(this.double)

/**
 * 为null时，返回0
 */
fun Float?.orZero() = this ?: 0F

/**
 * 非正数返回0
 */
fun Float?.orPositive() = if (this.orZero() > 0) this as Float else 0F