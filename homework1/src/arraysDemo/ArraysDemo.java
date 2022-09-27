/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package arraysDemo;

/**
 *
 * @author eray_
 */
public class ArraysDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";

        for (String string : ogrenciler) {
            System.out.println(string);
        }
        System.out.println("-----------------------------------------------o--------o---------------------------------------");
        for(String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }
	
    }
}
