//package
package com.gilangale;

import java.util.Scanner;

// Class PerpusSederhana
class PerpusSederhana{
    String judul, pengarang, penerbit, isbn, tahunTerbit, jumlah, status; // Atribut

    // Constructor
    PerpusSederhana (String judul, String pengarang, String penerbit, String isbn, String tahunTerbit, String jumlah, String status){
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.isbn = isbn;
        this.tahunTerbit = tahunTerbit;
        this.jumlah = jumlah;
        this.status = status;
    }

    // Method untuk menampilkan informasi dari katalog buku
    void tampilkanInformasi(){
        System.out.println("JUDUL           : "+judul);
        System.out.println("PENGARANG       : "+pengarang);
        System.out.println("PENERTBI        : "+penerbit);
        System.out.println("TAHUN TERBIT    : "+tahunTerbit);
        System.out.println("ISBN            : "+isbn);
        System.out.println("JUMLAH          : "+jumlah);
        System.out.println("STATUS          : "+status);

    }
}

// Kelas Informasi
class Informasi{
    // Method untuk menampilkan katalog buku perpustakaan
    void dataBuku(){
        System.out.println("\n|               DAFTAR BUKU              |");
        System.out.println("==========================================");
        System.out.println("1. Membangun Jaringan LAN");
        System.out.println("2. Belajar OOP dengan Java");
        System.out.print("Data Anda akan Pilih ? : ");
    }

    // Method untuk menampilkan katalog kamus perpustakaan
    void dataKamus(){
        System.out.println("\n|              DAFTAR KAMUS              |");
        System.out.println("==========================================");
        System.out.println("1. English for Computer");
        System.out.println("2. English for Employe");
        System.out.print("Data Anda akan Pilih ? : ");
    }

    // Method untuk menampilkan katalog majalah perpustakaan
    void dataMajalah(){
        System.out.println("\n|             DAFTAR MAJALAH             |");
        System.out.println("==========================================");
        System.out.println("1. Pesona Muda Edisi Februari 2009");
        System.out.println("2. Ilmu Komputer Edisi Januari 2009");
        System.out.print("Data Anda akan Pilih ? : ");
    }
}

// Class main sebagai class utama
public class Main {
    public static void main(String[] args) {
        String cekStatus;
        do {
            int pilihKategori, pilihBuku, pilihKamus, pilihMajalah;

            System.out.print("==========================================\n");
            System.out.println("        PERPUSTAKAAN SEDERHANA");
            System.out.print("==========================================\n");
            System.out.println("Pilih Kategori : ");
            System.out.println("        1. Buku");
            System.out.println("        2. Kamus");
            System.out.println("        3. Majalah");
            System.out.println("        0. Keluar");
            System.out.print("Kategori yang dipilih [1-3]: ");
            Scanner inputUser = new Scanner(System.in);
            pilihKategori = inputUser.nextInt();

            switch (pilihKategori) {
                case 1:
                    Informasi tampilBuku = new Informasi();
                    tampilBuku.dataBuku();
                    pilihBuku = inputUser.nextInt();

                    PerpusSederhana buku1 = new PerpusSederhana("Membangun Jaringan LAN", "Gilang Aleyusta", "Gramedia", "2015-0610-17", "2020", "10","Dapat dipinjam");
                    PerpusSederhana buku2 = new PerpusSederhana("Belajar OOP dengan Java", "Yohanes Edu", "Gramedia", "2015-0610-10", "2020", "11","Dapat dipinjam");

                    System.out.println("\n+++ INFORMASI +++");
                    if (pilihBuku == 1) {
                        buku1.tampilkanInformasi();
                    } else if (pilihBuku == 2) {
                        buku2.tampilkanInformasi();
                    } else {
                        System.out.println("data tidak valid");
                    }
                    break;

                case 2:
                    Informasi tampilKamus = new Informasi();
                    tampilKamus.dataKamus();
                    pilihKamus = inputUser.nextInt();

                    PerpusSederhana kamus1 = new PerpusSederhana("English for Computer", "James Harden", "Erlangga", "2015-0611", "2020", "13","Dapat dipinjam");
                    PerpusSederhana kamus2 = new PerpusSederhana("English for Employe", "Michel Jordan", "Erlangga", "2015-0612", "2020", "14","Dapat dipinjam");

                    System.out.println("\n+++ INFORMASI +++");
                    if (pilihKamus == 1) {
                        kamus1.tampilkanInformasi();
                    } else if (pilihKamus == 2) {
                        kamus2.tampilkanInformasi();
                    } else {
                        System.out.println("data tidak valid");
                    }
                    break;

                case 3:
                    Informasi tampilMajalah = new Informasi();
                    tampilMajalah.dataMajalah();
                    pilihMajalah = inputUser.nextInt();

                    PerpusSederhana majalah1 = new PerpusSederhana("Pesona Muda Edisi Februari 2020", "Reffitho Corner", "Republika", "-", "2020", "1","Tidak dapat dipinjam");
                    PerpusSederhana majalah2 = new PerpusSederhana("Ilmu Komputer Edisi Januari 2020", "John Cenna", "Republika", "-", "2020", "1","Tidak dapat dipinjam");

                    System.out.println("\n+++ INFORMASI +++");
                    if (pilihMajalah == 1) {
                        majalah1.tampilkanInformasi();
                    } else if (pilihMajalah == 2) {
                        majalah2.tampilkanInformasi();
                    } else {
                        System.out.println("data tidak valid");
                    }
                    break;

                default:
                    System.exit(0);
            }

            System.out.print("\nIngin memakai program kembali (Y/ N)? ");
            cekStatus = inputUser.next();

        } while (cekStatus.equals("Y") || cekStatus.equals("y"));
    }
}


