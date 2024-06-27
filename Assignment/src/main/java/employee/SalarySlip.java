package employee;
public class SalarySlip extends HraPf
{
	int Salary;
	public void salary()
	{
		Salary= (int) (basicPay+hra-pf-deduction+bonus);
	}
	public void salaryslip()
	{
		System.out.println("SalarySlip");
		System.out.println("----------");
		System.out.println("Basic Pay:"+basicPay);
		System.out.println("Deduction:"+deduction);
		System.out.println("Bonus:"+bonus);
		System.out.println("HRA:"+hra);
		System.out.println("PF:"+pf);
		System.out.println("Salary:"+Salary);
	}
	public static void main(String[] args) 
	{
		SalarySlip slip=new SalarySlip();
		slip.basicdetails();
		slip.hrapf();	
		slip.salary();
		slip.salaryslip();
	}
}
