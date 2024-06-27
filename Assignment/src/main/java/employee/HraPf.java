package employee;
public class HraPf extends BasicDetails
{
	float hra,pf;
	public void hrapf()
	{
		hra=(float)(0.05*basicPay);
		pf=(float)(0.2*basicPay);
	}
}
