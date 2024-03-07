public class Segitiga extends BangunDatar {
    protected double alas;
    protected double tinggi;

    public Segitiga(double alas, double tinggi, String name) {
        setNama(name);
        this.alas = alas;
        this.tinggi = tinggi;
        hitungLuas();
        hitungKeliling();
    }

    public void hitungLuas() {
        luas = 0.5 * alas * tinggi;
    }

    public void hitungKeliling() {
        // Untuk segitiga, perhitungan keliling tidak dapat dilakukan tanpa informasi tambahan
        System.out.println("Perhitungan keliling tidak dapat dilakukan tanpa informasi tambahan.");
    }
}