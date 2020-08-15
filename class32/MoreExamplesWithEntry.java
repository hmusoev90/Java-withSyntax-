package com.syntax.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MoreExamplesWithEntry {
	public static void main(String[] args) {

		Map<String, String> movies = new TreeMap<>();
		movies.put("Comedy", "Movie 43");
		movies.put("Horror", "Bird Box");
		movies.put("Fiction", "Avengers");
		movies.put("Action", "James Bond");
		movies.put("Romance", "Titanic");

		System.out.println(movies);
		Set<Entry<String, String>> allEntries = movies.entrySet();

		Iterator<Entry<String, String>> itMovies = allEntries.iterator();

		while (itMovies.hasNext()) {
			Entry<String, String> entry = itMovies.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " - " + value);
		}

	}
}
