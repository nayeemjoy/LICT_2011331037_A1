import java.util.Scanner;


public class TestRectangle {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rectangle[] rectangle = new Rectangle[5];
		
		for (int i = 0; i < rectangle.length;i++) {
			System.out.println("Enter Length and Breadth of Rectangle "+(i+1));
			rectangle[i] = new Rectangle(sc.nextInt(), sc.nextInt());
		}
		for (Rectangle r : rectangle) {
			System.out.println(r.toString());
		}
	}
}
