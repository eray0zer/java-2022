/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recapDemo1;

/**
 *
 * @author eray_
 */
public class RecapDemo1 {
    public static void main(String[] args) {

        int sayi1 = 201;
        int sayi2 = 31;
        int sayi3 = 48;
        int enBuyuk = sayi1;
        if (enBuyuk < sayi2) {
                enBuyuk = sayi2;
        } 
        if(enBuyuk < sayi3) {
                enBuyuk = sayi3;
        }

        System.out.println("En büyük = "+ enBuyuk);

    }
}
