package lec_6;
public class B10 {
    public static int[] concatenate(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, result, 0, a1.length);
        System.arraycopy(a2, 0, result, a1.length, a2.length);
        return result;
    }
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};
        int[] combined = concatenate(a1, a2);
        System.out.println("Array after connection:");
        for (int num : combined) {
            System.out.print(num + " ");
        }
    }
}
