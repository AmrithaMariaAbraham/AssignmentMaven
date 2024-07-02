package discount;
public class Offseason extends Onseason
{
	float dis=0.15f;
	public void discount(int total)
	{
		super.discount(5000);
		totalamount=dis*total;
		System.out.println("Offseason Discount:"+totalamount);
	}
	public static void main(String[] args)
	{
		Offseason obj=new Offseason();
		obj.discount(2000);			
	}
}
