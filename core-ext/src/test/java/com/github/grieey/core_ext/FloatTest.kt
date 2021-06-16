package com.github.grieey.core_ext

import org.junit.Assert
import org.junit.Test

/**
 * description:Float test units
 * @date: 6/16/21 16:23
 * @author: Grieey
 */
class FloatTest {

    @Test
    fun `test float format`() {
        Assert.assertEquals("0.03", 0.032f.format())
        Assert.assertEquals("0.002", 0.002f.format(3))
    }

}