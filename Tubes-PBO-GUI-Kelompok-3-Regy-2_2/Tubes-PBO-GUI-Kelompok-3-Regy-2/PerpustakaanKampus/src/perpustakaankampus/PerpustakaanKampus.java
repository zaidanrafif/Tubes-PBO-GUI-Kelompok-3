/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package perpustakaankampus;

import GUIPerpustakaan.MenuHome;
import GUIPerpustakaan.MenuLogin;
import GUIPerpustakaan.MenuRiwayatPeminjaman;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author User
 */
public class PerpustakaanKampus {

    public static void main(String[] args) throws ParseException {
        System.out.println("Hello World!");
        
        // https://www.javatpoint.com/java-string-to-date
        String sDate1="31/12/1998";
        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
        Date date1=formatter1.parse(sDate1);
        String date2 = formatter1.format(date1);
        System.out.println(sDate1+"\t"+date1+"\t"+date2);

        
//        MenuLogin login = new MenuLogin();
//        login.setVisible(true);
        MenuHome home = new MenuHome();
        home.setVisible(true);
//        MenuRiwayatPeminjaman riwayat = new MenuRiwayatPeminjaman();
//        riwayat.setVisible(true);
    }
}
