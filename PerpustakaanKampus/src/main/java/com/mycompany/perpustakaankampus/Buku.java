/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaankampus;

/**
 *
 * @author User
 */
public class Buku {
    private int kodeBuku;
    private String judulBuku;
    private String author;
    private String abstrak;
    private String kategoriBuku;
    private int tahunTerbit;
    private int stokBuku;
    
    public Buku() {};
    
    public Buku(int kodeBuku, String judulBuku, String author, String abstrak, String kategoriBuku, int tahunTerbit, int stokBuku){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.author = author;
        this.abstrak = abstrak;
        this.kategoriBuku = kategoriBuku;
        this.tahunTerbit = tahunTerbit;
        this.stokBuku = stokBuku;
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
    public int getKodeBuku() {
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
    public int getTahunTerbit() {
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
}
