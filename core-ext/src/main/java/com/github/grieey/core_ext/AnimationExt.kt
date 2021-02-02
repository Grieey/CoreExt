package com.github.grieey.core_ext

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator

/**
 * description: 动画的扩展
 * @date: 2021/2/2 21:24
 * @author: Grieey
 */
inline fun animatorSet(block: AnimatorSet.() -> Unit) {
    AnimatorSet().apply(block).start()
}

infix fun AnimatorSet.Builder.with(animator: Animator) {
    this.with(animator)
}

infix fun AnimatorSet.Builder.after(animator: Animator) {
    this.after(animator)
}

infix fun AnimatorSet.Builder.before(animator: Animator) {
    this.before(animator)
}