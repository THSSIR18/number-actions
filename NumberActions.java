import java.util.Scanner;

public class NumberActions
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Entert a number: ");
		double num = sc.nextDouble();
		
		if (num ==0)
		{
			System.out.println("Current number " + num);
			System.out.println("Opposite number " + num);
		}
		else
		{
			double total= (num * -1);
			double re = (1/num);
			System.out.println("Current number " + num);
			System.out.println("Opposite number " +total);
			System.out.println("Reciprical " + re);
		}
	}
}