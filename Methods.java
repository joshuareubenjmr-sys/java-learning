public class Methods {
    public static int max (int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }

    public static boolean isEven (int a){
        if (a % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

public static void greet (String name){
    System.out.println("Hello " + name + "!");
}

public static void main(String[] args){
    System.out.println(max(10,20));
    System.out.println(isEven(13));
    greet("Joshua");
}}
