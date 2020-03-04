/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava;

import java.util.Scanner;


/**
 *
 * @author basazard
 */
public class BelajarJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//    Membuat Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Angka: ");
        int hasil = input.nextInt();
        
        if(hasil < 10){
            System.out.println("Hasil kurang dari 10");
        }
        else if(hasil <= 31){
            System.out.println("Hasil diatas 10 dan dibawah 31");
        }
        else {
            System.out.println("Hasil tidak memenuhi");
        }
        
    }
}
