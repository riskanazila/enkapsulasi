/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Biodata {
    public static void main(String[] args) {
        String nama, tempat, tanggal, jenis, alamat, motto;
        int nis;

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("^^      BIODATA       ^^");
        System.out.println("------------------------");
        System.out.print("Nama            : ");
        nama = keyboard.next();
        System.out.print("NIS             : ");
        nis = keyboard.nextInt();
        System.out.print("Tempat lahir    : ");
        tempat = keyboard.next();
        System.out.print("Tanggal lahir   : ");
        tanggal = keyboard.next();
        System.out.print("Jenis Kelamin   : ");
        jenis = keyboard.next();
        System.out.print("Alamat di Malang: ");
        alamat = keyboard.next();
        System.out.print("Motto           "
                + ": ");
        motto = keyboard.next();
        
    }
}
