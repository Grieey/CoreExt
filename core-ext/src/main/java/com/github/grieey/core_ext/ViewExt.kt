package com.github.grieey.core_ext

import android.util.Size
import android.view.View
import android.view.ViewGroup

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
    applyParams<ViewGroup.LayoutParams> {
        width = newWidth ?: width
        height = newHeight ?: height
    }
}

/**
 * 设置layoutParams
 */
inline fun <reified T : ViewGroup.LayoutParams> View.applyParams(block: T.() -> Unit) {
    layoutParams = (layoutParams as? T)?.apply(block) ?: layoutParams
}

/**
 * size 的宽高比
 */
fun Size.ratio() = width * 1F / height

/**
 * 尺寸适配
 * @param max 需要适配的目标尺寸
 * @return 适配后的尺寸，保持宽高比然后返回max顶高或者顶宽的尺寸
 */
infix fun Size.adjust(max: Size): Size {
    var resultWidth: Int? = null
    var resultHeight: Int? = null

    val ratioWidth = max.width * 1F / width
    val ratioHeight = max.height * 1F / height

    val scaleInBigRatio = {
        if (ratioWidth < ratioHeight) {
            // 宽的比率大，以宽的比率来缩放
            resultWidth = max.width
            resultHeight = (height * ratioWidth).toInt()
        } else {
            resultWidth = (max.width * ratioHeight).toInt()
            resultHeight = max.height
        }
    }

    when {
        width >= max.width && height >= max.height -> {
            scaleInBigRatio()
        }
        width >= max.width -> {
            // 以宽的比率来缩放
            resultWidth = max.width
            resultHeight = (max.height * ratioWidth).toInt()
        }

        height >= max.height -> {
            // 以高的比率来缩放
            resultWidth = (max.width * ratioHeight).toInt()
            resultHeight = max.height
        }
        else -> {
            scaleInBigRatio()
        }
    }
    return Size(resultWidth ?: 0, resultHeight ?: 0)
}