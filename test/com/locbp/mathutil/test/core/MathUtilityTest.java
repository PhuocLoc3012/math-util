/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.locbp.mathutil.test.core;

import com.locbp.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {
    //Đây là class sẽ sử dụng
    //các hàm của thư viện/framework để kiểm tra code chính
    //hàm tính giai thừa bên class core.MathUtil
    //viết code để test code chính bên kia

    //có ngiều nguyên tắc đặt tên hàm cho kiểm thử
    //nhưng thường sẽ nói lên mục đích của các case/tình huống kiểm thử
    //tình huống xài hàm theo kiểu thành công và thất bại
    //hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon
    //ta sẽ xài hàm kiểu well - đưa 5!, 6!, ko chơi đưa -5!, 30!
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    //chỗ nào có @Test thì chạy hàm đó
    //có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    public void testGettFactorialGivenRightArgumentReturnsWell() {
        int n = 0; //test thử tình huống tử tế đầu vào
        long expected = 1; //hy vọng 0! = 1
        long actual = MathUtil.getFactorial(n); //gọi hàm cần test bên core

        //so sánh expected với actual dùng framework
        assertEquals(expected, actual);

        //gộp thêm vài case thành công 
        assertEquals(1, MathUtil.getFactorial(1));// tui muốn 1!= 1
        assertEquals(2, MathUtil.getFactorial(2));// tui muốn 2!= 2

        assertEquals(6, MathUtil.getFactorial(3));// tui muốn 3!= 6

    }//hàm giúp so sánh 2 giá trị nào đó có giống nhau hay không
    //nếu giống nhau -> thấy màu xanh đèn đường, code ngon
    //nếu khác -> thấy màu đỏ đèn đường

    //TAO kì vọng ngoại lệ xuất hiện
    //Test case:
    //Input: -5
    //Expected: IllegalArgumentException xuất hiện
    @Test(expected = IllegalArgumentException.class)
    public void testGettFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
        //hàm @Test chạy, hàm getF() chạy sẽ ném ngoại lệ
    }

    //cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn
    //xài lambda
    //Test case: hàm sẽ nhận về ngoại lệ nếu nhận vào 21
    @Test(expected = IllegalArgumentException.class)
    public void testGettFactorialGivenWrongArgumentThrowsException_LambdaVersion() {

        MathUtil.getFactorial(-5);
        //hàm @Test chạy, hàm getF() chạy sẽ ném ngoại lệ
    }

    @Test
    public void testGettFactorialGivenWrongArgumentThrowsException_TryCatch() {
        //chủ động kiểm soát ngại lệ
        try {
            MathUtil.getFactorial(-5);  
        } catch (Exception e) {
            //bắt try-catch là JUnit sẽ ra màu xanh do đã chủ động kiểm soát ngại lệ
            //nhưng k chắc ngoại lệ mình cần có xuất hiện hay k?
            //có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xuất hiện
            assertEquals("Invalid argument. N must be between 0-20", e.getMessage());
            //EXPECTED ---- ACTUAL
        }
        
    }
}
