/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus TUF
 */
public class Foundation extends AlatMakeup{
    private String shade;
    
    public Foundation(String nama, String jenis, String merk, int jumlah, String shade) {
        super(nama, jenis, merk, jumlah);
        this.shade = shade;
    }

    public String getShade() {
        return shade;
    }

    public void setShade(String shade) {
        this.shade = shade;
    }
    
    public String toString() {
        return super.info() + " | Shade: " + shade;
    }
}
