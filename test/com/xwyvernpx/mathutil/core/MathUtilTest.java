/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.xwyvernpx.mathutil.core;

import org.junit.Test;
import  org.junit.Assert;

/**
 *
 * @author wyvernp
 */
public class MathUtilTest {
    //TEN HAM TEST TELL US ABOUT WHAT TO TEST
    //TEST HAM GIAI THUA KHI DUA GIA TRI DUNG VA PHAI TRA VE GIA TRI DUNG
    // follow convention
//    @Test , @ duoc goi la ANOTATION , ki hieu , flag de danh dau doan code
//       mang 1 y nghia nao do, va khi bien dich/ compile code thif thu vien di
    //kem no se tu dong generate ra them code cho minh tuy theo
    /*
        Vi du @Test thi thu vien JUnit nay import no se ngam ngam tu generate 
    ham nay thanh public static void main() va gui main()nay cho jvm
    Ki thuat dung thu vien bi ep phia theo cu phap cua no qua nhung @ , thu vien nay goi la Framework
    */
    /*
    getF duoc thuoc ke quang exception if n < 0 || n >  20
    tuc la net goi getF(-5) thi cho goi se nhan ve exception named IllegalArgumentsExpception
    dua ca chon , nhan ngoai le
    bat xem ham minh co dung nem ngoai le hay khong neu data ca chon
    THAY NGOAI LE MUNG ROI NUOC MAT
    */
    @Test(expected = Exception.class)
    // khi chay ham nay kiem tra gium co ngoai le thuoc nhom Illegeal.... xuathien hay khong
    // no xuat hien = cach new illegal....
    //neu xuat hien mung roi nuoc mat
    // ki vong may xuat hien , va may xuat hien => GREEN
    public void testFactorialGivenWrongArgumentThrowsException(){
         MathUtil.getFactorial(-5);
         
    }
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
                //TEST CASE 1  : 0! expect 1
          Assert.assertEquals(expected, actual);
          //TEST CASE 2 : 1! expect 1
          expected = 1;
          
          actual = MathUtil.getFactorial(1);
          Assert.assertEquals(expected, actual);
          //TEST CASE 3 : 2! expect 2
          expected = 2;
          actual = MathUtil.getFactorial(2);
          Assert.assertEquals(expected, actual);
          
    }
    /*
        GREEN RED RULE : 
            - GREEN when all test case in a method passed -> all expected === actual
            - RED Only one test case in method failed -> method- failed => One for all
                ==> Function working properly means passed all case, only 1 failure -=> function is not stable-> wrong
         CANNOT TEST ALL CASE BUT CASES TESTED MUST PASS ENTIRELY
    RED : Happen when there is difference between EXPECTED !== ACTUAL include 2 reasons : 
        + EXPECTED right, manually calculate when not have function
        + ACTUAL wrong, function => wrong
    
            EXPECTED Wrong, => this test case is trash, QC/QA will be punished
            EXPECTED Wrong -> no actual
    */
    @Test
    public void testFactorialGivenRightArgumentReturnWell2(){
        long expected = 6;
        long actual = MathUtil.getFactorial(3);
                //TEST CASE 4  : 3! expect 6
          Assert.assertEquals(expected, actual);
          //TEST CASE 5 : 4! expect 24
          expected = 24;
          
          actual = MathUtil.getFactorial(4);
          Assert.assertEquals(expected, actual);
          //TEST CASE 6 : 5! expect 120
          expected = 120;
          actual = MathUtil.getFactorial(5);
          Assert.assertEquals(expected, actual);
          
          //TEST CASE 7 : 6! expect 720
          expected = 720;
          actual = MathUtil.getFactorial(6);
          Assert.assertEquals(expected, actual);
          
    }
    /*
        FW la thu vien, nhung file jar , dll  chua mot dong class
    */
    /*
    DDT t
    tach bo data kiem thu ra 1 cho
    lat hoi nhoi/nap/fill, feed data nay tua tu vao cho kiem thu
    Vidu tacg data da kiem thu o tren than
    1   0
    1   1
    2   2
    6   3
    24  4
    120 5
    720 6
    thay vi lenh so sanh viet cho tung case , ta bien lenh nay tro thanh tong quat, khong dien data cu the, ma se lay data tu dau do
    
    
    ??? -> se lay tu tap  data o tren 
    code gon hon , dep hon, de maintain hon, kiem soat duoc du thieu cac case 
    ky thuat tach code test ra khoi data cua no lat fill lai sau duoc goi la ky thuat viet test case tham so hoa (parameterize | Data Driven tesing)
    KIEM THU HUONG VE TACH DATA RIENG RA 
    */
    @Test
    public void tryJUnitFirst() {
    //TEN LA TEST SCRIPT
//TEST SCRIPT LA NHUNG DOAN CODE DUOC ViET RA DE TEST CODE KHAC < CODE CHINH
        // GOI CAC HAM CODE CHINH DE SO SANH GIA TRI THUC TE VA GIA TRI KI VONG
        // TEST SCRIPT NAY PHAI BAO GOM CAC TEST CASE BEN TRONG
        //VD : TEST SCRIPT NAY SE TEST 5! 6! -5!
        Assert.assertEquals(70,70);
    }
    
}
