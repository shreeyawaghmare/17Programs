
public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		for(int i=3;i>=0;i--)
		   try{
		     System.out.println("a/i");  
		   }
		catch(Exception e)
        {
            System.out.println(e);       
        }
        finally
        {
            System.out.println("finally executed");
        }
        

	}

}
