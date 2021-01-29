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