
public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		for(int i=3;i>=0;i--)
			System.out.println("between try and catch");
		   try{
		     System.out.println("a/i");  
		   }
		  
		   catch (ArithmeticException e){
		       System.out.println(e);
		   }
           finally 
           {
               System.out.println("finally executed");
           }
		
	}

}
