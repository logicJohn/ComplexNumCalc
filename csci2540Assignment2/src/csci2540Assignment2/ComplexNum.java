package csci2540Assignment2;

public class ComplexNum {

	public double real;
	public double imaginary;
	
	public ComplexNum () {
		this.real = 0;
		this.imaginary = 0;
	}
	
	public ComplexNum (double real, double imaginary) {
		
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public double getReal () {
		return this.real;
	}
	
	public double getImaginary () {
		return this.imaginary;
	}
	
	public void setReal (double real) {
		this.real = real;
	}
	
	public void setImaginary (double imaginary) {
		this.imaginary = imaginary;
	}
	
	public ComplexNum add (ComplexNum added) {
		return new ComplexNum (this.real + added.getReal() , this.imaginary 
				+ added.getImaginary() );
	}
	
	public ComplexNum sub (ComplexNum subtract) {
		return new ComplexNum (this.real - subtract.getReal(), this.imaginary
				+ subtract.getImaginary() ); 
	}

	public ComplexNum mul (ComplexNum multiple) {
		return new ComplexNum (this.real - multiple.getReal(), this.imaginary
				+ multiple.getImaginary() );
	}
	
	
	public String toString () {
		return   real + "+" + imaginary + "i";
	}
	
	
	
	

}
