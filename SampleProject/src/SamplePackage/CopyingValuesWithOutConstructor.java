package SamplePackage;

public class CopyingValuesWithOutConstructor {
	int id;
	String name;
	CopyingValuesWithOutConstructor(int i,String n){
	   id = i;
	   name =n;
	}
	CopyingValuesWithOutConstructor() {
		//id=J.id;
		//name =J.name;
	}
	
	void display(){
		System.out.println(id+ "  "+name);
	}
public static void main(String args[]){
	
	CopyingValuesWithOutConstructor s1 = new CopyingValuesWithOutConstructor(111,"siva");
	CopyingValuesWithOutConstructor s2 = new CopyingValuesWithOutConstructor();
	
	s2.id=s1.id;
	s2.name= s1.name;
	s1.display();
	s2.display();
      	
}

}
