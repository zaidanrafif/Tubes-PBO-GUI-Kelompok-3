/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaankampus;

import DatabasePerpustakaan.DatabaseRiwayatPeminjaman;
import java.util.*;

/**
 *
 * @author User
 */
public class Mahasiswa extends Guest implements Logout {
    private String username;
    private String password;
    private String nama;
    private String nim;
    
    public Mahasiswa(String username, String password, String nama, String nim) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.nim = nim;
    }
    
    public void meminjamBuku() {}
    
    public void mengembalikanBuku() {}
    
    public void memperpanjangBuku() {}
    
    public TablePeminjaman lihatRiwayat() {
        List<Peminjaman> listPeminjaman;
        DatabaseRiwayatPeminjaman peminjamanDao = new DatabaseRiwayatPeminjaman();
        listPeminjaman = peminjamanDao.getAllPeminjaman();
        TablePeminjaman table = new TablePeminjaman(listPeminjaman);
        return table;
    }
    
    @Override
    public void logoutAkun() {
        
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }
    
    
}
