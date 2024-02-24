/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewan;

/**
 *
 * @author abel
 */
public class Ayam {

    /**
     *
     */
    public static final String suara = "kukuruyuuuk!";
    public String nama = "";
    public Ayam (String nama){
        this.nama = nama;
        System.out.println("Nama Ayam: " + this.nama);
    }
    
    public void simpanNama(String nama)
    {
        this.nama = nama;
        System.out.println("Nama Ayam yang baru disimpan: " + this.nama);
    }
    public void hapusNama()
    {
        this.nama = "";
        System.out.println("Nama Ayam dihapus");
    }
    
    public void bacaNama()
    {
        System.out.println("Nama Ayam: " + this.nama);
    }
}
