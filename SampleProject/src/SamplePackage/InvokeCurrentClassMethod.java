package SamplePackage;

public class InvokeCurrentClassMethod {

	
	void m(){
		
	}
void n(){

	m();
	
}

public static void main(String args[]){
	
new InvokeCurrentClassMethod().n();
}
}