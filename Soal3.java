/* Deskripsi Identitas Diri
 * Nama     : Muhammad Fikri Nur Sya'Bani
 * NIM      : 221524019
 * Kelas    : 1A D4
 * Tugas    : Pertemuan 2 || Soal 3 || Berhitung
 */

import java.io.IOException;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) throws IOException {
        Scanner ReadKeyboard = new Scanner(System.in);
        String input;
        String[] inputPerWord = new String[3];
        int num1;
        int num2;
        int result = 0;
        String operation;

        System.out.print("\033[H\033[2J"); // Clear Screen

        input = ReadKeyboard.nextLine();
        inputPerWord = input.split(" ");
        ReadKeyboard.close();

        if (inputPerWord.length < 3 || inputPerWord.length > 3) {
            System.out.println("Input must be 3 elements (integer, operation, integer)!");
            System.exit(0);
        }

        num1 = Integer.parseInt(inputPerWord[0]);
        num2 = Integer.parseInt(inputPerWord[2]);
        operation = inputPerWord[1];

        if (operation.equals("+")) {
            result = num1 + num2;
        }else if (operation.equals("-")) {
            result = num1 - num2;
        }else if (operation.equals("*")) {
            result = num1 * num2;
        }else if (operation.equals("/")) {
            result = num1 / num2;
        }else if(operation.equals("%")) {
            result = num1 % num2;
        }else {
            System.out.println("Invalid Operation!");
            System.exit(0);
        }

        System.out.println(result);
    }
}
