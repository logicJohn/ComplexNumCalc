/**
 * @author Johnnie Hernandez
 * 
 * @version Assignment 2
 * <p> Csci 2540 Assignment2 is a group of methods for creating
 * and manipulating Complex Numbers </p>
 * 
 * This is to test the methods created by ComplexNum.java
 * 
 * ComplexNum is an object to represent a Complex number in form <i> a + bi </i>
 * where the <i> a </i> and <i> b </i> are stored as doubled. 
 * In this case <i> a </i> is called the real number and <i> b </i> is called the imaginary number.
 * 
 */

package csci2540Assignment2;

public class ComplexNumDemo {

	public static void main (String[] args) {	
		ComplexNum zero  = new ComplexNum ();
		ComplexNum test1 = new ComplexNum (2.0, 4.0);
		ComplexNum test2 = new ComplexNum (4.0, -4.0);
		ComplexNum test3 = new ComplexNum (-1, 4);
		ComplexNum test4 = new ComplexNum (0.0, 0.0);
		ComplexNum test5 = new ComplexNum (2, -1);
		ComplexNum temp  = new ComplexNum (0, 0);

		//test equal
		System.out.print("Test equals:");
		if (zero.equals(temp)) {
			System.out.println(" Pass");
		} else {
			System.out.println(" Fail");
		}
		
		//test add
		System.out.print("Test add:");
		temp = test2.add(test3);
		temp = temp.add(test3);
		if (temp.equals(test1)) {
			System.out.println(" Pass");
		} else {
			System.out.println(" Fail");
		}
		
		//test subtract
		System.out.print("Test subtraction:");
		temp = test1.sub(test1);
		if (temp.equals(zero)) {
			System.out.println(" Pass");
		}	else {
			System.out.println(" Fail");
		}
		
		//test multiplication
		System.out.print("Test multiplication:");
		temp = test1.mul(test5);
		if (temp.equals(test2)) {
			System.out.println(" Pass");
		}	else {
			System.out.println(" Fail");
		}

		//test negate/inverse
		System.out.print("Test negate/inverse:");
		temp = test3.mul(test5);
		temp = temp.neg();
		if (temp.equals(test1)) {
			System.out.println(" Pass");
		} else {
			System.out.println(" Fail");
		}
		
		//test toString
		System.out.print("Test toString:");
		if (test2.toString() instanceof String) {
			System.out.println(" Pass");
		} else {
			System.out.println(" Fail");
		}
		
	}
}
