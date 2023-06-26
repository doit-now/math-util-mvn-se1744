/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.giaolang.mathutil.core.test;

import static org.giaolang.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MathUtilityAdvancedTest {
   
    
    //hàm trả về mảng 2 chiều gồm nhiều dòng, 2 cột
    //0 -> 1
    //1 -> 1
    //2 -> 2
    //6 -> 720
    //mảng 2 chiều, cột 0 là n, cột 1 là expected 
    //n    expected
        
    public static Object[][] initTestData() {
        //int a[] = {5, 10, 15, 20};
        Object testData[][] = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {4, 24}, 
                               {5, 1200}
                              };  
        
        return testData;
    } 
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void checkFactorialGivenRightArgumentReturnsWell(int n, long expected) {
                                                         //  cột 0       cột 1        
        assertEquals(expected, getFactorial(n));
    }    
}

//BẮT NGOẠI LỆ THÌ SAO, TỨC LÀ HÀM CỦA TA GETF() TRẢ VỀ
//NGOẠI LỆ KHI ĐƯA N CÀ CHỚN -1, -2, N > 20
//JUNIT ĐƯA RA HÀM MỚI, AssertThrows()
//hàm này lại xài LAMBDA EXPRESSION, THỨ 5 CẤM VẮNG
//VÌ ÔNG SẼ GIẢNG CĂN BẢN VỀ LAMBDA LÀ GÌ???
//                        CHỈ CÒN CÁI DÂY NỊT



//TDD: Test Driven Development: là kĩ thuật dành cho dân dev
//     nói về việc viết code chính cần phải đc kiểm tra ngay về chất lượng
//     nên viết code chính đan xen, xen kẽ cùng với việc thiết kế
//     các test case để test code chính
//     Lập trình mà viết code chính và code test (JUnit, Unit Test) 
//     đan xen xen kẽ nhau thì gọi là TDD
//     VIẾT CODE HƯỚNG THEO VIỆC KIỂM THỬ NGAY CODE

//DDT: Data Driven Testing: là kĩ thuật mở rộng, bổ sung thêm cho
//     TDD trong đó việc viết code test đc tách riêng ra so với test 
//     data nghĩa là bộ dữ liệu test thường đc đặt để ở 1 mảng 2 chiều
//     hoặc để ở table, file txt, Excel sau đó đc nhồi/fill/map vào
//     trong câu lệnh kiểm thử!!!
//     Việc data tách riêng ra, sau đó fill trở lại hàm so sánh qua
//     tên biến THÌ DDT CÒN ĐC GỌI LÀ PARAMETERIZED TESTING







