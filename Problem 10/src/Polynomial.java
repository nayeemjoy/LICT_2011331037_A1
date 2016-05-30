import java.util.Arrays;


public class Polynomial {
	private Term terms[];
	private int position;
	public Polynomial() {
		super();
		terms = new Term[3];
		
		for (int i = 0; i < terms.length; i++) {
			terms[i] = new Term();
		}
		
		
		
	}
	
	
	public void setTerm(int coeff, int exp){
		if(position == terms.length){
			System.out.println("Array size Limit Exceeded");
			return;
		}
		if(exp < 0){
			System.out.println("Exponent is Negative");
			return;
		}
		
		terms[position].setCoefficient(coeff);
		terms[position].setExponent(exp);
		position += 1;
		return;
	}
	
	
	
	@Override
	public String toString() {
		return "Polynomial [terms=" + Arrays.toString(terms) + ", position="
				+ position + "]";
	}


	public static void main(String[] args) {
		Polynomial pol = new Polynomial();
		pol.setTerm(2, 3);
		pol.setTerm(2, 2);
		pol.setTerm(2, 3);
		pol.setTerm(2, 1);
		
		System.out.println(pol.toString());
	}
	
	
	
	
	
	
}
