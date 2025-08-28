package lec_6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class B15 {
    public static ArrayList<String> arrayToArrayList(String[] array) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(array));
        return list;
    }
    public static String[] arrayListToArray(ArrayList<String> list) {
        return list.toArray(String[]::new);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] array = new String[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }
        ArrayList<String> listFromArray = arrayToArrayList(array);
        System.out.println("Converted to ArrayList:");
        for (String item : listFromArray) {
            System.out.println(item);
        }
        System.out.print("Enter number of elements in ArrayList: ");
        int m = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter ArrayList elements:");
        for (int i = 0; i < m; i++) {
            list.add(scanner.nextLine());
        }
        String[] arrayFromList = arrayListToArray(list);
        System.out.println("Converted to array:");
        for (String item : arrayFromList) {
            System.out.println(item);
        }
    }
}
