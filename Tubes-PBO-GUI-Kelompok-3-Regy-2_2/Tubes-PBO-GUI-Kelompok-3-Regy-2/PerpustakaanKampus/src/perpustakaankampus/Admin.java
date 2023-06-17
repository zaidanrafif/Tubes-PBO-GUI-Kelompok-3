/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaankampus;

/**
 *
 * @author User
 */
public class Admin extends Guest implements Logout {
    private String username;
    private String password;
    private String nama;
    private String kodePustakawan;
    
    public Admin(String username, String password, String nama, String kodePustakawan) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.kodePustakawan = kodePustakawan;
    }
    
    public void menambahBuku() {}
    
    public void menghapusBuku() {}
    
    public void updateBuku() {}
    
    public void konfirmasiPeminjaman() {}
    
    public void konfirmasiPengembalian() {}
    
    public void membuatLaporan() {}
    
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
     * @return the kodePustakawan
     */
    public String getKodePustakawan() {
        return kodePustakawan;
    }
    
    
}
