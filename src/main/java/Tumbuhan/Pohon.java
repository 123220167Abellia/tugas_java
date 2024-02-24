/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tumbuhan;

/**
 *
 * @author abel
 */
public class Pohon {
    public static final String suara = "tidak bersuara!";
    public String nama = "";
    public Pohon (String nama){
        this.nama = nama;
        System.out.println("Nama Pohon: " + this.nama);
    }
    
    public void simpanNama(String nama)
    {
        this.nama = nama;
        System.out.println("Nama Pohon yang baru disimpan: " + this.nama);
    }
    public void hapusNama()
    {
        this.nama = "";
        System.out.println("Nama Pohon dihapus");
    }
    
    public void bacaNama()
    {
        System.out.println("Nama Pohon: " + this.nama);
    }
}
