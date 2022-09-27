/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package stringDemo;

/**
 *
 * @author eray_
 */
public class StringDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
		String mesaj = "Bugün hava çok güzel.";

		System.out.println("Eleman sayısı : " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4)); // string index erişimi
		System.out.println(mesaj.concat("çok")); // sona ekleme
		System.out.println(mesaj.startsWith("B")); // bool check
		System.out.println(mesaj.endsWith(".")); // bool check
		char[] karakterler = new char[8]; 
		mesaj.getChars(0, 5, karakterler, 2); // string.getChars 
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av")); // metin arama
		System.out.println(mesaj.lastIndexOf("a")); // sondan arama

		// yeni metin verir eskisini değiştirmez
		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj.substring(2)); // parçalamaya başlancak yer
		System.out.println(mesaj.substring(2, 4)); // 2 den başla 4 e kadar al

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim()); // baş-son
    }
}
