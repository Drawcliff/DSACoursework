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
public class TrackList implements IADTtrackList{
  Node head=null;
   
    
    public class Node{
   
         Track data;
         Node next;
         
         Node(Track data){
           this.data=data;
         this.next=null;
         }
    
   
   }
    @Override
    public void displayGenre(String s) {
         Node current=head;
         boolean find=false;
            System.out.format("\033[31m%s\033[0m%n", "GENRE: "+s);
           System.out.format("\033[31m%s\033[0m%n", "==========");
       while(current!=null){
       if(current.data.getGenre().equals(s)){
       System.out.println(current.data);
       find=true;
       }
       current=current.next;
      
       }
       if(find=false){
            System.out.println(s+" Genre is not in the list");
         System.out.format("\033[31m%s\033[0m%n", "==========");
       }
    }

       
              public void addSong(){
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
        TrackList cc =new TrackList();
        cc.insert(track2);
       }
              
    @Override
    public void printList() {
       System.out.format("\033[31m%s\033[0m%n", "ALL THE TRACKS");
         System.out.format("\033[31m%s\033[0m%n", "==========");
       Node current=head;
       while(current!=null){
      // current.toString(); 
       System.out.println(current.data);
       current=current.next;
      
       }
       }
    
    

    @Override
    public void insert(Track s) {
        Node  newData = new Node(s);
         if (head == null) {

        head=newData;
       
    }
        else {
          newData.next=head;
          head=newData;
            
        } 
}


  @Override
    public boolean findTitle(String s) {
        boolean find = false;
          Node current=head;
          if (head == null) {

        System.out.println("List is empty");
         System.out.format("\033[31m%s\033[0m%n", "==========");
    }else{
       while(current!=null){
      
       if(current.data.getTrackTitle().equals(s)){
     
       find=true;
       System.out.println(s +" is in the List");
         System.out.format("\033[31m%s\033[0m%n", "==========");
       break;
       }
       current=current.next;
       } 
        if (!find){
       System.out.println(s+" is not in the list");
         System.out.format("\033[31m%s\033[0m%n", "==========");
       }
          }
return find;
    }
    
    
  @Override
        public boolean findArtist(String s) {
        boolean find = false;
          Node current=head;
          if (head == null) {

        System.out.println("List is empty");
         System.out.format("\033[31m%s\033[0m%n", "==========");
    }else{
       while(current!=null){
      
       if(current.data.getArtist().equals(s)){
       find=true;
       System.out.println(s +" is in the List");
         System.out.format("\033[31m%s\033[0m%n", "==========");
          break;
       }
       current=current.next;
       } 
        if (!find){
       System.out.println(s+" is not in the list");
         System.out.format("\033[31m%s\033[0m%n", "==========");
       }
          }

return find;
    }
   
}
