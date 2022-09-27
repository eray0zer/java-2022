/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package sayiBulma;

/**
 *
 * @author eray_
 */
public class SayiBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0, 99 };
        int aranacak = 98;
        boolean isFind = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                isFind = true;
                break;
            }
        }

        if (isFind) {
            System.out.println("Sayı bulundu");
        } else {
            System.out.println("Sayı bulunamadı");
        }
    }
}
