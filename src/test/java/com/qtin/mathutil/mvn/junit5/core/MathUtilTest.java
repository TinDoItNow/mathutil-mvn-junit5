/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.qtin.mathutil.mvn.junit5.core;

import static com.qtin.mathutil.mvn.junit5.core.MathUtil.*;
//import static là dành riêng cho nhung hàm static
//goi hàm mà bo qua tên class

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Admin
 */
public class MathUtilTest {

    //Choi DDT, tach data ra khoi cau lenh kiem thu, tham so hoa data nay
    //Vao trong cau lenh kiem thu
    //Chuan bi bo data
    public static Object[][] initData() {
        return new Integer[][]{
            {1, 1},
            {2, 2},
            {5, 120},
            {6, 720},};
    }

    @ParameterizedTest
    @MethodSource(value = "initData")//Ten ham cung cap data, ngam dinh thu tu
    //Cua cac phan tu mang, map vao tham so ham
    public void testGetFactorialGivenRightArgReturnsWell(int n, long expected) {
        assertEquals(expected, getFactorial(n));
    }
    //TDD vs DDT
    //TDD - Test Driven Development
    //Ki thuat viet code chinh dan xen, xen ke cung voi viet Test Case/ Test
    //Script tuc la qua trinh viet code lam app ta viet luon nhung doan
    //Code (dung thu vien Unit Test nhu JUnit, TestNG, XUnit, MSTest...)
    //Dung de test ham ta viet
    
    // Viet code va viet code test cung voi nhau thi goi la ki thuat lap trinh huong ve kiem thu-TDD
    
    //DDT - Data Driven Testing
    //La ki thuat bo tro/mo rong them cho ki thuat TDD
    //La ki thuat viet test code ma ta tach rieng nhung bo data test
    //Ra 1 cho, cau lenh so sanh ra 1 cho
    //Ket noi, map/fill test data vao ham test thong qua cac tham so
    //[6, 720]->fill vao 2 bien n, expected va lat hoi 2 bien nay
    //Dc fill vao tiep cai ham assertEqual(expected, getF(n))
    
    //Data dc tach rieng ra, bien thanh tham so cho ham kiem thu
    //Kiem thu nay dc goi la tach data huong cho viec kiem thu
    //DDT
    //Con goi la 1 ten khac la Parameterized
//    
//    @Test
//    public void testGetFactorialGivenRightArgReturnsWell() {
//        assertEquals(120, getFactorial(5));
//    }
    //Bat ngoai le khi dua data ca chon!!!
    //@Test(expected = ten ngoai le.class) JUnit4 hoy, JUnit5 hok xai vay!!!

    @Test
    public void testGetFactorialGivenWrongArgThrowException() {
        //Xai bieu thuc Lambda
        //Ham nhan tham so thu 2 la 1 cai obj/co code implement cai
        //Functional interface ten la Excutable - co 1 ham duy nhat ko code
        //Ten la execute()
        //Choi cham
//        Executable exObject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            }
//        };
//        Executable exObject = () -> getFactorial(-5);
//        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
    }
}
