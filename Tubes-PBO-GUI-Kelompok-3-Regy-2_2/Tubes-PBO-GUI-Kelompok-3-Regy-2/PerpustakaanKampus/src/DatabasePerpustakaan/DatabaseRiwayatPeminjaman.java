/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabasePerpustakaan;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import perpustakaankampus.Peminjaman;

/**
 *
 * @author User
 */
public class DatabaseRiwayatPeminjaman {
    List<Peminjaman> listPeminjaman;
    public List<Peminjaman> getAllPeminjaman(){
        listPeminjaman = new ArrayList<>();
        Statement  statement;
        String sql = "SELECT * FROM riwayat_peminjaman";
        try {
            statement = dbConnection.getConnection().createStatement();
            
            try (ResultSet result = statement.executeQuery(sql)){
                while (result.next()){
                    Peminjaman peminjaman = new Peminjaman();
                    peminjaman.setIdPeminjaman(result.getString("IDPeminjaman"));
                    peminjaman.setNim(result.getString("NIM"));
                    peminjaman.setKodeBuku(result.getString("KodeBuku"));
                    peminjaman.setJudulBuku(result.getString("JudulBuku"));
                    peminjaman.setTanggalPinjam(result.getDate("TanggalPinjam"));
                    peminjaman.setBatasPinjam(result.getDate("BatasPinjam"));
                    peminjaman.setDisetujui(result.getBoolean("Disetujui"));
                    peminjaman.setSelesai(result.getBoolean("Selesai"));
                    peminjaman.setDenda(result.getInt("Denda"));
                    peminjaman.setKondisiBuku(result.getString("KondisiBuku"));
                    listPeminjaman.add(peminjaman);
             }
                statement.close();
            }
            return listPeminjaman;
        } catch (SQLException e) {
            Logger.getLogger(DatabaseRiwayatPeminjaman.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
}
