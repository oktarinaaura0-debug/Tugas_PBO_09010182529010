public class Latihan92 {
    public static void main(String[] args) {

        // ==========================================
        // 9.6.2 - JAVA SCAVENGER HUNT
        // ==========================================

        // NOMOR 1
        // Method untuk mengecek apakah String
        // diakhiri suffix tertentu
        System.out.println("NOMOR 1");

        String teks = "Hello";

        System.out.println("Hello diakhiri 'lo'  : "
                + teks.endsWith("lo"));

        System.out.println("Hello diakhiri 'alp' : "
                + teks.endsWith("alp"));


        // NOMOR 2
        // Method untuk mengenali character
        // berdasarkan digit dan radix
        System.out.println("\nNOMOR 2");

        int digit = 15;
        int radix = 16;

        char hasilDigit = Character.forDigit(digit, radix);

        System.out.println("Digit 15 dengan radix 16 = "
                + hasilDigit);


        // NOMOR 3
        // Method untuk mengakhiri Java Virtual Machine
        System.out.println("\nNOMOR 3");

        System.out.println("Program dimulai");

        // Method yang digunakan:
        // System.exit(0);

        System.out.println("Method System.exit(0) digunakan "
                + "untuk menghentikan JVM.");


        // NOMOR 4
        // Method untuk mendapatkan nilai lantai
        // dari sebuah nilai double
        System.out.println("\nNOMOR 4");

        double angka = 3.13;

        double hasilLantai = Math.floor(angka);

        System.out.println("Nilai floor dari "
                + angka + " = " + hasilLantai);


        // NOMOR 5
        // Method untuk mengecek apakah character
        // merupakan digit
        System.out.println("\nNOMOR 5");

        char karakter = '3';

        boolean hasil = Character.isDigit(karakter);

        System.out.println("Apakah '" + karakter
                + "' merupakan digit? " + hasil);
    }
}
