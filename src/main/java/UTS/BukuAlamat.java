
import java.util.Scanner;

public class BukuAlamat {
    private EntryBukuAlamat[] data = new EntryBukuAlamat[100];
    private int jumlah = 0;
    private Scanner input = new Scanner(System.in);

    public void tambahData() {
        if (jumlah >= 100) {
            System.out.println("Buku alamat sudah penuh!");
            return;
        }

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Alamat: ");
        String alamat = input.nextLine();

        System.out.print("Nomor Telepon: ");
        String telepon = input.nextLine();

        System.out.print("Email: ");
        String email = input.nextLine();

        data[jumlah] = new EntryBukuAlamat(
            nama, alamat, telepon, email
        );

        jumlah++;
        System.out.println("Data berhasil ditambahkan!");
    }

    public void tampilkanData() {
        if (jumlah == 0) {
            System.out.println("Belum ada data.");
            return;
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData ke-" + (i + 1));
            data[i].tampilkanData();
        }
    }

    public void hapusData() {
        tampilkanNomorData();

        if (jumlah == 0) {
            return;
        }

        System.out.print("Hapus nomor data: ");
        int nomor = Integer.parseInt(input.nextLine());

        if (nomor < 1 || nomor > jumlah) {
            System.out.println("Nomor data tidak valid!");
            return;
        }

        for (int i = nomor - 1; i < jumlah - 1; i++) {
            data[i] = data[i + 1];
        }

        data[jumlah - 1] = null;
        jumlah--;

        System.out.println("Data berhasil dihapus!");
    }

    public void updateData() {
        tampilkanNomorData();

        if (jumlah == 0) {
            return;
        }

        System.out.print("Ubah nomor data: ");
        int nomor = Integer.parseInt(input.nextLine());

        if (nomor < 1 || nomor > jumlah) {
            System.out.println("Nomor data tidak valid!");
            return;
        }

        EntryBukuAlamat kontak = data[nomor - 1];

        System.out.print("Nama baru: ");
        kontak.setNama(input.nextLine());

        System.out.print("Alamat baru: ");
        kontak.setAlamat(input.nextLine());

        System.out.print("Nomor telepon baru: ");
        kontak.setNomorTelepon(input.nextLine());

        System.out.print("Email baru: ");
        kontak.setEmail(input.nextLine());

        System.out.println("Data berhasil diubah!");
    }

    private void tampilkanNomorData() {
        if (jumlah == 0) {
            System.out.println("Belum ada data.");
            return;
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println(
                (i + 1) + ". " + data[i].getNama()
            );
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\n=== BUKU ALAMAT ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Tampilkan Seluruh Data");
            System.out.println("4. Update Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            String pilihan = input.nextLine();

            switch (pilihan) {
                case "1":
                    tambahData();
                    break;
                case "2":
                    hapusData();
                    break;
                case "3":
                    tampilkanData();
                    break;
                case "4":
                    updateData();
                    break;
                case "5":
                    System.out.println("Program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        }
    }

    public static void main(String[] args) {
        BukuAlamat buku = new BukuAlamat();
        buku.menu();
    }
}
