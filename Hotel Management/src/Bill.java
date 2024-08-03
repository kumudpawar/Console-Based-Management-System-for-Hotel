
public class Bill extends Menu {

	int ch,bill=0,q=1,n;
	int arr[] = new int[14];
	int p[] = new int[14];
	void getOrder()
	{
		System.out.println("Enter '0' After finished ordering : ");
		while(true)
		{
			System.out.println("Please Enter Your choice : ");
			
			ch = sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println("Please Enter Quantity :");
			q=sc.nextInt();
			if(q==0  || q<0)
			{
				System.out.println("Please order atleast one item...");
				break;
			}
			bill+=70*q;
			arr[ch]=ch;
			p[ch]=q;
			
			break;
		}
		case 2:
		{
			System.out.println("Please Enter Quantity :");
			q=sc.nextInt();
			if(q==0  || q<0)
			{
				System.out.println("Please order atleast one item...");
				break;
			}
			bill+=120*q;
			arr[ch]=ch;
			p[ch]=q;
			break;
		}
		case 3:
		{
			System.out.println("Please Enter Quantity :");
			q=sc.nextInt();
			if(q==0  || q<0)
			{
				System.out.println("Please order atleast one item...");
				break;
			}
			bill+=100*q;
			arr[ch]=ch;
			p[ch]=q;
			break;
		}
		case 4:
		{
			System.out.println("Please Enter Quantity :");
			q=sc.nextInt();
			if(q==0  || q<0)
			{
				System.out.println("Please order atleast one item...");
				break;
			}
			bill+=80*q;
			arr[ch]=ch;
			p[ch]=q;
			break;
		}
		case 5:
		{
			System.out.println("Please Enter Quantity :");
			q=sc.nextInt();
			if(q==0  || q<0)
			{
				System.out.println("Please order atleast one item...");
				break;
			}
			bill+=170*q;
			arr[ch]=ch;
			p[ch]=q;
			break;
		}
		case 6:
		{
			System.out.println("Please Enter Quantity :");
			q=sc.nextInt();
			if(q==0  || q<0)
			{
				System.out.println("Please order atleast one item...");
				break;
			}
			bill+=105*q;
			arr[ch]=ch;
			p[ch]=q;
			break;
		}
		case 7:
		{
			System.out.println("Please Enter Quantity :");
			q=sc.nextInt();
			if(q==0  || q<0)
			{
				System.out.println("Please order atleast one item...");
				break;
			}
			bill+=175*q;
			arr[ch]=ch;
			p[ch]=q;
			break;
		}
		case 8:
		{
			System.out.println("Please Enter Quantity :");
			q=sc.nextInt();
			if(q==0  || q<0)
			{
				System.out.println("Please order atleast one item...");
				break;
			}
			bill+=175*q;
			arr[ch]=ch;
			p[ch]=q;
			
			break;
		}
		case 9:
		{
			System.out.println("Please Enter Quantity :");
			q=sc.nextInt();
			if(q==0  || q<0)
			{
				System.out.println("Please order atleast one item...");
				break;
			}
			bill+=40*q;
			arr[ch]=ch;
			p[ch]=q;
			break;
		}
		case 10:
		{
			System.out.println("Please Enter Quantity :");
			q=sc.nextInt();
			if(q==0  || q<0)
			{
				System.out.println("Please order atleast one item...");
				break;
			}
			bill+=60*q;
			arr[ch]=ch;
			p[ch]=q;
			break;
		}
		case 11:
		{
			System.out.println("Please Enter Quantity :");
			q=sc.nextInt();
			if(q==0  || q<0)
			{
				System.out.println("Please order atleast one item...");
				break;
			}
			bill+=75*q;
			arr[ch]=ch;
			p[ch]=q;
			break;
		}
		case 12:
		{
			System.out.println("Please Enter Quantity :");
			q=sc.nextInt();
			if(q==0  || q<0)
			{
				System.out.println("Please order atleast one item...");
				break;
			}
			bill+=55*q;
			arr[ch]=ch;
			p[ch]=q;
			break;
		}
		case 0:
		{
			return;
		}
		default : System.out.println("Sorry!! Not Available");
		             
        }
		}
	
	}
}