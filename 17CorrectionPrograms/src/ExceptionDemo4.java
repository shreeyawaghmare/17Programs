
public class ExceptionDemo4 {
	static void canVote(int age){
		if(age<18)
            try{
                throw new Exception();
            }catch(Exception e){
                System.out.println("you are not an adult!");
            }
		else
		   System.out.println("you can vote!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			canVote(15);
			canVote(18);

	}

}
