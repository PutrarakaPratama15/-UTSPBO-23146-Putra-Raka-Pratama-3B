/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author RAKA
 */
public class Admin extends Pengguna {
    //konstrukto untuk admin
    public Admin(String nama) {
        super(nama, "Admin");
    }

    @Override
    public void levelAkses() {
        System.out.println("Level akses: Admin");
    }

    //method untuk ngecek kamar
    public void cekKetersediaanKamar(Kamar kamar) {
        if (kamar.isTersedia()) {
            System.out.println("Kamar " + kamar.getNomorKamar() + " tersedia.");
        } else {
            System.out.println("Kamar " + kamar.getNomorKamar() + " sudah dipesan.");
        }
    }

    //method untuk menandai kamar yang tersedia
    public void tandaiKamarTersedia(Kamar kamar) {
        kamar.setTersedia(true);
        System.out.println("Kamar " + kamar.getNomorKamar() + " sekarang tersedia.");
    }
}