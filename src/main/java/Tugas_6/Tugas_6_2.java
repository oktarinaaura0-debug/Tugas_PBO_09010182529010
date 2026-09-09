import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas_6_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Masukkan angka 1-10: ");
        int angka = Integer.parseInt(br.readLine());

        if (angka == 1) {
            System.out.println("Satu");
        } else if (angka == 2) {
            System.out.println("Dua");
        } else if (angka == 3) {
            System.out.println("Tiga");
        } else if (angka == 4) {
            System.out.println("Empat");
        } else if (angka == 5) {
            System.out.println("Lima");
        } else if (angka == 6) {
            System.out.println("Enam");
        } else if (angka == 7) {
            System.out.println("Tujuh");
        } else if (angka == 8) {
            System.out.println("Delapan");
        } else if (angka == 9) {
            System.out.println("Sembilan");
        } else if (angka == 10) {
            System.out.println("Sepuluh");
        } else {
            System.out.println("Invalid number");
        }
    }

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas_6_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Masukkan angka 1-10: ");
        int angka = Integer.parseInt(br.readLine());

        switch (angka) {
            case 1:
                System.out.println("Satu");
                break;

            case 2:
                System.out.println("Dua");
                break;

            case 3:
                System.out.println("Tiga");
                break;

            case 4:
                System.out.println("Empat");
                break;

            case 5:
                System.out.println("Lima");
                break;

            case 6:
                System.out.println("Enam");
                break;

            case 7:
                System.out.println("Tujuh");
                break;

            case 8:
                System.out.println("Delapan");
                break;

            case 9:
                System.out.println("Sembilan");
                break;

            case 10:
                System.out.println("Sepuluh");
                break;

            default:
                System.out.println("Invalid number");
                break;
        }
    }
}

}
