/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khanhtoan.mathutil.core;

/**
 *
 * @author admin
 */
public class MathUtil {
    
    //Trong class này cung cap cho ai do nhieu ham xu li toan hoc 
    //clone class Math cua JDK
    //ham thu vien xài chung cho ai do mà ko can luu lai cac gia tri /trang thai
    //chon thiet ke la ham static 
    
    //hàm tính giai thua!!!
    //n! = 1.2.3.4.5... n
    //giai thua ham do thi doc dung, tang nhanh ve gia tri 
    //20 giai thua 18 so 0, vua kip du cho kieu long cua Java
    //21 giai thua tran kieu long 
    //bai nay quy uoc tinh n! trong khoang tu 0...20
    public static long getFactorial(int n){
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid argument. N must be between 0...20");
        }   
        
        if(n == 0 || n == 1){
            return 1;   //ket thuc cuoc choi som neu nhan gia tri dac biet
        }
        
        long product = 1;   //tich nhan don , thuat toan con heo dat 
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
