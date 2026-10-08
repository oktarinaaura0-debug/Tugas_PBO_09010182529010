package bangundatar;

public class SegitigaSamaKaki extends BangunDatar {

    double alas;
    double tinggi;
    double sisiMiring;

    public SegitigaSamaKaki(double alas, double tinggi, double sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double keliling() {
        return alas + (2 * sisiMiring);
    }
}
