/* Deskripsi Identitas Diri
 * Nama     : Muhammad Fikri Nur Sya'Bani
 * NIM      : 221524019
 * Kelas    : 1A D4
 * Tugas    : Pertemuan 2 || Soal 1 || Input dan Output
 */

import java.io.IOException;
import java.util.Scanner; // Pemanggilan API Scanner

public class Soal1 {
    public static void main(String[] args) throws IOException{
        Scanner ReadKeyboard = new Scanner(System.in); // Membuat sebuah objek Scanner yang diberi nama ReadKeyboard

        String[] sentences;
        String s;
        int n;

        System.out.print("\033[H\033[2J"); // Clear Screen
        System.out.print("Input Sebuah Kalimat    : "); // Syntax untuk menampilkan value tipe data apapun pada argumen print
        s = ReadKeyboard.nextLine();
        ReadKeyboard.close();

        sentences = s.split("[ !,?._'@]+");
        n = sentences.length;

        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.println(sentences[i]);
        }
    }
}
