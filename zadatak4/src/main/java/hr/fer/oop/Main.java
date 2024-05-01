package hr.fer.oop;

public class Main {
	public static void main(String[] args) {
		try {
			User user = Parser.parseInputString("112/jure/juric/A");
			System.out.println(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
