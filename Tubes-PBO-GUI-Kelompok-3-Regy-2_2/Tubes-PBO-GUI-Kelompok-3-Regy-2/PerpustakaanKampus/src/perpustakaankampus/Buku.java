/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaankampus;

/**
 *
 * @author User
 */
public class Buku {
    private String kodeBuku;
    private String judulBuku;
    private String author;
    private String abstrak;
    private String kategoriBuku;
    private String tahunTerbit;
    private int stokBuku;
    private int frekPeminjaman;
    
    public Buku() {};
    
    public Buku(String kodeBuku, String judulBuku, String author,  String kategoriBuku, String tahunTerbit, int stokBuku, int frekPeminjaman, String abstrak){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.author = author;    
        this.kategoriBuku = kategoriBuku;
        this.tahunTerbit = tahunTerbit;
        this.stokBuku = stokBuku;
        this.frekPeminjaman = frekPeminjaman;
        this.abstrak = abstrak;
    };

    public void tambahStokBuku(int jumlah) {
        setStokBuku(getStokBuku() + jumlah);
    }
    
    public void kurangStokBuku(int jumlah) {
        setStokBuku(getStokBuku() - jumlah);
    }

    /**
     * @return the kodeBuku
     */
    public String getKodeBuku() {
        return kodeBuku;
    }

    /**
     * @return the judulBuku
     */
    public String getJudulBuku() {
        return judulBuku;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return the abstrak
     */
    public String getAbstrak() {
        return abstrak;
    }

    /**
     * @return the kategoriBuku
     */
    public String getKategoriBuku() {
        return kategoriBuku;
    }

    /**
     * @return the tahunTerbit
     */
    public String getTahunTerbit() {
        return tahunTerbit;
    }

    /**
     * @return the stokBuku
     */
    public int getStokBuku() {
        return stokBuku;
    }

    /**
     * @param stokBuku the stokBuku to set
     */
    public void setStokBuku(int stokBuku) {
        this.stokBuku = stokBuku;
    }

    /**
     * @return the frekPeminjaman
     */
    public int getFrekPeminjaman() {
        return frekPeminjaman;
    }

    /**
     * @param frekPeminjaman the frekPeminjaman to set
     */
    public void setFrekPeminjaman(int frekPeminjaman) {
        this.frekPeminjaman = frekPeminjaman;
    }

    /**
     * @param kodeBuku the kodeBuku to set
     */
    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    /**
     * @param judulBuku the judulBuku to set
     */
    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @param abstrak the abstrak to set
     */
    public void setAbstrak(String abstrak) {
        this.abstrak = abstrak;
    }

    /**
     * @param kategoriBuku the kategoriBuku to set
     */
    public void setKategoriBuku(String kategoriBuku) {
        this.kategoriBuku = kategoriBuku;
    }

    /**
     * @param tahunTerbit the tahunTerbit to set
     */
    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    
    public void printAll(){
        
    }
    
}
