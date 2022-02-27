/**
 * @author Husna Maulana
 * @since 26-02-2022
 * @version 1.0
 */
public class Barang {

	String kode_barang;
	String nama_barang;
	private int stok; //membatasi akses ke stok sehingga tidak bisa diaksess oleh class yang lain
	
	public int getStock() { //menambahkan stok stelah melakukan penjumlahan
		return stok;
	}
	public void setStock(int stok) { //operator penambahan stok
		this.stok += stok;
	}
	
	public Barang(String kode, String nama, int stk) {
	kode_barang = kode;
	nama_barang = nama;
	stok = stk;
	}
}
