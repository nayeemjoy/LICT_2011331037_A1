
public class InputFromCommandPromt {

	public static void main(String[] args) {

		for (String string : args) {
			System.out.println("Length Is "+ string.length());
			System.out.println("Uppercase of "+string+" is "+string.toUpperCase());
			if(string.equals(new StringBuilder(string).reverse().toString())){
				System.out.println("String "+string+" is a Palindrom");
			}
			else
				System.out.println("String "+string+" is not a Palindrom");
		}
		
		

	}

}
