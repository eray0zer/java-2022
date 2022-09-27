/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package methods;

/**
 *
 * @author eray_
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 10;
        
        sayiBulmaca(sayilar, aranacak);
        mesajVer("test");
    }

    public static void sayiBulmaca(int[] sayilar, int aranacak) {

        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            mesajVer("Sayı mevcuttur: " + aranacak);
        } else {
            mesajVer("Sayı mevcut değildir: " + aranacak);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}
