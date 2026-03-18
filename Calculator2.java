import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give your first number: ");
        int a = scanner.nextInt();

        System.out.println("Give your second number: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a / b;
        int remainder = a % b;
    }
}
