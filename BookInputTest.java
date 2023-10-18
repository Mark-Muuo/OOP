package classe;
import java.util.Scanner;
 public class BookInputTest {

	public static void main(String[] args) {
		book b = new book();
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter the title of the book");
		b.title=input.nextLine();
		System.out.println("Please enter the author name");
		b.authour=input.nextLine();
		System.out.println("Please enter the number of page");
		b.numberofpages=input.nextInt();
        System.out.println("The book title is:"+b.title);
        System.out.println("The book author is:"+b.authour);
        System.out.println("The book has "+b.numberofpages+" pages");
	}

}
