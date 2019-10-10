public class EnhancedSwitch{
	public static void main(String[] a){
		String day = "MONDAY";
		switch (day) {
			case "MONDAY","FRIDAY","SUNDAY" -> System.out.println(6);
			case "TUESDAY" -> System.out.println(7);
			case "THURSDAY","SATURDAY" -> System.out.println(8);
			case "WEDNESDAY" -> System.out.println(9);
		}
		
		int numLetters = switch (day) {
			case "MONDAY","FRIDAY","SUNDAY" -> 6;
			case "TUESDAY"                -> 7;
			case "THURSDAY","SATURDAY"     -> 8;
			case "WEDNESDAY"              -> 9;
			default -> 0; // if default is missing, will throw error - "the switch expression does not cover all possible input values"
		};
		System.out.println("num days - " + numLetters);
	}
}