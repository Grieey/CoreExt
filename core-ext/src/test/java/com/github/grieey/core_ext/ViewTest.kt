package com.github.grieey.core_ext

import android.util.Size
import org.junit.Assert
import org.junit.Test

/**
 * description: view test units
 * @date: 6/16/21 16:45
 * @author: Grieey
 */
class ViewTest {

    @Test
    fun `test adjust size`() {
        val viewRatio = 335 / 445f

        val size1 = Size(400, 400)
        val size2 = Size(200, 200)
        val size3 = Size(400, 444)
        val size4 = Size(333, 450)
        val size5 = Size(333, 444)

        val max1 = Size(335, 445)
        val max2 = Size(335, 445)
        val max3 = Size(335, 445)
        val max4 = Size(335, 445)
        val max5 = Size(335, 445)

        val getRatio = { size: Size ->
            size.width * 1F / size.height
        }

        Assert.assertEquals(getRatio(size1).format(), getRatio(size1 adjust max1).format())

//        println("视图宽高：335 ， 445 视图比率$viewRatio  都大且正 ===宽：400, 高：400 原始比率：${(400 / 400f).format()} 输出：宽${pair1.first} 高${pair1.second} 输出比率${((pair1.first ?: 1) / (pair1.second ?: 1).toFloat()).format()}")
//        println("视图宽高：335 ， 445 视图比率$viewRatio  都小且正 ===宽：200, 高：200 原始比率：${(200 / 200f).format()} 输出：宽${pair2.first} 高${pair2.second} 输出比率${((pair2.first ?: 1) / (pair2.second ?: 1).toFloat()).format()}")
//        println("视图宽高：335 ， 445 视图比率$viewRatio  宽大高小 ===宽：400, 高：444 原始比率：${(400 / 444f).format()} 输出：宽${pair3.first} 高${pair3.second} 输出比率${((pair3.first ?: 1) / (pair3.second ?: 1).toFloat()).format()}")
//        println("视图宽高：335 ， 445 视图比率$viewRatio  宽小高大 ===宽：333, 高：450 原始比率：${(333 / 450f).format()} 输出：宽${pair4.first} 高${pair4.second} 输出比率${((pair4.first ?: 1) / (pair4.second ?: 1).toFloat()).format()}")
//        println("视图宽高：335 ， 445 视图比率$viewRatio  都小非正 ===宽：333, 高：444 原始比率：${(333 / 444f).format()} 输出：宽${pair5.first} 高${pair5.second} 输出比率${((pair5.first ?: 1) / (pair5.second ?: 1).toFloat()).format()}")
    }
}