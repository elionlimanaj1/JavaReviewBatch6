package com.review05;

public class StringManipulation {

	public static void main(String[] args) {
		String str = "Hello2! ";

		System.out.println(str.length());
		System.out.println(str.toUpperCase());

		// str has not changed
		System.out.println(str);
		System.out.println(str.toLowerCase());

		System.out.println(str.equals("hello2! "));
		System.out.println(str.equalsIgnoreCase("hello2! "));

		boolean starts = str.startsWith("he");
		System.out.println("str.startsWith(he) -> " + starts);
		System.out.println(str.endsWith("2! "));

		// Method chaining
		starts = str.toLowerCase().startsWith("he");
		System.out.println(starts);

		char fifthCharacter = str.charAt(4);
		System.out.println(fifthCharacter);

		String reverse = "";
		char[] charArray = str.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
//			System.out.print(charArray[i]);
			reverse += charArray[i];
		}

		System.out.println("reverse is ->" + reverse);
		
		int index = str.indexOf("llo");
		System.out.println(index);
		
		String example = "Something inside here";
		int index2 = example.indexOf("e", 19);
		System.out.println(index2);
	}

}
