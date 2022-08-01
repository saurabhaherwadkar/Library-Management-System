package whitedevil;
import java.util.Scanner;
public class Library_Management_System {

	private static final int case1 = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char r;
		do {
    	  
      
		System.out.println("**********Library Management System**********");
		System.out.println("Press 1 to add book");
		System.out.println("Press 2 to issue a book");
		System.out.println("Press 3 to return a book");	
		System.out.println("Press 4 to print complete issue detail");
		System.out.println("Press 5 to Exit");
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Eneter any number");
		int a=sc2.nextInt();
		switch(a)
		{
		case 1:
			Library aa = new Library();
		    aa.add();
		    break;
		case 2:
			Library bb = new Library();
			bb.iss();
			break;
		case 3:
			Library cc = new Library();
			cc.ret();
			break;
		case 4:
			Library is = new Library();
			is.detail();
			break;
		case 5:
			Library dd = new Library();
			dd.Exit();
			break;
			default:
				System.out.println("Invalid Number");
			
			
			}
		System.out.println("You want to select next option Y/N");
		r=sc2.next().charAt(0);
		}while(r=='Y');
		
		if(r=='N') {
			Library z = new Library();
			z.Exit();
		}
		
		
		}
	}
	
	

class Library
{
	static String str,b,date;
	static int a,c;
	void add()
	{
		System.out.println("Enter book name,prise and Book_no" );
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		float price = sc.nextFloat();
		int bookno = sc.nextInt();
		System.out.println("Your details is "+ str + price + bookno);
		
	}
	void iss()
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Book Name");
		str = sc1.nextLine();
		System.out.println("Book_id");
		a = sc1.nextInt();
		sc1.nextLine();
		System.out.println("Issue Date");
		b = sc1.nextLine();
		System.out.println("Total number of book Issued");
		c = sc1.nextInt();
		sc1.nextLine();
		System.out.println("Return book date");
		date = sc1.nextLine();
		
		
		}
	int getid()
	{
		return 0;
	}
	void ret()
	{
		System.out.println("Enter Student_name & book_id ");
		Scanner c = new Scanner(System.in);
		String name = c.nextLine();
		int book_id = c.nextInt();
		if(a==book_id) {
			
			System.out.println("Total Details");
			System.out.println("Book Name:" +Library.str );
			System.out.println("Book id ::" + Library.a);
			System.out.println("Issue date "+Library.b);
			System.out.println("Total number os book issued::"+Library.c);
			System.out.println("Book return date :: " +Library.date);
			
		}
		else 
		{
			System.out.println("Wrong id, Please enter Correct id ");
			
		}
		
		
	}
	void detail() {
		System.out.println("Book Name:" +Library.str );
		System.out.println("Book id ::" +Library. a);
		System.out.println("Issue date "+Library.b);
		System.out.println("Total number os book issued::"+Library.c);
		System.out.println("Book return date :: " +Library.date);
		
	}
	void Exit() {
		System.exit(0);
	}


}