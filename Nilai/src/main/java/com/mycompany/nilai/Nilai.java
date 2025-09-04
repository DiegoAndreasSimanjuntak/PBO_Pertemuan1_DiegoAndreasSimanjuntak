/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nilai;

/**
 *
 * @author Diego
 */
// Class Nilai
public class Nilai {
    String nim;
    String nama;
    double absen;
    double tugas;
    double uts;
    double uas;
    double nilaiAkhir;

    // Constructor Nilai
    public Nilai(String nim, String nama, double absen, double tugas, double uts, double uas) {
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        // Hitung nilai akhir sesuai bobot
        this.nilaiAkhir = (0.1 * absen) + (0.2 * tugas) + (0.3 * uts) + (0.4 * uas);
    }

    // Method CetakNilai
    void CetakNilai() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Absen [10%] : " + absen);
        System.out.println("Nilai Tugas [20%] : " + tugas);
        System.out.println("Nilai UTS [30%] : " + uts);
        System.out.println("Nilai UAS [40%] : " + uas);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}
