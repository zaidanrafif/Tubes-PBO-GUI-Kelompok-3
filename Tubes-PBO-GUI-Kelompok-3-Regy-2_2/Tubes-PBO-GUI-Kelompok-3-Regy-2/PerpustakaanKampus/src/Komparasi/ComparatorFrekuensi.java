/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Komparasi;

import java.util.*;
import perpustakaankampus.Buku;

/**
 *
 * @author User
 */
public class ComparatorFrekuensi implements Comparator<Buku> {

    @Override
    public int compare(Buku o1, Buku o2) {
        return Integer.compare( o2.getFrekPeminjaman(), o1.getFrekPeminjaman());
    }
    
}
