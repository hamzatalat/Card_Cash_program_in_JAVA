import java.util.Scanner;


public class main extends Cash_payment{
	
	
	public static void main(String[] args) {
		int total_income=0;
		double total_surcharge= 0;
		
		Cash_payment a= new Cash_payment();
		Card_payment b= new Card_payment();
		int choice;
		for(choice=1;choice!=0;)
		{
			System.out.println("please select an option \n 1. Cash \n 2. Card \n 3. Add new option \n 4. Total income \n 0. Exit");
			Scanner input1 = new Scanner(System.in);
			choice= input1.nextInt();
			if(choice==1)
			{
				System.out.println("please input the cash amount");
				//Scanner input1 = new Scanner(System.in);
				a.cash = input1.nextInt();
				total_income+=a.cash;
			}
			if(choice==2)
			{
				System.out.println("please select an option  " );
				for (int i=0;i<b.surcharge.length;i++)
				{
					System.out.print(i);
					System.out.print(" " );
					System.out.print(b.card.get(i) );
					System.out.println();
				}
				int c = input1.nextInt();
				double price = b.surcharge[c];
				System.out.println("please enter the amount  " );
				int prices = input1.nextInt();
				total_income+=prices;
				System.out.println("The surcharge amount is " );
				total_surcharge=(price*prices)/100;
				System.out.println((price*prices)/100 );
				
			}
			if(choice==3)
			{
				b.add_option();
			}
			if(choice==4)
			{
				System.out.print("Total income  " );
				System.out.print(total_income );
				System.out.println();
				System.out.print("Total surcharge  " );
				System.out.print(total_surcharge );
				System.out.println();
			}
		}
		
	    }
	

}
