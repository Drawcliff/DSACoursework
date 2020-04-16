/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsacoursework;

/**
 *
 * @author user
 */
public interface IADTtrackList {
  /*
    * returns the number of elements in the List
    */
    public int length();

   /*
    * create an empty List
    */
    public void createList();

    /*
    * display a List on screen
    */
    public void printList();

    /*
    * Add s to List
    */
    public void insert(Track s);

    /*
    * remove s from List, returning s or null
    */
    public String remove(String s);

    /*
    * see if s is in the List, returns true or false
    */
    public boolean findTitle(String s);
}
