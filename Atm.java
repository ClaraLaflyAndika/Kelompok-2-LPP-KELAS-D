

import java.util.Locale;
import java.util.Scanner;

public class ATMSimulator {
    private static long bacaAngka(Scanner input, String pesan) {
        while (true) {
            System.out.print(pesan);
            if (input.hasNextLong()) {
                long nilai = input.nextLong();
                input.nextLine(); // clear line
                return nilai;
            }
            System.out.println("Input tidak valid. Masukkan angka saja.");
            input.nextLine(); 
        }
    }

    private static String rupiah(long jumlah) {
        return String.format(Locale.forLanguageTag("id-ID"), "Rp %,d", jumlah);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long saldo = 1_000_000; // (Saldo awal)
        long pilihan;

        System.out.println("=== Selamat datang di ATM ===");

        // Loop:
        do {
            // ATM menu
            System.out.println();
            System.out.println("------ MENU ATM ------");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Uang");
            System.out.println("3. Tarik Uang");
            System.out.println("4. Keluar");
            System.out.println("----------------------");

            // Pilih menu
            pilihan = bacaAngka(input, "Pilih menu (1-4): ");

            switch ((int) pilihan) {
                case 1:
                    // tampil saldo
                    System.out.println("Saldo Anda saat ini: " + rupiah(saldo));
                    break;

                case 2:
                    // Deposit
                    long setor = bacaAngka(input, "Jumlah setor: Rp ");
                    if (setor > 0) {
                        saldo = saldo + setor;
                        System.out.println("Setor berhasil. Saldo sekarang: " + rupiah(saldo));
                    } else {
                        System.out.println("Jumlah setor harus lebih dari 0.");
                    }
                    break;

                case 3:
                    // tarik uang kalo cukup
                    long tarik = bacaAngka(input, "Jumlah tarik: Rp ");
                    if (tarik <= 0) {
                        System.out.println("Jumlah tarik harus lebih dari 0.");
                    } else if (tarik > saldo) {
                        System.out.println("Saldo tidak mencukupi. Saldo Anda: " + rupiah(saldo));
                    } else {
                        saldo = saldo - tarik;
                        System.out.println("Tarik berhasil. Saldo sekarang: " + rupiah(saldo));
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan ATM.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia. Pilih angka 1 sampai 4.");
            }
        } while (pilihan != 4); // balik menu awal

        // tunjukin saldo akhir
        System.out.println("Saldo akhir Anda: " + rupiah(saldo));
        input.close();
    }
}
