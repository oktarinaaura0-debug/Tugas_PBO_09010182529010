import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas_6_4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Masukkan angka: ");
        int angka = Integer.parseInt(br.readLine());

        System.out.print("Masukkan pangkat: ");
        int pangkat = Integer.parseInt(br.readLine());

        int hasil = 1;
        int i = 1;

        while (i <= pangkat) {
            hasil = hasil * angka;
            i++;
        }

        System.out.println("Hasil = " + hasil);
    }

    import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas_6_4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Masukkan angka: ");
        int angka = Integer.parseInt(br.readLine());

        System.out.print("Masukkan pangkat: ");
        int pangkat = Integer.parseInt(br.readLine());

        int hasil = 1;
        int i = 1;

        do {
            hasil = hasil * angka;
            i++;
        } while (i <= pangkat);

        System.out.println("Hasil = " + hasil);
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas_6_4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Masukkan angka: ");
        int angka = Integer.parseInt(br.readLine());

        System.out.print("Masukkan pangkat: ");
        int pangkat = Integer.parseInt(br.readLine());

        int hasil = 1;

        for (int i = 1; i <= pangkat; i++) {
            hasil = hasil * angka;
        }

        System.out.println("Hasil = " + hasil);
    }
}
}
