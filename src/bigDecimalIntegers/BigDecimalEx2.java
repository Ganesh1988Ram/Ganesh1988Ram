package bigDecimalIntegers;

import java.math.BigDecimal;

public class BigDecimalEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create two new BigDecimals
        BigDecimal bd1 = 
               new BigDecimal("124567890.0987654321");
        BigDecimal bd2 = 
               new BigDecimal("987654321.123456789");
          
        // Addition of two BigDecimals
        bd1 = bd1.add(bd2);
        System.out.println("BigDecimal1 = " + bd1);
  
        // Multiplication of two BigDecimals
        bd1 = bd1.multiply(bd2);
        System.out.println("BigDecimal1 = " + bd1);
  
        // Subtraction of two BigDecimals
        bd1 = bd1.subtract(bd2);
        System.out.println("BigDecimal1 = " + bd1);
  
        // Division of two BigDecimals
        bd1 = bd1.divide(bd2);
        System.out.println("BigDecimal1 = " + bd1);
  
        // BigDecima1 raised to the power of 2
        bd1 = bd1.pow(2);
        System.out.println("BigDecimal1 = " + bd1);
  
        // Negate value of BigDecimal1
        bd1 = bd1.negate();
        System.out.println("BigDecimal1 = " + bd1);

	}

}


/*
 * 
Declaration
double a, b;                
BigDecimal A, B;

 
Initialization:
a = 5.4;
b = 2.3;
A  = BigDecimal.valueOf(5.4);
B  = BigDecimal.valueOf(2.3); 
 * ============================================================================
 If you are given a String representation of a double number then you can initialize in the following manner:

A  = new BigDecimal(“5.4”);
B  = new BigDecimal(“1238126387123.1234”); 
For ease of initialization BigDecimal class has some pre-defined constants:

A = BigDecimal.ONE;
// Other than this, available constants
// are BigDecimal.ZERO and BigDecimal.TEN 
 * =====================================================================================================
 * 
 * Mathematical operations:

int c = a + b;
BigDecimal C = A.add(B); 
Other similar function are subtract() , multiply(), divide(), pow()
But all these functions, except pow() which takes integer as its argument, take BigDecimal as their argument so if we want these operation with decimals or string convert them to BigDecimal before passing them to functions as shown below:

String str = “123456789.123456789”;
BigDecimal C = A.add(new BigBigDecimal(str));
double val  = 123456789.123456789;
BigDecimal C = A.add(BigDecimal.valueOf(val)); 
=========================================================================================================
Extraction of value from BigDecimal:

// value should be in limit of double x
double x   =  A.doubleValue();   

// To get string representation of BigDecimal A
String z = A.toString();   
=========================================================================================================
Comparison:

if (a < b) {}         // For primitive double
if (A.compareTo(B) < 0)  {} // For BigDecimal
Actually compareTo returns -1(less than), 0(Equal), 1(greater than) according to values.

For equality we can also use:

if (A.equals(B)) {}  // A is equal to B 
========================================================================================================


 * 
 * 
 * 
 */
