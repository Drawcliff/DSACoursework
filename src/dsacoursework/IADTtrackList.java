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
public interface IADTtrackList {
    
    public void addSong();
   
    /*
    * display a  particular genre List on screen
    */
    public void displayGenre(String s);

    /*
    * display a List on screen
    */
    public void printList();

    /*
    * Add s to List
    */
    public void insert(Track s);


    /*
    * see if s is in the List, returns true or false
    */
    public boolean findTitle(String s);
     public boolean findArtist(String s);
}
