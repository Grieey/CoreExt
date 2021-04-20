package com.github.grieey.core_ext

import android.graphics.Matrix
import android.graphics.RectF
import android.widget.ImageView

/**
 * description: ImageView的扩展
 * @date: 4/20/21 22:05
 * @author: Grieey
 */
fun ImageView.cropBottom() {
    val matrix: Matrix = imageMatrix

    val scale: Float
    val viewWidth = width - paddingLeft - paddingRight
    val viewHeight = height - paddingTop - paddingBottom
    var drawableWidth = 0
    var drawableHeight = 0
    if (drawable != null) {
        drawableWidth = drawable.intrinsicWidth
        drawableHeight = drawable.intrinsicHeight
    }

    scale = if (drawableWidth * viewHeight > drawableHeight * viewWidth) {
        viewHeight.toFloat() / drawableHeight.toFloat()
    } else {
        viewWidth.toFloat() / drawableWidth.toFloat()
    }

    val viewToDrawableWidth = viewWidth / scale
    val viewToDrawableHeight = viewHeight / scale
    val yOffset: Float = drawableHeight - viewToDrawableHeight
    val drawableRect = RectF(
        0F,
        yOffset,
        viewToDrawableWidth,
        yOffset + viewToDrawableHeight
    )
    val viewRect = RectF(0F, 0F, viewWidth.toFloat(), viewHeight.toFloat())
    matrix.setRectToRect(drawableRect, viewRect, Matrix.ScaleToFit.FILL)

    imageMatrix = matrix
}