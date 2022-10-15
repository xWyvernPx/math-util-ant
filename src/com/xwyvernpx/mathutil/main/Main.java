/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.xwyvernpx.mathutil.main;

import com.xwyvernpx.mathutil.core.MathUtil;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wyvernp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This message from main method");
        System.out.println("This message comes from a US-build JAR file");
        tryTDDFirst();
    }

    public static void tryTDDFirst() {
        try {
            long expected = 1;
            long actual = MathUtil.getFactorial(0);
            
//compare
//test case 1   : 0! = 1
System.out.println("0! status | Expected value : " + expected + "\n" + "| actual : " + actual);
//test case 2 :  1! = 1
System.out.println("1! status | Expected value : " + expected + "\n" + "| actual : " + actual);
//test case 3 :  2! = 2
System.out.println("2! status | Expected value : " + expected + "\n" + "| actual : " + MathUtil.getFactorial(2));
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
