/**
 * @author Husna Maulana
 * @since 26-02-2022
 * @version 1.0
 */
public class Inventori {
	Barang[] barangs;
	
	void initBarang() {
		barangs = new Barang[2];
		barangs[0] = new Barang("001", "Baju", 10);
		barangs[1] = new Barang("002", "Celana", 20);
	}
	
	void showBarang() {
		 System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStock() + ")");
         System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStock() + ")");
	}
	
	void pengadaan() {
		 initBarang();
         barangs[0].setStock(20); 
         barangs[0].setStock(30);
         barangs[0].setStock(30); 
         showBarang(); 
	}
	
	public static void main(String[] args) {
		Inventori beli = new Inventori();
		beli.pengadaan();
	}
}