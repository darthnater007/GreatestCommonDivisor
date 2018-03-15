import java.util.Scanner;

public class GreatestDivisor {

	public static void main(String[] args) {
		
		System.out.println("Wecome to the Greatest Divisor App");
		
		Scanner sc = new Scanner(System.in);
		String choice= "Y";
		while(choice.equalsIgnoreCase("Y")) 
		{
		
		System.out.print("Enter an integer:  ");
		int y = sc.nextInt();
		System.out.print("Enter another integer:  ");
		int x = sc.nextInt();	
		
		while (x != y)
			{
				if (y > x) y -= x;
				else x-=y;
			}
			System.out.println(x + " is GCD.");
			
			System.out.print("Continue?  y/n:  ");
			choice = sc.next();
		}
		sc.close();
		System.out.println("Bye!");

	}

}
