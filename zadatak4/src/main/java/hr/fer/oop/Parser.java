package hr.fer.oop;

public class Parser {
	public static User parseInputString(String input) throws Exception {
		String[] inputArr = input.split("/");
		int OIB;
		ServiceType serviceType;
		if (inputArr.length != 4) throw new InvalidNumberOfArgumentsException("Exception occured");
		try {
			OIB = Integer.parseInt(inputArr[0]);
			String service = inputArr[3];
			
			switch(service) {
			case "A": serviceType = ServiceType.SUBSCRIBE; break;
			case "B": serviceType = ServiceType.PREPAID; break;
			case "C": serviceType = ServiceType.VIRTUAL;break;
			default: throw new ArgumentParseException("Exception occured");
			
			}
			return new User(OIB, inputArr[1], inputArr[2], serviceType);
			
		} catch (Exception e) {
			throw new ArgumentParseException(e);
		}
		
		
	}
}
