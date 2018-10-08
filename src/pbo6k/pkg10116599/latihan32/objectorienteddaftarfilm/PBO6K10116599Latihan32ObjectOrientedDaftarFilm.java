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
public class PBO6K10116599Latihan32ObjectOrientedDaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("===Daftar Film Sedang Tayang===");
        System.out.println();
        
        film film1 = new film();
        film1.nowPlaying("Venom", "Action, Horror, Scifi", 8.5, 120);
        
        film film2 = new film();
        film2.nowPlaying("Small Foot", "Anamation", 9.0, 96);
        
        film film3 = new film();
        film3.nowPlaying("Crazy Rich Asian", "Comedy", 7.8, 119);
        
        film film4 = new film();
        film4.nowPlaying("Asih", "Horror", 6.0, 100);
    }
    
}
