package divisiblity;
public class DivisibleByten extends Add
{
public DivisibleByten()
	{
		super();
		super.add(20,25);
		System.out.println("1st number:"+super.a);
		System.out.println("2nd number:"+super.b);
		System.out.println("Sum of a & b:"+super.sum);
		divisible=sum%10;
		System.out.println("Remainder:"+divisible);
		if(divisible==0)
			System.out.println("Divisible by 10");
		else
			System.out.println("Not divisible by 10");
	}
	public static void main(String[] args)
	{
		DivisibleByten ten=new DivisibleByten();
		System.out.println("Sum:"+ten.add(20,5));
	}
}
