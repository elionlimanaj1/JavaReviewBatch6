package com.review02;

public class SwitchCapitalCity {

	public static void main(String[] args) {
		String country = "Pakistan";
		String capitalCity = "";

		switch (country) {
		case "US":
			capitalCity = "Washington DC";
			break;
		case "Russia":
			capitalCity = "Moscow";
			break;
		case "China":
			capitalCity = "Beijing";
			break;
		case "Albania":
			capitalCity = "Tirana";
			break;
		case "Pakistan":
			capitalCity = "Islamabad";
			break;
		case "Turkey":
			capitalCity = "Ankara";
			break;
		default:
			capitalCity = "not in my list";
			break;
		}
		System.out.println("The capital city of " + country + " is " + capitalCity);
	}

}
