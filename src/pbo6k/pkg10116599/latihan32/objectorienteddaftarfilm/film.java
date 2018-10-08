/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan32.objectorienteddaftarfilm;

/**
 *
 * @author eka
 */
public class film {
    String filmName;
    String filmGenre;
    double filmRating;
    int filmDuration;
    
    public void nowPlaying(String parJudul, String parGenre, double parRating, int parDuration) {
        System.out.println("Judul Film : " +parJudul);
        System.out.println("Genre Film : " +parGenre);
        System.out.println("Rating Film : " +parRating);
        System.out.println("Duration Film : " +parDuration+ " Menit");
        System.out.println();      
    }
    
}
