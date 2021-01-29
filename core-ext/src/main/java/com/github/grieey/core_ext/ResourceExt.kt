package com.github.grieey.core_ext

import android.content.res.Resources
import androidx.core.content.res.ResourcesCompat

/**
 * description: 资源相关的扩展
 * @date: 2021/1/28 17:48
 * @author: Grieey
 */
/**
 * 获取颜色资源
 */
fun getColor(id: Int) = Resources
    .getSystem()
    .runCatching {
        getColor(id, null)
    }
    .getOrNull()

/**
 * 获取drawable
 */
fun getDrawable(id: Int) = ResourcesCompat.getDrawable(Resources.getSystem(), id, null)