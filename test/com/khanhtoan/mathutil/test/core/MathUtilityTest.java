/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.khanhtoan.mathutil.test.core;

import com.khanhtoan.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author admin
 */
public class MathUtilityTest {
    //day la class se su dung cac ham cua thu vien/framework JUnit
    //de kiem tra code chinh - ham tinh giai thua bên
    //core.MathUtil
    //viet code de test code chinh ben kia!!!

    //co quy tac dat ten ham kiem thu 
    //nhung thuong se la noi len muc dich cua cac case/tinh huong kiem thu
    //tunh huong xai ham theo kieu thanh cong hay that bai
    //ham duoi day la tinh huong test ham chay thanh cong, tra ve ngon
    //ta se xai ham well - dua 5! 6!, hok choi dua -5!, 30!
    //@test JUnit se phoi hop  voi JVM de chay ham nay
    //@Test phia hau truong là public static void main()
    //co nhieu @Test ung voi nhieu case khác nhau de kiem thu hàm tính giai thua
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0;  //test thu tinh huong dau vao, may phai chay dung
        long expected = 1;

        //long actual = ; //goi ham can test
        long actual = MathUtil.getFactorial(n);

        //so sanh actual vs. expected dung xanh xanh do do, framework    
        Assert.assertEquals(expected, actual);
        //ham so sanh 2 gia tri co giong nhau hay ko
        //neu giong nhau -> thay mau xanh den duong - duong thong, code ngon 
        //                  it nhat cho case dang test
        //neu KO GIONG NHAU  -> thay mau do den duong  
        //                      ham y expected va actual ko giong nhau
    }

    //ham getF() ta thiet ke co 2 tinh huong xu li
    //1. dua data tu te trong 1->20
    //2. dua vao ca chon, am, >20
    //neu ham nhan vao n < 0 || n> 20 va ham nem ra ngoai le => HAM CHAY DUNG NHU THIET KE
    //TEST CASE:
    //input: -5
    //expected: IllegalArgumentException xuat hien
    //tinh huong bat thuong, ngoai le, ngoai du tinh la nhung thu ko the do luong, so sanh
    //theo kieu value ma chi có the do luong bang cach chung có xuat hien hay ko
    //assertEquals() ko the so sanh 2 ngoai le
    //      equals() la bang nhau hay ko tren value!!!
    //MAU DO DO EM, DO HAM NEM RA NGOAI LE
    //              NHUNG KO PHAI NGOAI LE NHU KI VONG - THUC SU KI VONG SAI
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException(){
//        MathUtil.getFactorial(-5);  //ham @Test chay, hay ham getF() chay
//                                    //se nem ve ngoai le Number....
//    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);  //ham @Test chay, hay ham getF() chay
        //se nem ve ngoai le Number....
    }

    //Cach bat ngoai le xuat hien, viet tu nhien hon 
    //xai lambda
    //Test case: ham se nem ve ngoai le neu nhan vao 21
    //tui can thay mau xanh khi choi voi 21!
    
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
        //Assert.assertThrows(tham so 1: loai ngoai le muon so sanh, 
        //                    tham so 2: doan code chay vang ra ngoai runnable)
        
        Assert.assertThrows(IllegalArgumentException.class, 
                () -> MathUtil.getFactorial(-5)
        );
        
        //MathUtil.getFactorial(-5);
    }

    //bat ngoai le, xem ham có nem ve ngoai le hay ko khi n cà chon
    //có ném, hay chay dung thiet ke -> xanh
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        //chu dong kiem soat ngoai le
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            //bat try catch là JUnit se ra mau xanh do chu dong kiem soát ngoai le
            //nhung ko chac ngoai le minh can xuat hien hay ko?
            //co doan code  kiem soat dung ngoai le IllegallArgumentException xh
            Assert.assertEquals("Invalid argument. N must be between 0...20", e.getMessage());
        }
    }
}
