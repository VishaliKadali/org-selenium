package javachallenge;

import java.util.HashMap;

public class OccuranceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        String[] strArray = {"this", "his", "java", "this", "java", "selenium", "testng", "his"};

        // Create a HashMap to store the strings and their occurrences
        HashMap<String, Integer> occurrencesMap = new HashMap<String, Integer>();

        // Iterate through the string array
        for (String str : strArray) {
            // Check if the string is already present in the HashMap
            if (occurrencesMap.containsKey(str)) {
                // Increment the occurrence value by 1
                occurrencesMap.put(str, occurrencesMap.get(str) + 1);
            } else {
                // Add the string to the HashMap with an initial occurrence of 1
                occurrencesMap.put(str, 1);
            }
        }
        
       

        // Print the occurrences of each string
        for (String key : occurrencesMap.keySet()) {
            int occurrences = occurrencesMap.get(key);
            System.out.println("String: " + key + ", Occurrences: " + occurrences);
        }
    }

}
