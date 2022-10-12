/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.xwyvernpx.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
//import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author wyvernp
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
@Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][]{
            {1, 0},
            {1, 1},
            {2, 2},
            {6, 3},
            {24, 4},
            {120, 5},
            {720, 6}
        };
    }
    //ta phai map 2 cot cua tung dong vao hai dau hoi cham cua ham so sanh
//    Assert.assertEquals(cot-0,MathUtil
    // Map value tu mang vao 2 bien nhoi 2 bien nay vao ham so sanh!!!
    @Parameterized.Parameter(value = 0)
    public long expected;// map cot 0
    @Parameterized.Parameter(value = 1)
    public int n; // map cot 1 
    @Test
    public void testFactorialGivenRightArgumentsRetrunWell() {
         Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
