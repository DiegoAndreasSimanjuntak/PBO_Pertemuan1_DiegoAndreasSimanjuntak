/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nilai;

/**
 *
 * @author Diego
 */
// Class DemoNilai
public class DemoNilai {
    public static void main(String[] args) {
        // Isi data nilai mahasiswa
        Nilai nilaiMhs = new Nilai("2410631170068", "Diego", 90, 85, 80, 88);

        // Panggil method cetak nilai
        nilaiMhs.CetakNilai();
    }
}
