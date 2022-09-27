/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package mukemmelSayi;

/**
 *
 * @author eray_
 */
public class mukemmelSay {

    /**
     * @param args the command line arguments
*/
    public static void main(String[] args) {
       int number = 28;
       int total = 0;
       // tam bölenleri toplamı kendisi ise mükemmeldir.
       for (int i = 1; i < number; i++) {
               if (number % i == 0) {
                       total+=i;
               }
       }

       if(number == total) {
               System.out.println("Sayı mükemmel sayidir");
               System.out.println("number : " + number + " total : " + total);
       }else {
               System.out.println("Sayı mükemmel sayı değildir");
               System.out.println("number : " + number + " total : " + total);
       }
   }
}
