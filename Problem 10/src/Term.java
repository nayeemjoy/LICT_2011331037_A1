
public class Term {
	private int coefficient = 0;
	private int exponent = 0;
	
	
	public Term() {
		super();
		
	}
	@Override
	public String toString() {
		return "Term [coefficient=" + coefficient + ", exponent=" + exponent
				+ "]";
	}
	public int getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
	public int getExponent() {
		return exponent;
	}
	public void setExponent(int exponent) {
		this.exponent = exponent;
	}
	
}
