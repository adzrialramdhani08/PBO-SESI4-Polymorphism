public class Lingkaran extends BangunDatar {
    protected double r;

    public Lingkaran(double r, String name) {
        setNama(name);
        this.r = r;
        hitungLuas();
        hitungKeliling();
    }

    public void hitungLuas() {
        luas = 3.14 * r * r;
    }

    public void hitungKeliling() {
        keliling = 2 * 3.14 * r;
    }
}