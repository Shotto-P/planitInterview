import java.util.HashMap;
import java.util.LinkedHashMap;

public class highestOccurrence {
	
	public static char findHighest(String s) {
		
		//Here we use linkedHashMap in order to keep the insertion order
		//so as to know which appear first when there are 2 char with same occurrence.
		HashMap<Character, Integer> ocr = new LinkedHashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++) {
			if(!ocr.containsKey(s.charAt(i))) {
				ocr.put(s.charAt(i), 1);
			}else {
				ocr.put(s.charAt(i), ocr.get(s.charAt(i))+1);
			}
			
		}
		
		int highest = 0;
		char hChar = 'a';
		
		for(char c : ocr.keySet()) {
			System.out.println("Char: "+String.valueOf(c)+" Occurrence: "+ocr.get(c));
			
			if(ocr.get(c) > highest) {
				highest = ocr.get(c);
				hChar = c;
			}
		}
		
		
		return hChar;
	}
	
	public static void main(String[] args) {
		char result = findHighest("abbca");
		System.out.println("The highest occurrence char is: "+String.valueOf(result));
	}

}
