/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec_6;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class B12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a lowercase string: ");
        String input = scanner.nextLine();

        int[] frequency = new int[26];

        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                frequency[c - 'a']++;
            }
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > 0) {
                char letter = (char) (i + 'a');
                System.out.println(letter + ": " + frequency[i]);
            }
        }
    }
}
