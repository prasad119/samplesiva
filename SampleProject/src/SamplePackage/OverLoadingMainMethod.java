package SamplePackage;

public class OverLoadingMainMethod {

	public static void main(int a){
		System.out.println(a);
	}

	public static void main(String args[]){
		
		System.out.print("main() method is invoked  ");
		
		main(20);
	}

}
