package lec_6;
import java.util.ArrayList;
import java.util.Scanner;
public class B6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int input;

        System.out.println("Enter integers (type -1 to stop):");
        while (true) {
            input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            numbers.add(input);
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Numbers entered: " + numbers);
        System.out.println("The sum is: " + sum);
    }
}