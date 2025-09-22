/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus TUF
 */
public class Lipstick extends AlatMakeup{
    private String warna; 
    
    public Lipstick(String nama, String jenis, String merk, int jumlah, String warna) {
        super(nama, jenis, merk, jumlah);
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public String toString() {
        return super.info() + " | Warna: " + warna;
    }
}
