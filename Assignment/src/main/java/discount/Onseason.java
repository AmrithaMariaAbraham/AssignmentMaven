package discount;
public class Onseason 
{
	float discount=0.4f,totalamount=0;
	 public void discount(int total)
	 {
		 System.out.println("Onseason discount");
		 totalamount=total+(discount*total);
		 System.out.println("Total amount after discount:"+totalamount);
	 }
}
