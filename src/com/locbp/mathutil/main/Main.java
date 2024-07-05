/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.locbp.mathutil.main;

import com.locbp.mathutil.core.MathUtil;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        //thử nghiệm coi hàm tính giai thừa có chạy đúng như thiết kế ko
        //ta phải đưa ra các tình huống sử dụng hàm trong thực tế
        //ví dụ: -5 coi tính đc k
        //  0 coi bao nhiêu
        // 20 coi bao nhiêu
        // 21 coi bao nhiêu
        //TEST CASE: một tình huống hàm được đưa vào sử dụng
        //giả lập hành vi xài của ai đó
        
        //TEST CASE: là 1 tình huống sử dụng app mà nó bao hàm
        //data đầu vào cụ thể nào đó
        //OUTPUT đầu ra ứng với xử lí của hàm dĩ nhiên dùng đầu vào
        //để xử lí
        //SO SÁNH kết quả có như kì vọng hay không
        long expected = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = 120 (expected); actual: " + actual);
    }

}
