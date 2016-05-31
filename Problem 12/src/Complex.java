
public class Complex {
	private float real;
	private float imag;
	
	
	public Complex() {
		super();
		
		this.real = 0f;
		this.imag = 0f;
	}
	public Complex(float real, float imag) {
		this.real = real;
		this.imag = imag;
	}
	public float getReal() {
		return real;
	}
	public void setReal(float real) {
		this.real = real;
	}
	public float getImag() {
		return imag;
	}
	public void setImag(float imag) {
		this.imag = imag;
	}
	
	public static void main(String[] args) {
		Complex complex1 = new Complex(2,2);
		Complex complex2 = new Complex(3,4);
		System.out.println(complex1);
		System.out.println(complex2);
		
		complex1.add(complex2);
		complex1.subtract(complex2);
	}
	
	public void add(Complex complex) {
		System.out.print("Sum of ");
		float x,y;
		x = this.real + complex.real;
		y = this.imag + complex.imag;
		System.out.print(this.real +" + "+ this.imag+"i & ");
		System.out.print(this.real +" + "+ this.imag+"i is : ");
		System.out.println(x +" + "+ y + "i");
	}
	public void subtract(Complex complex) {
		System.out.print("Subtraction of ");
		float x,y;
		x = this.real - complex.real;
		y = this.imag - complex.imag;
		System.out.print(this.real +" + "+ this.imag+"i & ");
		System.out.print(this.real +" + "+ this.imag+"i is : ");
		System.out.println(x +" + "+ y + "i");
	}
	@Override
	public String toString() {
		return real + " + " + imag + "i";
	}
	
}
