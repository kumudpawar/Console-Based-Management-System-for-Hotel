import java.util.Scanner;

public class Customer 
{
	String name;
	Scanner sc = new Scanner(System.in);
	void getCustDetail()
	{
		System.out.println("Please Enter Customer Name :");
		name = sc.nextLine();
		
	}
	void dispcustDetail()
	{
		System.out.println("        Name : "+name);
		System.out.println();
	}

}
