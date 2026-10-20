public class EntryBukuAlamat {
    private String nama;
    private String alamat;
    private String nomorTelepon;
    private String email;

    public EntryBukuAlamat(String nama, String alamat,
                           String nomorTelepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public String getEmail() {
        return email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void tampilkanData() {
        System.out.println("Nama          : " + nama);
        System.out.println("Alamat        : " + alamat);
        System.out.println("Nomor Telepon : " + nomorTelepon);
        System.out.println("Email         : " + email);
    }
}
