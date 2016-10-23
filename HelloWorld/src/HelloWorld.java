
import java.util.*;


public class HelloWorld 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Hello ASE2016 - how are you? :)");
		System.out.println("Please enter your name: ");
		String name = s.next();
		
		HelloUser user = new HelloUser(name);
		user.greetUser();
		s.close();	
		
		
	}

}
