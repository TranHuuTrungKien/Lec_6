package lec_6;
import java.util.Scanner;
public class B13 {
    public static int[] merge(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int i = 0, j = 0, k = 0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] <= a2[j]) {
                result[k++] = a1[i++];
            } else {
                result[k++] = a2[j++];
            }
        }
        while (i < a1.length) {
            result[k++] = a1[i++];
        }
        while (j < a2.length) {
            result[k++] = a2[j++];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of first sorted array: ");
        int n1 = scanner.nextInt();
        int[] a1 = new int[n1];
        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n1; i++) {
            a1[i] = scanner.nextInt();
        }
        System.out.print("Enter size of second sorted array: ");
        int n2 = scanner.nextInt();
        int[] a2 = new int[n2];
        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n2; i++) {
            a2[i] = scanner.nextInt();
        }
        int[] merged = merge(a1, a2);
        System.out.println("Merged sorted array:");
        for (int num : merged) {
            System.out.print(num + " ");
            }
        }
    }