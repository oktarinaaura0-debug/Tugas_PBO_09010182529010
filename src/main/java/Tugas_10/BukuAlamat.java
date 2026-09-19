package bab10;

public class BukuAlamat {

    private EntryBukuAlamat[] data;
    private int jumlahData;

    // Constructor
    public BukuAlamat() {
        data = new EntryBukuAlamat[100];
        jumlahData = 0;
    }

    // Menambahkan data
    public void tambahData(EntryBukuAlamat entry) {
        if (jumlahData < 100) {
            data[jumlahData] = entry;
            jumlahData++;

            System.out.println("Data berhasil ditambahkan.");
        } else {
            System.out.println("Buku alamat sudah penuh.");
        }
    }

    // Menghapus data
    public void hapusData(int index) {
        if (index >= 0 && index < jumlahData) {

            for (int i = index; i < jumlahData - 1; i++) {
                data[i] = data[i + 1];
            }

            data[jumlahData - 1] = null;
            jumlahData--;

            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    // Menampilkan semua data
    public void tampilkanSemuaData() {
        if (jumlahData == 0) {
            System.out.println("Belum ada data.");
            return;
        }

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("\nData ke-" + (i + 1));
            System.out.println("----------------------");
            data[i].tampilkanData();
        }
    }

    // Mengupdate data
    public void updateData(int index, String nama, String alamat,
                           String nomorTelepon, String email) {

        if (index >= 0 && index < jumlahData) {

            data[index].setNama(nama);
            data[index].setAlamat(alamat);
            data[index].setNomorTelepon(nomorTelepon);
            data[index].setEmail(email);

            System.out.println("Data berhasil diupdate.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }
}
