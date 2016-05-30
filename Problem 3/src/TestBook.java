import java.util.Iterator;
import java.util.Scanner;


public class TestBook {
	
	public Book[] books;
	
	public void createBooks(int n) {
		books = new Book[2];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < books.length;i++){
			System.out.println("Enter Title and Price of Book " + (i+1));
			books[i] = new Book(sc.nextLine(), sc.nextFloat());
			sc.nextLine();
		}
	}
	
	public void showBooks() {
		for(Book book : books) {
			System.out.println("\nTitle " + book.getTitle());
			System.out.println("Price : Rs." + book.getPrice());
		}
	}
	
	
	public static void main(String[] args) {
		TestBook test = new TestBook();
		test.createBooks(2);
		test.showBooks();
	}
}
