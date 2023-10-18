package classe;
import java.util.Scanner;
public class BookInputTest {

	public static void main(String[] args) {
		book b = new book();
		Scanner input=new Scanner(System.in);
		String x,y;
		int a;
		System.out.println("Please enter the title of the book");
		x=input.nextLine();
		System.out.println("Please enter the author name");
		y=input.nextLine();
		System.out.println("Please enter the number of page");
		a=input.nextInt();
		b.title=""+x;
        b.authour=""+y;
        b.numberofpages=+a;
	
        System.out.println("The book title is:"+b.title);
        System.out.println("The book author is:"+b.authour);
        System.out.println("The book has "+b.numberofpages+" pages");
	}

}
