package lec_6;
import java.util.Scanner;
public class B3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to count: ");
        int x = scanner.nextInt();
        int count = 0;
        for (int num : numbers) {
            if (num == x) {
                count++;
            }
        }
        System.out.println("The number " + x + " appears " + count + " times.");
    }
}
