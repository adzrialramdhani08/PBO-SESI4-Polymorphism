// Class Persegi 
public class Persegi {

  // Property sisi 
  private int sisi;

  // Constructor untuk inisialisasi nilai sisi
  public Persegi(int sisi) {
    this.sisi = sisi;
  }

  // Method untuk mengatur nilai sisi
  public void setSisi(int sisi) {
    this.sisi = sisi;
  }

  // Method untuk mendapatkan nilai sisi 
  public int getSisi() {
    return this.sisi;
  }

  // Method untuk mendapatkan luas
  public int getLuas() {
    return this.sisi * this.sisi;
  }

  // Method untuk mendapatkan keliling
  public int getKeliling() {
    return 4 * this.sisi;
  }

}