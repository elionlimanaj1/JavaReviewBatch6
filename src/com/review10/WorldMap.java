package com.review10;

import java.util.*;
import java.util.Map.Entry;

public class WorldMap {

	public static void main(String[] args) {
		Map<String, String> europe = new HashMap<>();
		europe.put("France", "Paris");
		europe.put("Italy", "Rome");
		europe.put("Germany", "Berlin");
		System.out.println(europe);

		Set<Entry<String, String>> entries = europe.entrySet();
		System.out.println(entries);

		Map<String, String> africa = new HashMap<>();
		africa.put("Morocco", "Rabat");
		africa.put("Egypt", "Cairo");
		africa.put("Tunisia", "Tunis");
		System.out.println(africa);

		Map<String, String> asia = new HashMap<>();
		asia.put("China", "Beijing");
		asia.put("Turkmenistan", "Ashgabat");
		asia.put("Japan", "Tokyo");
		System.out.println(asia);

		// HW1 iterate europe by getting keys.
		// HW2 iterate africa by getting entries.
		// HW3 iterate asia by getting values.

		System.out.println("-----------WORLD------------");
		List<Map<String, String>> world = new ArrayList<>();
		world.add(europe);
		world.add(africa);
		world.add(asia);

//		System.out.println(world);

		for (Map<String, String> continentMap : world) {
//			System.out.println(continent);
			Set<String> countryNames = continentMap.keySet();
			for (String country : countryNames) {
				System.out.println(country + " -> " + continentMap.get(country));
			}
			System.out.println();
		}

		// HW<Optional> iterate the world by using iterator

	}

}
