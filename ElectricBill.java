import java.util.Scanner;

class ElectricBill 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the no of consumed unit : ");
		int unit = scn.nextInt();

		System.out.print("Enter previous dues: ");
		int dues = scn.nextInt();

		int amount=0;
		int EduCess=0;
		double Gtotal=0;
		double pdues=0;


		if(unit<=50){			// first 50 units, 2rs per unit
			amount=unit*2;
		}else if(unit<=100)
		{
			amount=50*2+(unit-50)*4;	//next 100 units, 4rs per unit
		}else if(unit<=150)
		{
			amount=50*2+100*4+(unit-150)*7;	//next 50 units, 7rs per unit
		}else if(unit<=200)
		{
			amount=50*2+100*4+150*7+(unit-200)*10;  // next 50 units, 10rs per unit
		}else if(unit>=250)
		{
			amount = 50*2+100*4+150*7+200*10+(unit-250)*15;  // next 100 units, 15rs per unit
		}
		if(amount>=2000)			// amount is 2000 or above 3% education cess
		{
			EduCess= EduCess+(amount*3)/100;
		}
		if(dues!=0)					// 10% fine on arrears
		{
		 pdues=(dues*10)/100;
		}
		Gtotal=pdues+dues+EduCess+amount;

		System.out.println("===================================");
		System.out.println(" TOTAL BILL AMOUNT ");
		System.out.println("===================================");
		System.out.println("Previous dues   : "+dues);
		System.out.println("Penalty         : "+pdues);
		System.out.println("Education cess  : "+EduCess);
		System.out.println("Current amount  : "+amount);
		System.out.println("------------------------------------");
		System.out.println("Grand Total     : "+Gtotal);


	}
}
