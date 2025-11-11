/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tampilan.obj;


import java.math.BigDecimal;
/**
 *
 * @author ACER
 */
public class Produk {
    private int id;
    private String kodeProduk;
    private String nama;
    private String kategori;
    private int stok;
    private BigDecimal hargaBeli; 
    private BigDecimal hargaJual; 
    private String imagePath;

    // Getters
    public int getId() { return id; }
    public String getKodeProduk() { return kodeProduk; }
    public String getNama() { return nama; }
    public String getKategori() { return kategori; }
    public int getStok() { return stok; }
    public BigDecimal getHargaBeli() { return hargaBeli; }
    public BigDecimal getHargaJual() { return hargaJual; }
    public String getImagePath() { return imagePath; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setKodeProduk(String kodeProduk) { this.kodeProduk = kodeProduk; }
    public void setNama(String nama) { this.nama = nama; }
    public void setKategori(String kategori) { this.kategori = kategori; }
    public void setStok(int stok) { this.stok = stok; }
    public void setHargaBeli(BigDecimal hargaBeli) { this.hargaBeli = hargaBeli; }
    public void setHargaJual(BigDecimal hargaJual) { this.hargaJual = hargaJual; }
    public void setImagePath(String imagePath) { this.imagePath = imagePath; }
}
