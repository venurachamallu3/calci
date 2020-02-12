package epam;
import java.util.Scanner;
public class Task1 {
		public static void main(String[] args)
		{
			Scanner kb=new Scanner(System.in);
			System.out.println("Simple Calculator");
			System.out.println("\nWhere are your options:");
			System.out.println("\n1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Division");
			System.out.println("4.Multiplication");
			System.out.print("\nWhat would you like to do?:");
			int choice=kb.nextInt();
			System.out.println();
			if(choice==1)
			{
				addition();
			}
			else if(choice==2)
			{
				subtraction();
			}
			else if(choice==3)
			{
				division();
			}
			else if(choice==2)
			{
				multiplication();
			}
			System.out.println();
			kb.close();
		}
		public static void addition()
		{
			int num_one,num_two;
			Scanner kb= new Scanner(System.in);
			System.out.println("Addition");
			System.out.println("\nFirst Number");
			num_one=kb.nextInt();
			System.out.println("\nSecond Number");
			num_two=kb.nextInt();
			kb.close();
			System.out.println("\nSum: "+num_one+" + "+num_two+" = "+(num_one+num_two));
		}
		public static void subtraction()
		{
			int num_one,num_two;
			Scanner kb= new Scanner(System.in);
			System.out.println("Subtraction");
			System.out.println("\nFirst Number");
			num_one=kb.nextInt();
			System.out.println("\nSecond Number");
			num_two=kb.nextInt();
			kb.close();
			System.out.println("\nSum: "+num_one+" - "+num_two+" = "+(num_one-num_two));
		}
		public static void division()
		{
			int num_one,num_two;
			Scanner kb= new Scanner(System.in);
			System.out.println("Division");
			System.out.println("\nFirst Number");
			num_one=kb.nextInt();
			System.out.println("\nSecond Number");
			num_two=kb.nextInt();
			kb.close();
			System.out.println("\nSum: "+num_one+" / "+num_two+" = "+(num_one/num_two));
		}
		public static void multiplication()
		{
			int num_one,num_two;
			Scanner kb= new Scanner(System.in);
			System.out.println("Multiplication");
			System.out.println("\nFirst Number");
			num_one=kb.nextInt();
			System.out.println("\nSecond Number");
			num_two=kb.nextInt();
			kb.close();
			System.out.println("\nSum: "+num_one+" * "+num_two+" = "+(num_one*num_two));
		}
}
