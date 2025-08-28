package lec_6;
import java.util.Arrays;
public class B9 {
     public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        System.out.println("Original array: " + Arrays.toString(numbers));
        swap(numbers, 0, 2);
        System.out.println("Array after swapping: " + Arrays.toString(numbers));
    }
}