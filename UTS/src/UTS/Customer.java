/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author RAKA
 */
public class Customer extends Pengguna {
    //konstruktor untuk customer
    public Customer(String nama) {
        super(nama, "Umum");
    }

    @Override
    public void levelAkses() {
        System.out.println("Level akses: Pengguna Umum");
    }

    //method untuk memesan kamar
    public void pesanKamar(Kamar kamar, String namaPelanggan) {
        if (kamar.isTersedia()) {
            Pemesanan pemesanan = new Pemesanan(kamar, namaPelanggan);
            System.out.println("Pemesanan berhasil.");
            pemesanan.tampilkanDetailPemesanan();
        } else {
            System.out.println("Kamar tidak tersedia.");
        }
    }

    //method untuk ngecek kamar
    public void cekKetersediaanKamar(Kamar kamar) {
        if (kamar.isTersedia()) {
            System.out.println("Kamar " + kamar.getNomorKamar() + " tersedia.");
        } else {
            System.out.println("Kamar " + kamar.getNomorKamar() + " sudah dipesan.");
        }
    }

}