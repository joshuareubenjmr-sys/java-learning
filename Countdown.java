import java.util.Scanner;

public class Countdown {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide a starting value");
        int number = scanner.nextInt();

        while(number >= 0){
            System.out.println(number);
            number--;
        }
        System.out.println("Liftoff!");
    }
}
