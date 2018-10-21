/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan50.energikinetik;

/**
 *
 * @author Lenovo 
 * NAMA : RD Muhammad Djulfikar BU 
 * KELAS : IF3 
 * NIM : 10117086
 * DESKRIPSI PROGRAM :
 */
public class PBO310117086Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Energi objE = new Energi();
        /*rubah gram ke kilogram dengan cara 145 gram dibgai dengan 1000
        menghasilkan nilai 0.145 kilogram*/
        objE.setMassa(0.145);
        objE.setKecepatan(25);
        System.out.println("Sebuah bola baseball dengan massa 145 g dilempar "
                + "dengan kecepatan 25 m/s");
        System.out.println("a. Berapakah Energi Kinetiknya ?");
        System.out.println("b. Berapakah usaha yang dilakukan pada bola untuk "
                + "mencapai kecepatan ini jika dimulai dari keadaan diam ?");
        System.out.println("");
        System.out.println("=====JAWABAN=====");
        System.out.println("a. Energi Kinetiknya Adalah "
                + objE.hitungEnergiKinetik() + " Joule");
        System.out.println("b. Usahanya adalah " + objE.hitungUsaha()
                + " Joule");
        System.out.println("");
        System.out.println("Jadi energi kinetik dan usaha bernilai sama yaitu "
                + "sebesar 45.3125 Joule");

    }

}
