/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaankampus;

/**
 *
 * @author User
 */
public class Peminjaman {
    private String mahasiswa;
    private String buku;
    private String tanggalPinjam;
    private String batasPinjam;
    private boolean disetujui;
    private boolean selesai;
    private int denda;
    private String kondisiBuku;
    
    public Peminjaman(String mahasiswa, String buku, String tanggalPinjam) {
        this.mahasiswa = mahasiswa;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.batasPinjam = batasPinjam;
        this.disetujui = false;
        this.selesai = false;
        this.denda = 0;
        this.kondisiBuku = "bagus";
    }

    /**
     * @return the mahasiswa
     */
    public String getMahasiswa() {
        return mahasiswa;
    }

    /**
     * @return the buku
     */
    public String getBuku() {
        return buku;
    }

    /**
     * @return the tanggalPinjam
     */
    public String getTanggalPinjam() {
        return tanggalPinjam;
    }
    /**
     * @return the batasPinjam
     */
    public String getBatasPinjam(){
        return batasPinjam;
    }

    /**
     * @return the disetujui
     */
    public boolean isDisetujui() {
        return disetujui;
    }

    /**
     * @return the selesai
     */
    public boolean isSelesai() {
        return selesai;
    }

    /**
     * @return the denda
     */
    public int getDenda() {
        return denda;
    }

    /**
     * @return the kondisiBuku
     */
    public String getKondisiBuku() {
        return kondisiBuku;
    }
    
    
}
