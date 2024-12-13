package main_Test;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in th
import java.util.Scanner;
import Informasi.Cha;

public class WattGuard_Test {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Layanan Pengguna");
            System.out.println("2. FAQ");
            System.out.println("3. Isi Token");
            System.out.println("4. Riwayat Pembelian");
            System.out.println("5. Notifikasi");
            System.out.println("0. Keluar");

            System.out.println("Pilih(1-6): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 2:
                    System.out.println("Anda memilih Layanan Pengguna.");
                    // Tambahkan logika untuk Layanan Pengguna di sini
                    Chatbot
                    break;
                case 3:
                    System.out.println("Anda memilih FAQ.");
                    // Tambahkan logika untuk FAQ di sini
                    break;
                case 4:
                    System.out.println("Anda memilih Isi Token.");
                    // Tambahkan logika untuk Isi Token di sini
                    break;
                case 5:
                    System.out.println("Anda memilih Notifikasi.");
                    // Tambahkan logika untuk Notifikasi di sini
                    break;
                case 6:
                    System.out.println("Anda memilih Statistik.");
                    // Tambahkan logika untuk Statistik di sini
                    break;
                case 0:
                    System.out.println("Keluar dari program. Terima kasih.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }




    }
}
