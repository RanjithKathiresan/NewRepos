package arrayDemo;

public class ArrayDemo {
	
	int a[]= {10, 20, 30, 40, 50, 60, 70, 80};
	
	public void arrayDemo() {
		
		
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++)
			
		{
			System.out.println(a[i]);
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		ArrayDemo demo = new ArrayDemo();
		demo.arrayDemo();
		
	}

}