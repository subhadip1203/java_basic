package stringPackage;

public class StringClass {

	public static void main(String[] args) {
		
//		string is in build complex data type
		String myString = "Subhadip";
		System.out.println(myString);
		
//		concatenation of  string
		String newString = myString+" !!";
		System.out.println(newString);
		
//		ends with check
		boolean isCorrect = newString.endsWith("!!");
		System.out.println(isCorrect);
		
//		length of a string
		System.out.println(newString.length());
		
//		location of a substring in the string
		System.out.println(newString.indexOf("bha"));
		System.out.println(newString.indexOf("x"));
		
//		replace substring
		String newString2 = newString.replace("!", "*");
		System.out.println(newString2);
		
//		to lower case and upper case
		String newLowerCaseStr = newString.toLowerCase();
		System.out.println(newLowerCaseStr);
		String newUpperCaseStr = newString.toUpperCase();
		System.out.println(newUpperCaseStr);
		
		
	}

}
