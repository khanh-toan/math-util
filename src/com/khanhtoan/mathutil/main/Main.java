/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khanhtoan.mathutil.main;

import com.khanhtoan.mathutil.core.MathUtil;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
      
        //thu nghiem ham tinh gia thua coi chay dung nhu thiet ke khong 
        //ta phai dua ra cac tinh huong de su dung hàm trong thuc te
        //vi du: -5 tính duoc ko
        //.....
        //TEST CASE: Mot tinh huong/ham/app/man hinh/tinh nang dc dua vao su dung
        //Gia lap hanh vi cua ai dó!!!
        
        long expected = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = "+ expected + " expected");
        System.out.println("5! = "+ actual +" actual");
    }
}
