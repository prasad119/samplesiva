package SamplePackage;

public class ThisConstructorCall {
	 int id;  
	    String name;  
	    String city;  
	      
	    ThisConstructorCall(int id,String name){  
	    this.id = id;  
	    this.name = name;  
	    }  
	    ThisConstructorCall(int id,String name,String city){  
	    this(id,name);//now no need to initialize id and name  
	    this.city=city;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+city);}  
	      
	    public static void main(String args[]){  
	    	ThisConstructorCall e1 = new ThisConstructorCall(111,"karan");  
	    	ThisConstructorCall e2 = new ThisConstructorCall(222,"Aryan","delhi");  
	    	e1.display();  
	    	e2.display();  
	   }  
}
