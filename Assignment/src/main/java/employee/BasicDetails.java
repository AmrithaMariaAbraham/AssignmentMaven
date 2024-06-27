package employee;
import java.util.Scanner;
public class BasicDetails
{
	 int basicPay,deduction=5000,bonus=15000;
	 public void basicdetails()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Basic pay:");
		 basicPay=sc.nextInt();
	 }
}
