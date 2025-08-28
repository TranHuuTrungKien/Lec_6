package lec_6;
import java.util.ArrayList;
import java.util.Scanner;
public class B7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> originalList = new ArrayList<>();
        System.out.println("Enter the numbers:");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " numbers (can repeat):");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            originalList.add(number);
        }
        ArrayList<Integer> uniqueList = removeDuplicates(originalList);
        System.out.println("originalList: " + originalList);
        System.out.println("List after removing duplicates: " + uniqueList);
    }
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer number : list) {
            if (!result.contains(number)) {
                result.add(number);
            }
        }

        return result;
    }
}
