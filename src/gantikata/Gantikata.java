/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gantikata;

import java.util.Scanner;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan hasil 
 * penggantian suatu kata tersebut menjadi kata yang anda inginkan
 */
public class Gantikata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kata1;
        String kata2;
        String kata3;
        
        Scanner kata = new Scanner(System.in);
        
        System.out.println("====Program Mengganti Kata=====");
        
        System.out.printf("\n"+"Masukkan Kalimat : ");
        kata1 = kata.nextLine();
        
        System.out.printf("Ganti Kata\t : ");
        kata2 = kata.nextLine();
        
        System.out.printf("Menjadi kata\t : ");
        kata3 = kata.nextLine();
        
        //proses penggantian kata
        System.out.println("\n"+"====Hasil Formating=====");
        System.out.println("Kalimat awal : "+kata1);
        String Katabaru = kata1.replace(kata2, kata3);
        System.out.println("Kalimat Baru : "+Katabaru);
        
        System.out.println ("\nDevelop by : Fiqri Akbar Pratama");
    }
    
}
