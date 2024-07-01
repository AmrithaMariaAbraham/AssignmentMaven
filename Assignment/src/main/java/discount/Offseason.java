package discount;
public class Offseason extends Onseason
{
	float dis=0.15f,totalamount1=0;
	public void discount(int total1)
	{
		super.discount(5000);
		System.out.println("Offseason discount");
		totalamount1=total1+(dis*total1);
		System.out.println("Total amount afer discount:"+totalamount1);
	}
	public static void main(String[] args)
	{
		Offseason obj=new Offseason();
		obj.discount(5000);			
	}
}
