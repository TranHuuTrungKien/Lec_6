package lec_6;
import java.util.ArrayList;
import java.util.Scanner;
public class B14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > 50) {
                list.remove(i);
            }
        }
        System.out.println("List after removing elements greater than 50:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
