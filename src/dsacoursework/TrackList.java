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
public class TrackList implements IADTtrackList{
  Node head=null;
  private int size = 0;
 
    
    public class Node{
   
         Track data;
         Node next;
         
         Node(Track data){
           this.data=data;
         this.next=null;
         }
    
   
   }
    
 
    
      
      
   
    
    @Override
    public int length() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printList() {
       System.out.println("All the Tracks ");
       Node current=head;
       while(current!=null){
      // current.toString(); 
       System.out.println(current.data);
       current=current.next;
      
       }
       }
    
    public void question1() {
        
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
          size++;
            
        } 
}

    @Override
    public String remove(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  @Override
    public boolean findTitle(String s) {
   
        boolean find = false;
          Node current=head;
          if (head == null) {

        System.out.println("List is empty");
       
    }else{
       while(current!=null){
      
       if(current.data.getTrackTitle().equals(s)){
       current=null;
       find=true;
       System.out.println(s +" is in the List");
       }
       current=current.next;
       } 
        if (!find){
       System.out.println(s+" is not in the list");
       }
          }
// to get here we fell off the end of the list
// so can’t be in the list
return find;
    }
   
}
