package org.giaolang.mathutil.core;

//class này sẽ mô phỏng, clone lại cái class java.util.Math
//huyền thoại, mà bên trong có các hàm static nổi tiếng
//Math.sqrt() Math.sin() Math.random()
//và con số PI nổi tiếng 

public class MathUtility {
    
    public static final double PI = 3.1415;
    
    //hàm này tính n! = 1.2.3...n
    //thiết kế hàm này như sau
    //0! = 1! =1
    //ko có âm giai thừa. Nếu đưa -1!, -5!, -10!: CHỬI - NÉM NGOẠI LỆ
    //vì giai thừa tăng rất nhanh, 20 giai thừa là vừa đủ cho long
    //long: 18 con số 0
    //21 giai thừa kiểu long chứa ko đc
    //hàm chỉ cho phép n = 0..20
    //đưa n > 20; CHỬI, NÉM RA EXCEPTION
    public static long getFactorial(int n) {
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
        
        if (n == 0 || n == 1)               
            return 1;
        
        long product = 1; //biến nhân dồn
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;        
    }
}
