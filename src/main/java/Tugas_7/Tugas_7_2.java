import javax.swing.JOptionPane;

public class Tugas_7_2 {

    public static void main(String[] args) {

        int[] angka = new int[10];

        // Memasukkan 10 nomor
        for (int i = 0; i < angka.length; i++) {
            angka[i] = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Masukkan nomor ke-" + (i + 1)
                )
            );
        }

        // Mencari nomor terbesar
        int terbesar = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }
        }

        // Menampilkan hasil
        JOptionPane.showMessageDialog(
            null,
            "Nomor terbesar adalah: " + terbesar
        );
    }
}
