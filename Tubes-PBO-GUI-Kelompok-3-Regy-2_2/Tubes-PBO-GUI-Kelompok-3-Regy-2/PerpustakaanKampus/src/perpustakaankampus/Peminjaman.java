/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaankampus;

import java.util.*;

/**
 *
 * @author User
 */
public class Peminjaman {
    private String idPeminjaman;
    private String nim;
    private String kodeBuku;
    private String judulBuku;
    private Date tanggalPinjam;
    private Date batasPinjam;
    private boolean disetujui;
    private boolean selesai;
    private int denda;
    private String kondisiBuku;
    
    public Peminjaman() {}
    
    public Peminjaman(String idPeminjaman, String nim, String kodeBuku, String judulBuku, Date tanggalPinjam) {
        this.idPeminjaman = idPeminjaman;
        this.nim = nim;
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tanggalPinjam = tanggalPinjam;
        this.disetujui = false;
        this.selesai = false;
        this.denda = 0;
        this.kondisiBuku = "bagus";
    }

    /**
     * @return the idPeminjaman
     */
    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    /**
     * @param idPeminjaman the idPeminjaman to set
     */
    public void setIdPeminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

    /**
     * @return the kodeBuku
     */
    public String getKodeBuku() {
        return kodeBuku;
    }

    /**
     * @param kodeBuku the kodeBuku to set
     */
    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    /**
     * @return the judulBuku
     */
    public String getJudulBuku() {
        return judulBuku;
    }

    /**
     * @param judulBuku the judulBuku to set
     */
    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    /**
     * @return the tanggalPinjam
     */
    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    /**
     * @param tanggalPinjam the tanggalPinjam to set
     */
    public void setTanggalPinjam(Date tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    /**
     * @return the batasPinjam
     */
    public Date getBatasPinjam() {
        return batasPinjam;
    }

    /**
     * @param batasPinjam the batasPinjam to set
     */
    public void setBatasPinjam(Date batasPinjam) {
        this.batasPinjam = batasPinjam;
    }

    /**
     * @return the disetujui
     */
    public boolean isDisetujui() {
        return disetujui;
    }

    /**
     * @param disetujui the disetujui to set
     */
    public void setDisetujui(boolean disetujui) {
        this.disetujui = disetujui;
    }

    /**
     * @return the selesai
     */
    public boolean isSelesai() {
        return selesai;
    }

    /**
     * @param selesai the selesai to set
     */
    public void setSelesai(boolean selesai) {
        this.selesai = selesai;
    }

    /**
     * @return the denda
     */
    public int getDenda() {
        return denda;
    }

    /**
     * @param denda the denda to set
     */
    public void setDenda(int denda) {
        this.denda = denda;
    }

    /**
     * @return the kondisiBuku
     */
    public String getKondisiBuku() {
        return kondisiBuku;
    }

    /**
     * @param kondisiBuku the kondisiBuku to set
     */
    public void setKondisiBuku(String kondisiBuku) {
        this.kondisiBuku = kondisiBuku;
    }

    
    
}
