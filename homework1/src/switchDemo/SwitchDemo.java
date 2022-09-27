/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package switchDemo;

/**
 *
 * @author eray_
 */
public class SwitchDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        char grade = 'F';

        switch (grade) {
        case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
        case 'B':
        case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
        case 'D':
                System.out.println("Fena değil : Geçtiniz");
                break;
        case 'F':
                System.out.println("Malesef kaldınız");
                break;

        default:
                System.out.println("Geçersiz not");
                break;
        }
    }
}
