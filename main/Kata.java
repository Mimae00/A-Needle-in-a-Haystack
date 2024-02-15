package main;


public class Kata {
    public static void findNeedle(Object[] haystack) {

        int index = 1;
        
        for(int x = 1; x < haystack.length; x++){
            if(haystack[x] == "needle"){
                index += x;
            }
        }
        System.out.println("found the needle at position " + index);

    }
}