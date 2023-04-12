package arrayDemo;

public class TwoDimensionalArrayDemo {
	
	int a[]= {30,50,70};

	int b[][]= {{20,30,40},
			    {29,30,50},
			    {90, 80, 56}};

public void twoDimArray() {
	
	
//  //Iterating a array
//	
//	for(int i=0; i<a.length;i++)
//		
//	{
//		System.out.print(a[i] + " " );
//		
//	}
//	
	
	
	//Iterating b array
	
	for(int row = 0; row<b.length; row++)
		
	{
		for(int col = 0; col<b.length;col++)
			
		{
			
			System.out.print(b[row][col] + " ");
		}
		
		System.out.println("");
		
	}
	
}

public static void main(String[] args) {
	
	TwoDimensionalArrayDemo m = new TwoDimensionalArrayDemo();
	
m.twoDimArray();
	
}

}
