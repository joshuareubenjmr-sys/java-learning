package Week2Practice;

// count the amount of specific characters in a string
public class StringPractice {
    public static int countVowels (String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if (a == 'a' || a == 'e'|| a == 'i'||a == 'o' || a == 'u'){
                count++;
            }
        }
        return count;
    }
    // check if a string is the same forward and backwards
    public static boolean isPalindrome (String s){
        s = s.toLowerCase(); // so therefore case doesn't affect if its equal ot not
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = s.charAt(s.length() - 1 - i); // doing s.length() - 1 -> because indexing is
                                                    // one less than the length of the word effectively
                                                    // allowing us to start at the end of the index 
            if(a != b){
                return false;
            }
        }
        return true;
    }
    public static void main (String args[]){
        System.out.println(countVowels("hello world"));
        System.out.println(isPalindrome("hello"));
    }
}
