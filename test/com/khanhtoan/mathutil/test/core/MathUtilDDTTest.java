/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.khanhtoan.mathutil.test.core;

import com.khanhtoan.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author admin
 */

//cau lenh nay cua Junit báo hieu rang se can loop qua cac tap data de lay 
//cap data input/expected nhoi vao ham test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    @Parameterized.Parameters   //JUnit se ngam chay luot qua tung dong cua mang de lay ra duoc cap data
                                //input/expected
    //ten ham ko quan trong, quan trong la @
    public static Object[][] initData(){
        return new Integer[][]{
            {0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}
        };
    }
    
    //gia su da loop qua duoc tung dong cua mang, ta van can gan tung value cua cot vào bien tuong ung
    //input/expected de lat hoi feed cho ham
    
    @Parameterized.Parameter(value = 0) //value = 0 map voi bang data
    public int n;   //bien map voi value cua cot n cua mang
    
    @Parameterized.Parameter(value = 1)
    public long expected;
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
