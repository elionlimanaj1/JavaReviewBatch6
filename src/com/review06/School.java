package com.review06;

public class School {

	public static void main(String[] args) {
		MathOperation math = new MathOperation();

		int result = math.add(4, 5);
		System.out.println("result is " + result);

		math.addNoReturn(4, 5);

		System.out.println(math.add(5, 2));

		result = math.multiply(3, 4);
		System.out.println("multiplication result is " + result);

		// cannot access this method, because it is private
		// math.smth();

		// HW only for Farid :)
		// create divide method
		// create substruct method
	}

}
