public class StringTextBlock{

public static void main(String[] a){
	
	String normalStr = "I am normal String";
	
	String newTxtBlock = """
		Line1,
	Line2,
	'single quote'
		"double quote"
	..
	..
	Last line.
	<inside tags>
	{inside curly braces}
	""";
	
	System.out.println("normalStr - " + normalStr);
	System.out.println("newTxtBlock - " + newTxtBlock);
	
}

}