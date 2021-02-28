package com.github.grieey.core_ext

import android.view.View

/**
 * description: view 相关的扩展
 * @date: 2021/1/28 17:52
 * @author: Grieey
 */

/**
 * 是否已经可见
 */
val View.visibled: Boolean
    get() = this.visibility == View.VISIBLE

/**
 * 是否已经不可见
 */
val View.invisibled: Boolean
    get() = this.visibility == View.INVISIBLE

/**
 * 是否已经隐藏
 */
val View.goned: Boolean
    get() = this.visibility == View.GONE

/**
 * 设置为可见状态
 */
fun View.visible() {
    this.visibility = View.VISIBLE
}

/**
 * 设置为不可见状态
 */
fun View.invisible() {
    this.visibility = View.INVISIBLE
}

/**
 * 设置为隐藏状态
 */
fun View.gone() {
    this.visibility = View.GONE
}

/**
 * 点击事件
 */
inline fun View.click(crossinline block: (view: View) -> Unit) {
    setOnClickListener {
        block(it)
    }
}

/**
 * 设置view的宽高，单位px
 */
fun View.setWidthAndHeightInPx(newWidth: Int? = null, newHeight: Int? = null) {
    layoutParams = layoutParams.apply {
        width = newWidth ?: width
        height = newHeight ?: height
    }
}