package SamplePackage;

import SamplePackage.Bank.Axis.Icici;
import SamplePackage.Bank.Axis.Icici.Sbi;

class Bank {
	
int getRateOfInterest(){
	return 0;
}
class Axis extends Bank{
	int getRateOfInterest(){
		return 8;
		
	}
	class Icici extends Bank{
		
		int getRateOfInterest(){
			return 10;
		}
	class Sbi extends Bank
	{
		int getRateOfInterest(){
			return 12;
		}
	}
	
class Test1
{
//public static void main(String args[]){
				
			//	Axis Ai = new Axis();
			//	Icici Ic = new Icici();
		   //		Sbi sb =  new Sbi();
			//	System.out.println("SBI Rate of Interest: "+sb.getRateOfInterest());  
			//	System.out.println("ICICI Rate of Interest: "+Ai.getRateOfInterest());  
			//	System.out.println("AXIS Rate of Interest: "+Ic.getRateOfInterest());  
				
			}
			}
}
}
//}
