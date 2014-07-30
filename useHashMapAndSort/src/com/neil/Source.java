package com.neil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Source {
	private static HashMap<String, Float> movieScore;

	public static void main(String[] args) {
		movieScore = new HashMap<String, Float>();
		movieScore.put("Alex", (float) 95.5);
		movieScore.put("Bibby", (float) 75.6);
		movieScore.put("Charlie", (float) 85.5);
		movieScore.put("David", (float) 75.5);

		List<Map.Entry<String, Float>> list_Data = new ArrayList<Map.Entry<String, Float>>(movieScore.entrySet());

		Collections.sort(list_Data, new Comparator<Map.Entry<String, Float>>() {
			public int compare(Map.Entry<String, Float> entry1,
					Map.Entry<String, Float> entry2) {
				//System.out.println(entry2.getValue() + "\t" + entry1.getValue());
				return (int) (entry2.getValue() - entry1.getValue());
			}
		});
		for (Map.Entry<String, Float> entry : list_Data) {
			prfloatGrade(entry.getKey());
		}
	}

	private static void prfloatGrade(String name) {
		System.out.println(name + "\t" + movieScore.get(name));
	}
}
