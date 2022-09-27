/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package arkadasSayilar;

/**
 *
 * @author eray_
 */
public class ArkadasSayilar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number1 = 220;
        int total1 = 0;

        int number2 = 284;
        int total2 = 0;

        for (int i = 1; i < number1; i++) {
                if (number1 % i == 0) {
                        total1+=i;
                }
        }

        for (int i = 1; i < number2; i++) {
                if (number2 % i == 0) {
                        total2+=i;
                }
        }
        if (total1 == number2 && total2 == number1) {
                System.out.println("Arkadaş sayılar");
        } else {
                System.out.println("Arkadaş sayı değiller");
        }

    }

}
