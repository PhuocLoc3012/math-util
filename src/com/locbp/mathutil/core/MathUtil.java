/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.locbp.mathutil.core;

/**
 *
 * @author ASUS
 */
public class MathUtil {
    //trong class này cung cấp ra ngoài nhiều hàm
    //xử lí toán học clone class Math của JDK

    //hàm xài chung, cung cấp tiện ích, ko lưu trạng thái, k nhớ nhung cái gì cả --> static
    //hàm tính giai thừa
    //0! = 1
    //giai thừa tăng nhanh về giá trị
    //tính n giai thừa trong khoảng 0 - 20
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid argument. N must be between 0-20");
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        long product = 1;
//        for (int i = 2; i <= n; i++) {
//            product *= i;
//        }
//        return product;
//    }
//    
    //Học đệ quy trong 30s
    //Hiện tượng gọi lại chính mình với 1 quy mô khác
    //n! = 1.2.3.4.5.6.....n
    //6! = 6 x 5!
    //5! = 5 x 4!
    //4! = 4 x 3!
    //3! = 3 x 2!
    //2! = 2 x 1! //điểm dừng
    //1! = 1;
    //quy ước 1! = 0! = 1;
    //chốt hạ: n! = n * (n - 1)!
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0-20");
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * getFactorial(n - 1); //công thức đệ quy
        
    }

}
