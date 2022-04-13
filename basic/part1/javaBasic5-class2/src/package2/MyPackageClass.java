package package2;

public class MyPackageClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public void dowork() {
		System.out.println("public method , accessible to all packages");
	}
	
	private void doPrivateTask() {
		System.out.println("Private method ,not to all packages");
	}
	
	void doGeneralWork() {
		System.out.println("general method , accessible to only packages");
	}

}
