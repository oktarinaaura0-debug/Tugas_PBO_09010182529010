package bab10;

public class Latihan101 {

    public static void main(String[] args) {

        // Membuat objek BukuAlamat
        BukuAlamat buku = new BukuAlamat();

        // Membuat data pertama
        EntryBukuAlamat data1 = new EntryBukuAlamat(
                "Aura Oktarina",
                "Palembang",
                "081234567890",
                "aura@gmail.com"
        );

        // Membuat data kedua
        EntryBukuAlamat data2 = new EntryBukuAlamat(
                "Nanda Salsabilla",
                "Palembang",
                "082345678901",
                "nanda@gmail.com"
        );

        // Memasukkan data
        buku.tambahData(data1);
        buku.tambahData(data2);

        // Menampilkan semua data
        System.out.println("\n=== DATA BUKU ALAMAT ===");
        buku.tampilkanSemuaData();

        // Update data pertama
        System.out.println("\n=== UPDATE DATA ===");

        buku.updateData(
                0,
                "Aura Oktarina",
                "Palembang, Sumatera Selatan",
                "081111111111",
                "auraokt@gmail.com"
        );

        // Menampilkan setelah update
        System.out.println("\n=== DATA SETELAH UPDATE ===");
        buku.tampilkanSemuaData();

        // Menghapus data kedua
        System.out.println("\n=== HAPUS DATA ===");

        buku.hapusData(1);

        // Menampilkan setelah dihapus
        System.out.println("\n=== DATA SETELAH DIHAPUS ===");
        buku.tampilkanSemuaData();
    }
}
