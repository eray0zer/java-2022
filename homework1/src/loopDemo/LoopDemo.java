/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package loopDemo;

/**
 *
 * @author eray_
 */
public class LoopDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                //For
        for (int i = 0; i < 10; i+=4) {
                System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        //While
        int i = 2;
        while (i<10) {
                System.out.println(i);
                i+=2;
        }
        System.out.println("While Döngüsü Bitti");

        //Do while
        i = 1;
        do {
                System.out.println(i);
                i+=2;
        } while (i < 10);
        System.out.println("Do-While Döngüsü Bitti");
    }
}
