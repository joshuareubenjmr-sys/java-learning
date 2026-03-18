import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int answer = (int)(Math.random() * 100) + 1;
        int count = 0; 

        System.out.println("Guess a number between 1 and 100: ");
        int response = scanner.nextInt();

        while (response != answer){
            if (response < answer){
                System.out.println("Too Low!");
                response = scanner.nextInt();
                count++;
            } else if (response > answer){
                System.out.println("Too high!");
                response = scanner.nextInt();
                count++;
            }
        }
        System.out.println("Correct! Your total number of guesses were " + count);
    }
}
