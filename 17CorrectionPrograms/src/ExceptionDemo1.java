
public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
	
		for(int i=3;i>=0;i--)
		   try{
		     System.out.println("a/i " + a);  
		   } 
		   catch(ArithmeticException e){
		       System.out.println(e);
		   }

	}

}
