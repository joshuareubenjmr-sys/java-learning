package Week2Practice;

import java.util.HashMap;

public class CharFreq {
    public static void charFrequency(String s){

        StringBuilder sb = new StringBuilder(); // just using this for final list output

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+ 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (char key: map.keySet()){
            sb.append(key + ":" + map.get(key) + " ");
        }
        System.out.println(sb.toString().trim()); // the trim is just to remove any excess spaces (good practice)
    }
    public static void main (String[] args){
        charFrequency("hello");
    }
}