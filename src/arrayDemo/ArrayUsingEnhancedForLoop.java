package arrayDemo;

public class ArrayUsingEnhancedForLoop {
	
	int a[]= {25,45,56,78,90};
	
	public void ArrayUsingEnhanced() {
	
		for(int h:a) {
			
			System.out.print(h);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayUsingEnhancedForLoop key = new ArrayUsingEnhancedForLoop();
		key.ArrayUsingEnhanced();
	}
	}