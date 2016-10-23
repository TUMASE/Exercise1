import java.util.*;


public class HelloUser 
{	
	
	public static void main(String[] args) 
	{
		String username;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Hello ASE2016 - how are you? :)");
		System.out.println("Please enter your name: ");
		username = s.next();
		greetUser(username);
		s.close();
	}
	
	public static void greetUser(String name)
	{
	System.out.println("Hello "+name+"!");
	}
	
}


