/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package recapDemo2;

/**
 *
 * @author eray_
 */
public class RecapDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        double[] myList = { 11.2, 1.3, 4.3, 5.6 };
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
                if (max < number) {
                        max = number;
                }
                total += number;
                System.out.println(number);
        }

        System.out.println("Toplam = " + total);
        System.out.println("En Büyük = " + max);
    }
}
