/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author RAKA
 */
import java.util.Scanner;
public class hotel {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Membuat objek kamar
            Kamar kamar101 = new Kamar("101", "Earth");
            Kamar kamar102 = new Kamar("102", "Sky");
            Kamar kamar103 = new Kamar("103", "Earth");
            Kamar kamar104 = new Kamar("104", "Sky");
            
            
            System.out.println("Selamat datang di Hotel Mahal");
            System.out.println("---Anda bayar kami senang----");
            System.out.println("\nApakah Anda admin atau customer?");
            String tipePengguna = scanner.nextLine();
            
            //customer
            if (tipePengguna.equalsIgnoreCase("customer")) {
               System.out.println("Masukkan nama anda : "); 
               String namaCustomer = scanner.nextLine();
               Customer Customer = new Customer(namaCustomer);
               Customer.levelAkses();
               
        //menampilkan tipe kamar kepada customer       
        System.out.println("\nTipe Kamar yang Tersedia di Hotel:");
        System.out.println("1. Kamar 101: " + kamar101.getTipeKamar());
        System.out.println("2. Kamar 102: " + kamar102.getTipeKamar());
        System.out.println("2. Kamar 103: " + kamar103.getTipeKamar());
        System.out.println("2. Kamar 104: " + kamar104.getTipeKamar());
                      
        OUTER:
                while (true) {
                    System.out.println("\nMenu:");
                    System.out.println("1. Cek ketersediaan kamar");
                    System.out.println("2. Pesan kamar");
                    System.out.println("3. Keluar");
                    System.out.print("Pilih opsi: ");
                    int pilihan = scanner.nextInt();
                    scanner.nextLine();
                    
                    switch (pilihan) {
                        case 1 ->                             {
                                // Mengecek ketersediaan kamar
                                System.out.println("Masukkan nomor kamar : ");
                                String nomorKamar = scanner.nextLine();
                        switch (nomorKamar) {
                            case "101" -> Customer.cekKetersediaanKamar(kamar101);
                            case "102" -> Customer.cekKetersediaanKamar(kamar102);
                            case "103" -> Customer.cekKetersediaanKamar(kamar103);
                            case "104" -> Customer.cekKetersediaanKamar(kamar104);
                            default -> System.out.println("Nomor kamar tidak valid.");
                        }
 }
                        case 2 ->                             {
                                // Melakukan pemesanan kamar
                                System.out.println("Pilih kamar untuk dipesan : ");
                                String nomorKamar = scanner.nextLine();
                        switch (nomorKamar) {
                            case "101" -> Customer.pesanKamar(kamar101, namaCustomer);
                            case "102" -> Customer.pesanKamar(kamar102, namaCustomer);
                            case "103" -> Customer.pesanKamar(kamar103, namaCustomer);
                            case "104" -> Customer.pesanKamar(kamar104, namaCustomer);
                            default -> System.out.println("Nomor kamar tidak valid.");
                        }
 }
                        case 3 -> {
                            System.out.println("Terima kasih telah memesan hotel kami");
                            break OUTER;
                        }
                        default -> System.out.println("Opsi tidak valid. Silakan coba lagi.");
                    }
                }
                
            //admin
            } else if (tipePengguna.equalsIgnoreCase("admin")) {
                System.out.println("Masukkan nama anda : ");
                String namaAdmin = scanner.nextLine();
                Admin admin = new Admin(namaAdmin);
                admin.levelAkses();
                
                OUTER_1:
                while (true) {
                    System.out.println("\nMenu Admin:");
                    System.out.println("1. Tandai kamar tersedia kembali");
                    System.out.println("2. Keluar");
                    System.out.print("Pilih opsi: ");
                    int pilihan = scanner.nextInt();
                    scanner.nextLine();
                    switch (pilihan) {
                        case 1 ->                             {
                                // Menandai kamar tersedia
                                System.out.println("Masukkan nomor kamar yang ingin ditandai tersedia : ");
                                String nomorKamar = scanner.nextLine();
                                if (nomorKamar.equals("101")) {
                                    admin.tandaiKamarTersedia(kamar101);
                                } else if (nomorKamar.equals("102")) {
                                    admin.tandaiKamarTersedia(kamar102);
                                } else if (nomorKamar.equals("103")) {
                                    admin.tandaiKamarTersedia(kamar103);
                                } else if (nomorKamar.equals("104")) {
                                    admin.tandaiKamarTersedia(kamar104);
                                } else {
                                    System.out.println("Nomor kamar tidak valid.");
                                }                                  }
                        case 2 -> {
                            break OUTER_1;
                        }
                        default -> System.out.println("Opsi tidak valid. Silakan coba lagi.");
                    }
                }
                
            } else {
                System.out.println("Tipe pengguna tidak valid. Silakan coba lagi.");
            }
        }
    }
}
