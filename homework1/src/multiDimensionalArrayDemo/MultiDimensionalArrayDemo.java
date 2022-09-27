/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package multiDimensionalArrayDemo;

/**
 *
 * @author eray_
 */
public class MultiDimensionalArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Çanakkale";
        sehirler[0][2] = "Bursa";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        for (int i = 0; i <= 2; i++) {
                System.out.println("-------------------------");
                for (int j = 0; j <= 2; j++) {
                        System.out.println(sehirler[i][j]);
                }
        }
    }
}
