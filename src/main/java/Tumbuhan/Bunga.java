/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tumbuhan;

/**
 *
 * @author abel
 */
public class Bunga {
    public static final String suara = "tidak bersuara!";
    public String nama = "";
    public Bunga (String nama){
        this.nama = nama;
        System.out.println("Nama Bunga: " + this.nama);
    }
    
    public void simpanNama(String nama)
    {
        this.nama = nama;
        System.out.println("Nama Bunga yang baru disimpan: " + this.nama);
    }
    public void hapusNama()
    {
        this.nama = "";
        System.out.println("Nama Bunga dihapus");
    }
    
    public void bacaNama()
    {
        System.out.println("Nama Bunga: " + this.nama);
    }
}
