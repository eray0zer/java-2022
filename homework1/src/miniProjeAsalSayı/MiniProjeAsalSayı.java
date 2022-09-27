/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package miniProjeAsalSayı;

/**
 *
 * @author eray_
 */
public class MiniProjeAsalSayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int number = 155553;

        boolean isPrime = true;

        if (number == 1) {
                System.out.println("Sayı asal sayı değildir");
        }

        if (number < 1) {
                System.out.println("Geçersiz sayı");
        }


        for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                        isPrime = false;
                        break;
                }
        }

        if (isPrime) {
                System.out.println("Sayı asaldır");
        } else {
                System.out.println("Sayı asal değildir");
        }
        
        
    }
}
