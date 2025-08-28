package lec_6;
import java.util.ArrayList;
public class B5 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayList<Integer> evenNumbers = getEvenNumbers(inputArray);
        System.out.println("Even numbers: " + evenNumbers);
    }
    public static ArrayList<Integer> getEvenNumbers(int[] array) {
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int num : array) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
        return evenList;
    }
}