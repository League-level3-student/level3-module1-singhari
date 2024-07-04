package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
    	ArrayList<String> words = new ArrayList<String>();
        // 2. Add five Strings to your list
    	words.add("a");
    	words.add("b");
    	words.add("c");
    	words.add("d");
    	words.add("e");
        // 3. Print all the Strings using a standard for-loop
    	for(int i = 0; i < 5; i++) {
    		System.out.println(words.get(i));
    	}
        // 4. Print all the Strings using a for-each loop
    	for(String wo : words) {
    		System.out.println(wo);
    	}
    	int j =0;
        // 5. Print only the even numbered elements in the list.
    	for(String wo : words) {
    		if(j%2==0) {
    			System.out.println(wo);
    		}
    		j++;
    	}
        // 6. Print all the Strings in reverse order.
    	for(int k = 5; k > 0; k--) {
    		System.out.println(words.get(k-1));
    	}
    	String er = "e";
        // 7. Print only the Strings that have the letter 'e' in them.
        for(String wo : words) {
        	if(wo.contentEquals(er)) {
        		System.out.print(wo);
        	}
        }
    }
}
