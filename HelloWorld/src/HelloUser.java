/**
 * 
 */

/**
 * @author Toghrul
 *
 */
public class HelloUser {
	String userName;

	public HelloUser(String userName) {
		this.userName = userName;
		System.out.printf(userName);
		System.out.println();
	}

	public void greetUser() {
		System.out.println("Hello " + userName);
	}
}
	