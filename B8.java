package lec_6;
import java.util.Arrays;
import java.util.Scanner;
public class B8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.print("Enter a number to find: ");
        int target = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("The number " + target + " was found at index " + index + ".");
        } else {
            System.out.println("The number " + target + " was not found in the array.");
        }
    }
}
