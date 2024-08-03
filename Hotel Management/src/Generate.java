
public class Generate extends Bill
{
	void dispBill()
	{
   for(int i=1;i<=12;i++)
   {
	   if(arr[i]==1)
	   {
		   System.out.println("  Spring Rolls              "+p[i]+"   Price :"+70*p[i]+" rs");
	   }
	   if(arr[i]==2)
	   {
		   System.out.println("  French Onion Soup         "+p[i]+"   Price :"+120*p[i]+" rs");
	   }
	   if(arr[i]==3)
	   {
		   System.out.println("  Casear Salad              "+p[i]+"   Price :"+100*p[i]+" rs");
	   }
	   if(arr[i]==4)
	   {
		   System.out.println("  French Fries              "+p[i]+"   Price :"+80*p[i]+" rs");
	   }
	   if(arr[i]==5)
	   {
		   System.out.println("  Veg Biryani             "+p[i]+"   Price :"+170*p[i]+" rs");
	   }
	   if(arr[i]==6)
	   {
		   System.out.println("  Chilly Paneer Gravy      "+p[i]+"   Price :"+205*p[i]+" rs");
	   }
	   if(arr[i]==7)
	   { 
		   System.out.println("  Manchurian Gravy          "+p[i]+"   Price :"+175*p[i]+" rs");
	   }
	   if(arr[i]==8)
	   {
		   System.out.println("  Sweet & Sour Veg          "+p[i]+"   Price :"+175*p[i]+" rs");
	   }
	   if(arr[i]==9)
	   {
		   System.out.println("  Tea                       "+p[i]+"   Price :"+40*p[i]+" rs");
	   }
	   if(arr[i]==10)
	   {
		   System.out.println("  Coffee Americano          "+p[i]+"   Price :"+60*p[i]+" rs");
	   }
	   if(arr[i]==11)
	   {
		   System.out.println("  Coffee                     "+p[i]+"   Price :"+75*p[i]+" rs");
	   }
	   if(arr[i]==12)
	   {
		   System.out.println("  Mineral Water             "+p[i]+"   Price :"+55*p[i]+" rs");
	   }
	   
   }
           
	}
}
