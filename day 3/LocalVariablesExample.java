public class LocalVariablesExample {
	public void showLocalVariables() {
		int number = 10; // local variable
		String message = "Hello, local variables!"; // local variable
		double pi = 3.14159; // local variable
		System.out.println("Number: " + number);
		System.out.println("Message: " + message);
		System.out.println("Pi: " + pi);
	}

	public static void main(String[] args) {
		LocalVariablesExample example = new LocalVariablesExample();
		example.showLocalVariables();
	}
}
