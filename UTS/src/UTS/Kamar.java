/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS;

/**
 *
 * @author RAKA
 */
public class Kamar {
    //variabel untuk nomor kamar, tersedia ,dan tipe kamar
    private final String nomorKamar;
    private boolean tersedia;
    private final String tipeKamar;
    
    //konstruktor untuk kamar
    public Kamar(String nomorKamar, String tipeKamar) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.tersedia = true; 
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}