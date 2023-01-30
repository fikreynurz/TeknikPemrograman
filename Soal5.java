/* Deskripsi Identitas Diri
 * Nama     : Muhammad Fikri Nur Sya'Bani
 * NIM      : 221524019
 * Kelas    : 1A D4
 * Tugas    : Pertemuan 2 || Soal 5 || Buka Tutup Jalan
 */

import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {
        Scanner ReadKeyboard = new Scanner(System.in);

        String plat;
        Long afterParse;

        System.out.print("\033[H\033[2J"); // Clear Screen

        plat = ReadKeyboard.nextLine();
        plat = plat.replaceAll("\\s", "");
        ReadKeyboard.close();

        afterParse = Long.parseLong(plat);

        if ((afterParse - 999999) % 5 != 0) {
            System.out.println("berhenti");
        }else{
            System.out.println("jalan");
        }
    }
}
