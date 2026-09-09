public class Tugas_4_3 {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 23;
        int number3 = 5;

        int terbesar = (number1 > number2)
                ? ((number1 > number3) ? number1 : number3)
                : ((number2 > number3) ? number2 : number3);

        System.out.println("number 1 = " + number1);
        System.out.println("number 2 = " + number2);
        System.out.println("number 3 = " + number3);
        System.out.println("Nilai tertingginya adalah angka = " + terbesar);
    }
}
