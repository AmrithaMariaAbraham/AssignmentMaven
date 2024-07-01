package discount;
public class Onseason 
{
	float discount=0.4f,totalamount;
	 public void discount(int total)
	 {
		 System.out.println("Onseason discount");
		 totalamount=discount*total;
		 System.out.println("Total amount after discount:"+totalamount);
	 }
}
