/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author RAKA
 */
public abstract class Pengguna {
    //variabel untuk nama dan peran
    protected String nama;
    protected String peran;

    //konstruktor untuk pengguna
    public Pengguna(String nama, String peran) {
        this.nama = nama;
        this.peran = peran;
    }

    public String getNama() {
        return nama;
    }

    public String getPeran() {
        return peran;
    }

    //method untuk subclass
    public abstract void levelAkses();
}