/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xwyvernpx.mathutil.core;

/**
 *
 * @author wyvernp
 */
//cloning math util of jdk
// tool for others class, function -> oftent use static
public  class MathUtil {
    public static final double PI = 3.141592653589793;
    // Quy uoc :
//        no fatorial for negative
    //0!  = 1!  = 1
    // max n = 21 -> 18 zeros -> exceed long type
    // only accecpt 0<= n <= 21 
    // larger than 21 fuck it off
    public static long getFactorial(int n ) throws IllegalArgumentException
    {
        if(n<0 || n > 20)throw new IllegalArgumentException("");
        if(n==1 || n== 0 ) return 1;
        return n * getFactorial(n-1) ;
    }
    // NEW SOFTWARE TECHNIQUE (KEEP BUT IMPROVE )
//    NEW PLUGIN FOR DEV -> WRITE CODE 
//    QUALITY NOT ON SPEECH BUT ON 
    // TDD TECHNIQUE - TEST DRIVE DEVELOPEMENT
    // CODE AND CODE TO TEST CODE CONCURRENTLY
    // EACH FUNCTION,CLASS DONE, MUST HAVE TEST CASE IMMEDIATELY TO CHECK WHETHER FUNCTION WORK PROPERLY
    
}