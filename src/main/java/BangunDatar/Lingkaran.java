package bangundatar;

public class Lingkaran extends BangunDatar {
    
    double jariJari;
    
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }
    
    @Override
    public double keliling() {
        return 2 * Math.PI * jariJari;
    }
}
