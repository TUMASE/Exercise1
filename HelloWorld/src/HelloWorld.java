/**
 * 
 */

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you? :)");


		System.out.printf("Please enter your name: ");
		HelloUser helloUser = new HelloUser("togrulseyid");
		helloUser.greetUser();
	}

}
