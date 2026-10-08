
package bangundatar;

public class Main {

    public static void main(String[] args) {
        
        SegitigaSamaKaki segitiga =
                new SegitigaSamaKaki(10, 8, 10);
        
        PersegiPanjang persegiPanjang =
                new PersegiPanjang(12, 5);
        
        Lingkaran lingkaran =
                new Lingkaran(7);
        
        System.out.println("=== SEGITIGA SAMA KAKI ===");
        System.out.println("Luas = " + segitiga.luas());
        System.out.println("Keliling = " + segitiga.keliling());
        
        System.out.println();
        
        System.out.println("=== PERSEGI PANJANG ===");
        System.out.println("Luas = " + persegiPanjang.luas());
        System.out.println("Keliling = " + persegiPanjang.keliling());
        
        System.out.println();
        
        System.out.println("=== LINGKARAN ===");
        System.out.println("Luas = " + lingkaran.luas());
        System.out.println("Keliling = " + lingkaran.keliling());
    }
}
