/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasbesarpbo;

/**
 *
 * @author zaida
 */
public class TugasBesarPBO {

    using System;

public class PeminjamanBuku
{
    private Mahasiswa mahasiswa;
    private Buku buku;
    private DateTime tanggalPinjam;
    private bool disetujui;
    private bool selesai;
    private double denda;
    private string kondisiBuku;
    private int batasPinjam;

    public PeminjamanBuku(Mahasiswa mahasiswa, Buku buku, DateTime tanggalPinjam)
    {
        this.mahasiswa = mahasiswa;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.disetujui = false;
        this.selesai = false;
        this.denda = 0;
        this.kondisiBuku = "bagus";
        this.batasPinjam = 7; // Default batas peminjaman 7 hari
    }

    public void SetujuPeminjaman(bool persetujuan)
    {
        disetujui = persetujuan;
    }

    public void AkhiriPeminjaman()
    {
        DateTime sekarang = DateTime.Now;
        TimeSpan selisih = sekarang - tanggalPinjam;

        if (selisih.TotalDays > batasPinjam)
        {
            HitungDenda(selisih.TotalDays - batasPinjam);
        }

        selesai = true;
    }

    private void HitungDenda(double selisihHari)
    {
        denda = selisihHari * 1000;
    }

    public void SetKondisiBuku(string kondisi)
    {
        kondisiBuku = kondisi;
    }

    // Getter dan setter untuk atribut batasPinjam
    public int BatasPinjam
    {
        get { return batasPinjam; }
        set { batasPinjam = value; }
    }

    // Metode tambahan untuk membantu mahasiswa memperpanjang durasi peminjaman
    public void TambahDurasi(int tambahanHari)
    {
        DateTime tanggalPeminjamanBaru = tanggalPinjam.AddDays(tambahanHari);
        tanggalPinjam = tanggalPeminjamanBaru;
    }
}

