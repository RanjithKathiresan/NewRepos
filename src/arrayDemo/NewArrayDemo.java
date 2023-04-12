package arrayDemo;

public class NewArrayDemo {
	
	int a[]= {23, 49, 59, 50, 80, 50};

  public void newArrayDemo()
  
  {
	  for(int i=0;i<a.length;i++)
		  
	  {
		  
		  System.out.println(a[i]);
	  }
	  
	  
  }
  
  public static void main(String[] args) {
	
	  NewArrayDemo demo = new NewArrayDemo();
	  demo.newArrayDemo();
}
	
	
}
