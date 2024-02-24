/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Hewan.Ayam;
import Hewan.Kucing;
import Tumbuhan.Bunga;
import Tumbuhan.Pohon;

/**
 *
 * @author abel
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Haloo!");
        System.out.println("Ini adalah tugas pemrograman");
        System.out.println("NIM : 123220167");
        System.out.println("nama : Abellia Melati Putri");
        System.out.println("");
        
        System.out.println("memanggil kelas ayam");
        Ayam ayam = new Ayam("Kukuk");
        System.out.println("Suara ayam: " + Ayam.suara);
        ayam.hapusNama();
        ayam.simpanNama("Kukukukuk");
        ayam.bacaNama();
        System.out.println("");
        
        System.out.println("memanggil kelas kucing");
        Kucing kucing = new Kucing("Kukuk");
        System.out.println("Suara kucing: " + Kucing.suara);
        kucing.hapusNama();
        kucing.simpanNama("Kukukukuk");
        kucing.bacaNama();
        System.out.println("");
        
        System.out.println("memanggil kelas bunga");
        Bunga bunga = new Bunga("Kukuk");
        System.out.println("Suara bunga: " + Bunga.suara);
        bunga.hapusNama();
        bunga.simpanNama("Kukukukuk");
        bunga.bacaNama();
        System.out.println("");
        
        System.out.println("memanggil kelas pohon");
        Pohon pohon = new Pohon("Kukuk");
        System.out.println("Suara pohon: " + Pohon.suara);
        pohon.hapusNama();
        pohon.simpanNama("Kukukukuk");
        pohon.bacaNama();
        System.out.println("");
        
    }
}
