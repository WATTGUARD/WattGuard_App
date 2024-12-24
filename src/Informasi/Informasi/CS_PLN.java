package Informasi;

public class CS_PLN implements InfoService {

    public CS_PLN() {
    }

    @Override
    public void daftarInformasi() {
        System.out.println("==================Daftar Informasi==================");
        System.out.println("1. PLN Jakarta");
        System.out.println("2. PLN Bandung");
        System.out.println("3. PLN Yogyakarta");
        System.out.println("4. PLN Semarang");
        System.out.println("5. Kembali ke menu utama");
        System.out.println("====================================================");
    }

    private void printJawaban1() {
        System.out.println("====================================================");
        System.out.println("Berikut adalah beberapa lokasi PLN di Jakarta:");
        System.out.println("1. PLN Area Jakarta Pusat: Jl. Banteng Timur No.1, Gambir, Jakarta Pusat.");
        System.out.println("2. PLN Area Jakarta Selatan: Jl. Warung Buncit Raya No.123, Jakarta Selatan.");
        System.out.println("3. PLN Area Jakarta Barat: Jl. Tomang Raya No.39, Jakarta Barat.");
        System.out.println("4. PLN Area Jakarta Timur: Jl. DI Panjaitan Kav. 10, Jakarta Timur.");
        System.out.println("5. PLN Area Jakarta Utara: Jl. Plumpang Semper No.1, Jakarta Utara.");
        System.out.println("====================================================");
    }

    private void printJawaban2() {
        System.out.println("====================================================");
        System.out.println("Berikut adalah beberapa lokasi PLN di Bandung:");
        System.out.println("1. PLN Unit Pelaksana Pelayanan Pelanggan (UP3) Bandung: Jl. Cikapundung No.12, Bandung.");
        System.out.println("2. PLN Unit Layanan Pelanggan (ULP) Bandung Timur: Jl. Raya Ujungberung No.15, Bandung.");
        System.out.println("3. PLN Unit Layanan Pelanggan (ULP) Bandung Barat: Jl. Cipedes Tengah No.33, Bandung.");
        System.out.println("4. PLN Distribusi Jawa Barat: Jl. Asia Afrika No.63, Bandung.");
        System.out.println("====================================================");
    }

    private void printJawaban3() {
        System.out.println("====================================================");
        System.out.println("Berikut adalah beberapa lokasi PLN di Yogyakarta:");
        System.out.println("1. PLN UP3 Yogyakarta: Jl. Mangkubumi No.18, Yogyakarta.");
        System.out.println("2. PLN ULP Kotagede: Jl. Pramuka No.123, Kotagede, Yogyakarta.");
        System.out.println("3. PLN ULP Sleman: Jl. Magelang Km.9, Sleman, Yogyakarta.");
        System.out.println("4. PLN ULP Bantul: Jl. Bantul No.15, Bantul, Yogyakarta.");
        System.out.println("====================================================");
    }

    private void printJawaban4() {
        System.out.println("====================================================");
        System.out.println("Berikut adalah beberapa lokasi PLN di Semarang:");
        System.out.println("1. PLN UP3 Semarang: Jl. Pemuda No.92-94, Semarang.");
        System.out.println("2. PLN ULP Tlogosari: Jl. Tlogosari Raya No.8, Semarang.");
        System.out.println("3. PLN ULP Banyumanik: Jl. Setiabudi No.123, Banyumanik, Semarang.");
        System.out.println("4. PLN ULP Pedurungan: Jl. Pedurungan Tengah No.45, Semarang.");
        System.out.println("====================================================");
    }

    private void printJawaban5() {
        System.out.println("====================================================");
        System.out.println("Anda memilih kembali ke menu utama.");
        System.out.println("====================================================");
    }

    @Override
    public void printData(int input) {
        try {
            switch (input) {
                case 1:
                    printJawaban1();
                    break;
                case 2:
                    printJawaban2();
                    break;
                case 3:
                    printJawaban3();
                    break;
                case 4:
                    printJawaban4();
                    break;
                case 5:
                    printJawaban5();
                    break;
                default:
                    throw new IllegalArgumentException("Harap Masukkan Nomor Menu yang Benar.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("[Error] " + e.getMessage());
            daftarInformasi();
        }
    }
}
