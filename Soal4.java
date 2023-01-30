/* Deskripsi Identitas Diri
 * Nama     : Muhammad Fikri Nur Sya'Bani
 * NIM      : 221524019
 * Kelas    : 1A D4
 * Tugas    : Pertemuan 2 || Soal 4 || Gaji Agent
 */

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) throws Exception{
        Scanner ReadKeyboard = new Scanner(System.in);

        int gajiPokok = 500000;
        int hargaItem = 50000;
        int jumlahPenjualan;
        double gaji = 0;

        System.out.print("\033[H\033[2J"); // Clear Screen

        jumlahPenjualan = ReadKeyboard.nextInt();
        if (jumlahPenjualan < 15){
            gaji = gajiPokok - (((15 - jumlahPenjualan) * hargaItem) * 0.15);
        }else if (jumlahPenjualan > 80) {
            gaji = (jumlahPenjualan * (hargaItem * 0.35)) + gajiPokok;
        }else if (jumlahPenjualan >= 40) {
            gaji = (jumlahPenjualan * (hargaItem * 0.25)) + gajiPokok;
        }else{
            gaji = (jumlahPenjualan * (hargaItem * 0.1)) + gajiPokok;
        }
        ReadKeyboard.close();

        System.out.println((int)gaji);
    }
}
