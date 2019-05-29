package com.sachith.example;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
//import java.util.List;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) {
//		List<String> vowels = new ArrayList<>();
//		System.out.println(vowels.size());
//		vowels.add("A");
//		vowels.add("E");
//		vowels.add("I");
//		vowels.add("O");
//		vowels.add("U");
//		System.out.println(vowels.size());
//		vowels.remove(3);
//		System.out.println(vowels.size());
//		for(String vowel:vowels)
//			System.out.println(vowel);
		
		Map<String, Integer> marks = new LinkedHashMap<>();
		marks.put("Sachith",92);
		marks.put("Chamila", 91);
		marks.put("Chathu", 93);
		
		for(Map.Entry<String, Integer> entry:marks.entrySet())
			System.out.println(entry.getKey()+" "+entry.getValue());

	}
	
	

}
