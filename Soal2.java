/* Deskripsi Identitas Diri
 * Nama     : Muhammad Fikri Nur Sya'Bani
 * NIM      : 221524019
 * Kelas    : 1A D4
 * Tugas    : Pertemuan 2 || Soal 2 || Input dan Output(2)
 */

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner ReadKeyboard = new Scanner(System.in);
        String[] Input = new String[3];
        String[] Word = new String[3];
        String[] Num = new String[3];

        System.out.print("\033[H\033[2J"); // Clear Screen
        for (int i = 0; i < 3; i++) {
            Input[i] = ReadKeyboard.nextLine();
            Num[i] = Input[i].split(" ")[1];
            Word[i] = Input[i].split(" ")[0];
            

            if (Word[i].length() > 10 || Num[i].length() > 3) {
                System.out.println("The String is Too Long!");
                System.exit(0);
            }
        }
        ReadKeyboard.close();

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.print(Word[i]);
            for (int j = 0; j < (15 - Word[i].length()); j++) {
                System.out.print(" ");
            }
            if (Num[i].length() < 3) {
                for (int j = 0; j < (3 - Num[i].length()); j++) {
                    System.out.print("0");
                }
                System.out.println(Num[i]);
            } else {
                System.out.println(Num[i]);
            }
        }
        System.out.println("================================");
    }
}
