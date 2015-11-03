package SamplePackage;

public class JavaCopyConstructor {

	int id;
	String name;
	JavaCopyConstructor(int i,String n){
	   id = i;
	   name =n;
	}
	JavaCopyConstructor(JavaCopyConstructor J) {
		id=J.id;
		name =J.name;
	}
	
	void display(){
		System.out.println(id+ "  "+name);
	}
public static void main(String args[]){
	
	JavaCopyConstructor jcc = new JavaCopyConstructor(111,"siva");
	JavaCopyConstructor jcc1 = new JavaCopyConstructor(jcc);
	jcc.display();
	jcc1.display();
      	
}

}
