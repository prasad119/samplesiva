package SamplePackage;

public class Substr {
	
	public String frontBack(String str) {
		 if(str.length() <=1)
	           
	           return str;
	           
	           String mid = str.substring(1,str.length()-1);
	           
	           // last + mid + first
	           
	           return str.charAt(str.length()-1) +mid + str.charAt(0);
	        
	        }
	     
public static void main(String args[]){
	Substr sr = new Substr();
     System.out.println(sr.frontBack("S"));

}

}