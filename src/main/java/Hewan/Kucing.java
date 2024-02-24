/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewan;

/**
 *
 * @author abel
 */
public class Kucing {
    public static final String suara = "Meoong!";
    public String nama = "";
    public Kucing (String nama){
        this.nama = nama;
        System.out.println("Nama Kucing: " + this.nama);
    }
    
    public void simpanNama(String nama)
    {
        this.nama = nama;
        System.out.println("Nama Kucing yang baru disimpan: " + this.nama);
    }
    public void hapusNama()
    {
        this.nama = "";
        System.out.println("Nama Kucing dihapus");
    }
    
    public void bacaNama()
    {
        System.out.println("Nama Kucing: " + this.nama);
    }
}
