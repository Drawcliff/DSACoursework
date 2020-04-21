/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsacoursework;

/**
 *
 * @author Clifford
 */
public class DSACoursework {

    //menu to carry out all aspects of parts 1, 2 & 3 in the coursework
      public void run() {
          TrackList cc =new TrackList();
             
        cc.insert(new Track(2, "Haikyuu", "Haikyuu", "test first", "test first", "test first", "test first", "Horror"));    
        cc.insert(new Track(14, "Goosebumb", "Clifford", "test first", "test first", "test first", "test first", "Horror"));    
        cc.insert(new Track(66, "Percy Jackson", "Daniel", "test first", "test first", "test first", "test first", "Fantasy"));    
        cc.insert(new Track(98, "Harry Potter", "J k rowling", "test first", "test first", "test first", "test first", "Horror"));    
         cc.insert(new Track(99, "Harry Potter and prisoner of azkabam", "J k rowling", "test first", "test first", "test first", "test first", "Horror"));    
     
        TrackBST trackBst= new TrackBST();
         trackBst.loadData("Test.txt");
        boolean finished = false;
        do {
            
           InputHelper inputHelper = new InputHelper();
         
        System.out.println("\nA. Displayall songs in the list ");
        System.out.println("\tB. Add a song ");        
        System.out.println("\tC. Search for a specific song/track by Title");
        System.out.println("\tD. Search for a specific song/track by Artist");  
        System.out.println("\tE. List for songs by Genre");
        System.out.println("\tF. Display a list of all the song's in ascending Artist order from text file: ");
        System.out.println("\tG. Display a list of all the song's in descending Artist order from text file: ");
        System.out.println("\tH. Display a list of all the song’s that are available for use in the text file: ");
        System.out.println("\tI. Display a list of all the Artist names for all the song’s in the text file: ");
        System.out.println("\tQ. Quit\n");  
        char choice = inputHelper.readCharacter("Enter choice", "ABCDEFGHIQ");
      
            switch (choice) {
                case 'A': 
                   cc.printList();
                    break;
                case 'B':  
                  cc.addSong();
                    break;
                case 'C': 
                    String title = inputHelper.readString("Enter your Track Title:");    
                    cc.findTitle(title);
                    break;                    
                case 'D': 
                    String artist =  inputHelper.readString("Enter your Artist Name:");    
                    cc.findArtist(artist);
                    break;
                case 'E': 
                    String genre = inputHelper.readString("Enter your Genre to look for:");    
                    cc.displayGenre(genre);
                    break;
                case 'F': 
                    trackBst.displayArtist();
                    break;
                case 'G': 
                    trackBst.displayTrackDesc();
                    break;
                case 'H': 
                    trackBst.displayTrack();
                    break;
                case 'I': 
                    trackBst.displayArtistName();
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
        DSACoursework course = new DSACoursework();
        course.run();
        
    }
    
}
