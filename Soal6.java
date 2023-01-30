/* Deskripsi Identitas Diri
 * Nama     : Muhammad Fikri Nur Sya'Bani
 * NIM      : 221524019
 * Kelas    : 1A D4
 * Tugas    : Pertemuan 2 || Soal 6 || Big Number
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner ReadKeyboard = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); // Clear Screen

        BigInteger A, B;

        A = ReadKeyboard.nextBigInteger();
        B = ReadKeyboard.nextBigInteger();
        ReadKeyboard.close();

        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
    }
}
