/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControllerPerpustakaan;

import GUIPerpustakaan.MenuHome;
import GUIPerpustakaan.MenuLogin;

/**
 *
 * @author User
 */
public class ControllerApp {
    private MenuHome home;
    private MenuLogin login = new MenuLogin();
    
    public ControllerApp(MenuHome home) {
        this.home = home;
    }
    
    public void loginMember() {
        home.setVisible(false);
        login.setVisible(true);
    }
    
    public void loginMahasiswa() {
        //test
        login.setText();
    }
}
