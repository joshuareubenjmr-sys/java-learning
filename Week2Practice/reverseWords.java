package Week2Practice;

public class reverseWords {
    public static void reverseWord(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder(); //create new empty list
        for(int i = words.length - 1; i >= 0; i--){ // loop in reverse
            sb.append(words[i] + " "); // adds the word we are at to the end of the string
        }
        System.out.println(sb.toString()); // displays result
    }
    public static void main (String[] args){
        reverseWord("How Are You");
    }
}
