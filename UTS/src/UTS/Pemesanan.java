/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author RAKA
 */
public class Pemesanan {
    //variabel untuk kamar dan nama pelanggan
    private final Kamar kamar;
    private final String namaPelanggan;

    //konstruktor untuk pemesanan
    public Pemesanan(Kamar kamar, String namaPelanggan) {
        this.kamar = kamar;
        this.namaPelanggan = namaPelanggan;
        kamar.setTersedia(false); // ketika dipesan, kamar tidak tersedia
    }

    //method menampilkan pesanan
    public void tampilkanDetailPemesanan() {
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Nomor Kamar: " + kamar.getNomorKamar());
        System.out.println("Tipe Kamar: " + kamar.getTipeKamar());
    }
}