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
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. N must be between 0-20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
