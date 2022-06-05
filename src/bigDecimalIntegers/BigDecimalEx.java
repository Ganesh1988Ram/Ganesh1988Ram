package bigDecimalIntegers;

import java.math.BigDecimal;

public class BigDecimalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a=0.03;
        double b=0.04;
        double c=b-a;
        System.out.println(c);
        
        
        BigDecimal _a = new BigDecimal("0.03");
        BigDecimal _b = new BigDecimal("0.04");
        BigDecimal _c = _b.subtract(_a);
        System.out.println(_c);

	}

}


/*

The BigDecimal class provides operations on double numbers for arithmetic, scale handling, rounding, comparison, 
format conversion and hashing. It can handle very large and very small floating point numbers with great precision
 but compensating with the time complexity a bit.
 
A BigDecimal consists of a random precision integer unscaled value and a 32-bit integer scale.
 If greater than or equal to zero, the scale is the number of digits to the right of the decimal point.
  If less than zero, the unscaled value of the number is multiplied by 10^(-scale)


*/