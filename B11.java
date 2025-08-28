package lec_6;
import java.util.Scanner;
public class B11 {
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            int[] array = new int[n];
            
            for (int i = 0; i < n; i++) {
                System.out.print("The second element " + i + ": ");
                array[i] = scanner.nextInt();
            }
            
            int result = findSecondLargest(array);
            
            if (result == Integer.MIN_VALUE) {
                System.out.println("Second largest element not found.");
            } else {
                System.out.println("The second largest element is: " + result);
            }
        }
    }
}
