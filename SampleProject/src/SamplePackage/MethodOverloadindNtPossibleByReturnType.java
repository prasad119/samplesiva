package SamplePackage;

public class MethodOverloadindNtPossibleByReturnType {

	void sum(int a,int b)
	{
		System.out.println( (a +b) );
	}

   void sum(int a,int b,int c){
	   System.out.println( (a +b +c) ); 
   }
 
   public static void main(String args[]){
	   MethodOverloadindNtPossibleByReturnType  MONB = new MethodOverloadindNtPossibleByReturnType();
	   MONB.sum(10, 20);
	   MONB.sum(10,20,30);
	   
   }

}
