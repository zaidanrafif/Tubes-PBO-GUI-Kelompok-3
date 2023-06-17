/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControllerPerpustakaan;

import DatabasePerpustakaan.*;
import GUIPerpustakaan.*;
import java.util.*;
import javax.swing.JOptionPane;
import perpustakaankampus.*;

/**
 *
 * @author User
 */
public class ControllerApp {
    // Declare semua menu.
    private MenuHome home;
    private MenuLogin login;
    private MenuHomeMahasiswa homeMhs;
    private MenuHomeAdmin homeAdmin;
    private MenuRiwayatPeminjaman riwayat;
    private MenuDetailBuku detailBuku;
    private MenuPeminjamanBuku peminjamanBuku;
    private MenuPengembalianBuku pengembalianBuku;
    private MenuListBuku listBuku;
    private MenuUpdateBuku updateBuku;
    private MenuKonfirmasi konfirmasi;
    
    // Declare semua class database.
    private DatabaseBuku dbBuku;
    private DatabaseMember dbMember;
    private DatabaseRiwayatPeminjaman dbPeminjaman;
    
    // Declare variable user.
    private String loginAs; // Mengetahui login sebagai role apa
    private Guest guestAccount; // Default ketika masuk ke app
    private Mahasiswa mhsAccount; // Objek ketika login as mahasiswa
    private Admin adminAccount; // Objek ketka login as admin
    
    // Declare atribut lain.
    private List<Buku> AllBook;
    private List<Buku> RecommendedBooks;
    
    public ControllerApp(MenuHome home) {
        // Pembuatan objek semua menu.
        this.home = home;
        login = new MenuLogin(this);
        riwayat = new MenuRiwayatPeminjaman(this);
        homeMhs = new MenuHomeMahasiswa(this);
        homeAdmin = new MenuHomeAdmin(this);
        detailBuku = new MenuDetailBuku(this);
        peminjamanBuku = new MenuPeminjamanBuku(this);
        pengembalianBuku = new MenuPengembalianBuku(this);
        listBuku = new MenuListBuku(this);
        
        // Pembuatan semua class database.
        dbBuku = new DatabaseBuku();
        dbMember = new DatabaseMember();
        dbPeminjaman = new DatabaseRiwayatPeminjaman();
        
        // Pembuatan variable user.
        loginAs = "Guest";
        guestAccount = new Guest();
        
        // Mendapatkan semua list buku.
        AllBook = dbBuku.getAllBuku();
        System.out.println(AllBook.size());
        
        // Mendapatkan rekomendasi buku dan menampilkannya di semua main menu.
        RecommendedBooks = guestAccount.lihatRekomendasiBuku(AllBook);

        // Main menu guest.
        home.getBukuRec1().setText(RecommendedBooks.get(0).getJudulBuku());
        home.getBukuRec2().setText(RecommendedBooks.get(1).getJudulBuku());
        home.getBukuRec3().setText(RecommendedBooks.get(2).getJudulBuku());
        home.getBukuRec4().setText(RecommendedBooks.get(3).getJudulBuku());
        home.getBukuRec5().setText(RecommendedBooks.get(4).getJudulBuku());
        
        home.getTahunTerbitBukuRec1().setText(RecommendedBooks.get(0).getTahunTerbit());
        home.getTahunTerbitBukuRec2().setText(RecommendedBooks.get(1).getTahunTerbit());
        home.getTahunTerbitBukuRec3().setText(RecommendedBooks.get(2).getTahunTerbit());
        home.getTahunTerbitBukuRec4().setText(RecommendedBooks.get(3).getTahunTerbit());
        home.getTahunTerbitBukuRec5().setText(RecommendedBooks.get(4).getTahunTerbit());
          
        home.getAbstrakBukuRec1().setText(RecommendedBooks.get(0).getAbstrak().substring(0,40) + "...");
        home.getAbstrakBukuRec2().setText(RecommendedBooks.get(1).getAbstrak().substring(0,40) + "...");
        home.getAbstrakBukuRec3().setText(RecommendedBooks.get(2).getAbstrak().substring(0,40) + "...");
        home.getAbstrakBukuRec4().setText(RecommendedBooks.get(3).getAbstrak().substring(0,40) + "...");
        home.getAbstrakBukuRec5().setText(RecommendedBooks.get(4).getAbstrak().substring(0,40) + "...");
        
        // Main menu admin.
        homeAdmin.getBukuRec1().setText(RecommendedBooks.get(0).getJudulBuku());
        homeAdmin.getBukuRec2().setText(RecommendedBooks.get(1).getJudulBuku());
        homeAdmin.getBukuRec3().setText(RecommendedBooks.get(2).getJudulBuku());
        homeAdmin.getBukuRec4().setText(RecommendedBooks.get(3).getJudulBuku());
        homeAdmin.getBukuRec5().setText(RecommendedBooks.get(4).getJudulBuku());
        
        homeAdmin.getTahunTerbitBukuRec1().setText(RecommendedBooks.get(0).getTahunTerbit());
        homeAdmin.getTahunTerbitBukuRec2().setText(RecommendedBooks.get(1).getTahunTerbit());
        homeAdmin.getTahunTerbitBukuRec3().setText(RecommendedBooks.get(2).getTahunTerbit());
        homeAdmin.getTahunTerbitBukuRec4().setText(RecommendedBooks.get(3).getTahunTerbit());
        homeAdmin.getTahunTerbitBukuRec5().setText(RecommendedBooks.get(4).getTahunTerbit());
          
        homeAdmin.getAbstrakBukuRec1().setText(RecommendedBooks.get(0).getAbstrak().substring(0,40) + "...");
        homeAdmin.getAbstrakBukuRec2().setText(RecommendedBooks.get(1).getAbstrak().substring(0,40) + "...");
        homeAdmin.getAbstrakBukuRec3().setText(RecommendedBooks.get(2).getAbstrak().substring(0,40) + "...");
        homeAdmin.getAbstrakBukuRec4().setText(RecommendedBooks.get(3).getAbstrak().substring(0,40) + "...");
        homeAdmin.getAbstrakBukuRec5().setText(RecommendedBooks.get(4).getAbstrak().substring(0,40) + "...");
        
        // Main menu mahasiswa.
        homeMhs.getBukuRec1().setText(RecommendedBooks.get(0).getJudulBuku());
        homeMhs.getBukuRec2().setText(RecommendedBooks.get(1).getJudulBuku());
        homeMhs.getBukuRec3().setText(RecommendedBooks.get(2).getJudulBuku());
        homeMhs.getBukuRec4().setText(RecommendedBooks.get(3).getJudulBuku());
        homeMhs.getBukuRec5().setText(RecommendedBooks.get(4).getJudulBuku());
        
        homeMhs.getTahunTerbitBukuRec1().setText(RecommendedBooks.get(0).getTahunTerbit());
        homeMhs.getTahunTerbitBukuRec2().setText(RecommendedBooks.get(1).getTahunTerbit());
        homeMhs.getTahunTerbitBukuRec3().setText(RecommendedBooks.get(2).getTahunTerbit());
        homeMhs.getTahunTerbitBukuRec4().setText(RecommendedBooks.get(3).getTahunTerbit());
        homeMhs.getTahunTerbitBukuRec5().setText(RecommendedBooks.get(4).getTahunTerbit());
          
        homeMhs.getAbstrakBukuRec1().setText(RecommendedBooks.get(0).getAbstrak().substring(0,40) + "...");
        homeMhs.getAbstrakBukuRec2().setText(RecommendedBooks.get(1).getAbstrak().substring(0,40) + "...");
        homeMhs.getAbstrakBukuRec3().setText(RecommendedBooks.get(2).getAbstrak().substring(0,40) + "...");
        homeMhs.getAbstrakBukuRec4().setText(RecommendedBooks.get(3).getAbstrak().substring(0,40) + "...");
        homeMhs.getAbstrakBukuRec5().setText(RecommendedBooks.get(4).getAbstrak().substring(0,40) + "...");
    }
    
    /*
    Method untuk verifikasi login, akan login
    sesuai dengan rolenya.
    */
    public void verifyLogin() {
        // Catat semua inputan.
        String usernameInput = login.getjTextField1().getText();
        String passwordInput = login.getjPasswordField1().getText();
        login.getjRadioButton1().setActionCommand("Mahasiswa");
        login.getjRadioButton2().setActionCommand("Admin");
        
        boolean hasil = guestAccount.login(login.getButtonGroup1().getSelection().getActionCommand());
        
        try {
            if (login.getButtonGroup1().getSelection().getActionCommand().equals("Mahasiswa")) {
            
                // Mahasiswa newMhs = DatabaseMember.cariMahasiswa();

                // Demo.
                if (usernameInput.equals("regy") && passwordInput.equals("1234")) {
                    mhsAccount = new Mahasiswa("regy","1234","Regy Renanda Rahman","1302213117");
                    home.setVisible(false);
                    homeMhs.getLoginAs().setText(mhsAccount.getNama() + " (Mahasiswa)");
                    login.setVisible(false);
                    homeMhs.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null,"Username atau password salah");  
                }
                
            } else if (login.getButtonGroup1().getSelection().getActionCommand().equals("Admin")) {
                if (usernameInput.equals("herlin") && passwordInput.equals("5678")) {
                    adminAccount = new Admin("herlin","5678","Herlin Priatna","p-52");
                    home.setVisible(false);
                    homeAdmin.getLoginAs().setText(adminAccount.getNama() + " (Admin)");
                    login.setVisible(false);
                    homeAdmin.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null,"Username atau password salah");  
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Akun tidak terdaftar");
        }
        
    }
    
    /*
    Method untuk logout dari semua akun.
    */
    public void logoutAllAccount() {
        mhsAccount = null;
        adminAccount = null;
    }
    
    // Beberapa method navigasi.
    
    /*
    Method untuk form yang memiliki tombol back
    ke Home Menu.
    */
    public void showHomeMenu(javax.swing.JFrame page) {
        if (page instanceof MenuMahasiswa) {
            page.setVisible(false);
            homeMhs.setVisible(true); 
        } else if (page instanceof MenuAdmin) {
            page.setVisible(false);
            homeAdmin.setVisible(true); 
        } else {
            page.setVisible(false);
            home.setVisible(true);  
        }
    }
    
    /*
    Method untuk menampilkan menu login.
    */
    public void showLoginMenu() {
        home.setVisible(false);
        login.getjTextField1().setText("regy");
        login.getjPasswordField1().setText("1234");
        login.getjRadioButton1().setSelected(true);
        login.setVisible(true);
    }
    
    /*
    Method untuk menampilkan menu riwayat peminjaman.
    */
    public void showRiwayatPeminjamanMenu() {
        homeMhs.setVisible(false);
        TablePeminjaman table = mhsAccount.lihatRiwayat();
        riwayat.getjTable1().setModel(table);
        riwayat.setVisible(true);
    }
    
    /*
    Method untuk menampilkan laman buku.
    */
    public void showBookDetails() {
        
    }
    
    /*
    Method untuk menampilkan laman semua buku.
    */
    public void showListBookMenu() {
        if (loginAs.equals("Admin")) {
            homeAdmin.setVisible(false);
        } else if (loginAs.equals("Mahasiswa")) {
            homeMhs.setVisible(false);
        } else {
            home.setVisible(false);
        }
        TableBuku table = guestAccount.lihatDaftarBuku(AllBook);
        
        listBuku.getjTable1().setModel(table);
        listBuku.setVisible(true);
    }
    
    /*
    Method untuk menampilkan laman buku khusus yang rekomendasi.
    */
    public void showRecommendedBookDetails(int idx) {
        if (loginAs.equals("Admin")) {
            homeAdmin.setVisible(false);
        } else if (loginAs.equals("Mahasiswa")) {
            homeMhs.setVisible(false);
        } else {
            home.setVisible(false);
        }
        
        detailBuku.getJudulBuku().setText("Judul : "+RecommendedBooks.get(idx).getJudulBuku());
        detailBuku.getjLabel1().setText("Kode buku : "+RecommendedBooks.get(idx).getKodeBuku());
        detailBuku.getjLabel2().setText("Author : "+RecommendedBooks.get(idx).getAuthor());
        detailBuku.getjLabel3().setText("Tahun terbit : "+RecommendedBooks.get(idx).getTahunTerbit());
        detailBuku.getjLabel4().setText("Kategori : "+RecommendedBooks.get(idx).getKategoriBuku());
        detailBuku.getjLabel5().setText("Stok buku : "+RecommendedBooks.get(idx).getStokBuku());
        detailBuku.getjLabel6().setText("Banyak peminjaman : "+RecommendedBooks.get(idx).getFrekPeminjaman());
        // Belum bisa warp text.
        detailBuku.getjLabel7().setText("Abstract : \n"+RecommendedBooks.get(idx).getAbstrak());
        detailBuku.setVisible(true);
    }
    
    /*
    Method untuk menampilkan laman peminjaman buku.
    */
    public void showPeminjamanBukuMenu() {
        homeMhs.setVisible(false);
        peminjamanBuku.setVisible(true);
    }
    
    /*
    Method untuk menampilkan laman pengembalian buku.
    */
    public void showPengembalianBukuMenu() {
        homeMhs.setVisible(false);
        pengembalianBuku.setVisible(true);
    }
    
}
