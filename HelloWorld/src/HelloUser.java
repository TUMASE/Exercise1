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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you now? :)");
	}

}
	