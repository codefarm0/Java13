public class EnhancedSwitch2{
	public static void main(String[] a){
		String day = "SUNDAY";
		int j = switch (day) {
		case "MONDAY"  -> 0;
		case "TUESDAY" -> 1;
		default      -> {
			int result = day.toString().length();
			yield result;
			}
		};
		System.out.println("Result - " + j);
		//-----------------------------------------------------
		String flag = "Foon";
		int result = switch (flag) {
		case "Foo": 
			yield 1;
		case "Bar":
			yield 2;
		default:
			System.out.println("Neither Foo nor Bar, hmmm...");
			yield 0;
		};
		
		System.out.println("Result2 - " + result);
	}
}