/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaankampus;

import DatabasePerpustakaan.DatabaseBuku;
import Komparasi.ComparatorFrekuensi;
import java.util.*;

/**
 *
 * @author User
 */
public class Guest {
    public Guest() {}
    
    public TableBuku lihatDaftarBuku(List<Buku> allBook) {
        TableBuku table = new TableBuku(allBook);
        return table;
    }
    
    /*
    Method untuk melakukan login
    */
    public boolean login(String pilihan) {
        //perlu akses ke class DatabaseMember
        return true;
    }
    
    /*
    Method search engine simple untuk mencari buku di list semua buku.
    */
    public List<Buku> cariBuku(String keyword, List<Buku> allBook) {
        List<Buku> listHasil = new ArrayList();
        for (Buku buku : allBook) {
            if (buku.getJudulBuku().contains(keyword) || buku.getAuthor().contains(keyword)) {
                listHasil.add(buku);
            }
        }
        return listHasil;
    }
    
    public void lihatDetailBuku() {
        //Perlu akses ke class Riwayat
    }
    
    /*
    Method untuk mendapatkan list rekomendasi buku.
    */
    public List<Buku> lihatRekomendasiBuku(List<Buku> allBook) {
        List<Buku> newListBuku = new ArrayList();
        
        Collections.sort(allBook, new ComparatorFrekuensi());
        
        for (int i = 0; i < 5; i++) {
            newListBuku.add(allBook.get(i));
        }
        
        return newListBuku;
    }
}
