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

      public void run() {
          TrackList cc =new TrackList();
             
        cc.insert(new Track(2, "Haikyuu", "Haikyuu", "test first", "test first", "test first", "test first", "Horror"));    
        cc.insert(new Track(14, "Goosebumb", "Clifford", "test first", "test first", "test first", "test first", "Horror"));    
        cc.insert(new Track(66, "Percy Jackson", "Daniel", "test first", "test first", "test first", "test first", "Fantasy"));    
        cc.insert(new Track(98, "Harry Potter", "J k rowling", "test first", "test first", "test first", "test first", "Horror"));    
         cc.insert(new Track(99, "Harry Potter and prisoner of azkabam", "J k rowling", "test first", "test first", "test first", "test first", "Horror"));    
     
        TrackBST trackBst= new TrackBST();
         Scanner scanner = new Scanner(System.in); 
        boolean finished = false;
        do {
            
           InputHelper inputHelper = new InputHelper();
         
        System.out.println("\nA. Displayall songs in the list ");
        System.out.println("\tB. Add a song ");        
        System.out.println("\tC. Search for a specific song/track by Title");
        System.out.println("\tD. Search for a specific song/track by Artist");  
        System.out.println("\tE. List for songs by Genre");  
        System.out.println("\tQ. Quit\n");  
        char choice = inputHelper.readCharacter("Enter choice", "ABCDEQ");
      
            switch (choice) {
                case 'A': 
                   cc.printList();
                    break;
                case 'B':  
                  cc.addSong();
                    break;
                case 'C': 
                   System.out.println("Enter your Track Title: ");
                    String title = scanner.nextLine();
                    cc.findTitle(title);
                    break;                    
                case 'D': 
                   System.out.println("Enter your Artist Name: ");
                    String artist = scanner.nextLine();
                    cc.findArtist(artist);
                    break;
                case 'E': 
                   System.out.println("Enter your Genre to look for: ");
                    String genre = scanner.nextLine();
                    cc.displayGenre(genre);
                    break;
                case 'Q': 
                    finished = true;
            }
        } while (!finished);
    }

        
        
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in); 
    
          
        
        DSACoursework course = new DSACoursework();
        course.run();
        //TrackBST Node =new TrackBST();
       // Node.loadData("Test.txt");
        //Node.add(new Track(2, "Haikyuu", "Haikyuu", "test first", "test first", "test first", "test first", "Horror"));
        //Node.add(new Track(98, "Harry Potter", "J k rowling", "test first", "test first", "test first", "test first", "Horror"));
        //Node.add(new Track(50, "Harry Potter", "J k rowling", "test first", "test first", "test first", "test first", "Horror"));
       // Node.displayArtist();
     //  Node.displayTrack();
    //   Node.displayTrackDesc();
      // Node.displayArtistName();
        
    }
    
}
