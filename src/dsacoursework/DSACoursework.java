/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsacoursework;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DSACoursework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in); 
       
        System.out.println("Enter your Track ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your Track Title: ");
        String title = scanner.nextLine();
        System.out.println("Enter your Artist Name: ");
        String artist = scanner.nextLine();
        System.out.println("Enter your Track Length: ");
        String length = scanner.nextLine();
        System.out.println("Enter your Track composer: ");
        String composer = scanner.nextLine();
        System.out.println("Enter your Release Date: ");
        String releaseDate = scanner.nextLine();
        System.out.println("Enter your Album: ");
        String album = scanner.nextLine();
        System.out.println("Enter your Genre: ");
        String genre = scanner.nextLine();
        
        Track track2=new Track(id,title,artist,length,composer,releaseDate,album,genre);
        
        
        
    }
    
}
