import java.util.Scanner;


public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Rectangle[] rectangle = new Rectangle[5];
		
		for (int i = 0; i < rectangle.length;i++) {
			System.out.println("Enter Length and Width of Rectangle "+(i+1));
			rectangle[i] = new Rectangle(sc.nextFloat(), sc.nextFloat());
		}
		for (Rectangle r : rectangle) {
			System.out.println(r.toString());
		}
	}

}
