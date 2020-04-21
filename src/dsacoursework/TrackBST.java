/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsacoursework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author user
 */
public class TrackBST  {
    
     protected static class Node {
        // Data Fields

        /**
         * The information stored in this node.
         */
        public Track data;
        /**
         * Reference to the left child.
         */
        public Node left;
        /**
         * Reference to the right child.
         */
        public Node right;

        public Node(Track data) {
            this.data = data;
            left = null;
            right = null;
        }

        // Methods
        /**
         * Returns a string representation of the node.
         *
         * @return A string representation of the data fields
         */
    
    }
    
    /*</listing>*/
    // Data Field
    /**
     * The root of the binary tree
     */
    protected Node root;
static final char DELIMITER=',';   
 protected boolean addReturn;
    public TrackBST() {
        root = null;
    }


    protected TrackBST(Node root) {
        this.root = root;
    }

   
    public TrackBST(Track data, TrackBST leftTree, TrackBST rightTree) {
        root = new Node(data);
        if (leftTree != null) {
            root.left = leftTree.root;
        } else {
            root.left = null;
        }
        if (rightTree != null) {
            root.right = rightTree.root;
        } else {
            root.right = null;
        }
    }
TrackBST repository;
TrackBST repository2;
TrackBST repository3;
 public TrackBST loadData(String filename) {
        
         repository = new TrackBST();
           repository2 = new TrackBST();
           repository3 = new TrackBST();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) { 
            String[] temp;
            String line = br.readLine();
            
            while(line!=null){
                temp=line.split(Character.toString(DELIMITER));        
                int trackId = Integer.parseInt(temp[0]);
                String trackTitle = temp[1].replace("\"", "");
                 String artist= temp[2].replace("\"", "");
                 String trackLength= temp[3].replace("\"", "");
                 String composer= temp[4].replace("\"", "");
                 String releaseDate= temp[5].replace("\"", "");
                 String album=temp[6].replace("\"", "");
                 String genre= temp[7].replace("\"", "");
                 
                Track track = new Track(trackId, trackTitle , artist, trackLength, composer, releaseDate, album, genre);
                repository.add2(track);            
                repository2.add(track);  
                repository3.add3(track);
                line = br.readLine();                
            }
            br.close();
        } catch (IOException ex) {
           System.out.println("file not found");
        }
        //repository.traverse();
        return repository;
 }
 
 public void displayArtist(){
  System.out.format("\033[31m%s\033[0m%n", "ALL THE ARTIST IN ORDER");
  System.out.format("\033[31m%s\033[0m%n", "==========");
 repository.traverse();
 
 }
 
  public void displayTrack(){
        System.out.format("\033[31m%s\033[0m%n", "ALL THE TRACKS IN ORDER");
  System.out.format("\033[31m%s\033[0m%n", "==========");
 repository2.traverse();
 
 }
  
   public void displayTrackDesc(){
   System.out.format("\033[31m%s\033[0m%n", "ALL THE ARTIST IN DESCENDING ORDER");
  System.out.format("\033[31m%s\033[0m%n", "==========");    
 repository3.traverse();
 
 }
   
   public void displayArtistName(){
   System.out.format("\033[31m%s\033[0m%n", "ALL THE ARTIST NAME IN THE TRACKLIST");
  System.out.format("\033[31m%s\033[0m%n", "==========");    
 repository.showArtist();
 
 }
  
    public Track getData() {
        if (root != null) {
            return root.data;
        } else {
            return null;
        }
    }

public boolean add(Track item) {
        root = add(root, item);
        return addReturn;
    }

    /**
     * Recursive add method.
     * @post The data field addReturn is set true if the item is added to
     *       the tree, false if the item is already in the tree.
     * @param localRoot The local root of the subtree
     * @param item The object to be inserted
     * @return The new local root that now contains the
     *         inserted item
     */
    private Node add(Node localRoot, Track item) {
        if (localRoot == null) {
            // item is not in the tree � insert it.
            addReturn = true;
            return new Node(item);
        } else if (item.compareTo(localRoot.data) == 0) {
            // item is equal to localRoot.data
            addReturn = false;
            return localRoot;
        } else if (item.compareTo(localRoot.data) < 0) {
            // item is less than localRoot.data
            localRoot.left = add(localRoot.left, item);
            return localRoot;
        } else {
            // item is greater than localRoot.data
            localRoot.right = add(localRoot.right, item);
            return localRoot;
        }
    }
    
    public boolean add2(Track item) {
        root = add2(root, item);
        return addReturn;
    }

    /**
     * Recursive add method.
     * @post The data field addReturn is set true if the item is added to
     *       the tree, false if the item is already in the tree.
     * @param localRoot The local root of the subtree
     * @param item The object to be inserted
     * @return The new local root that now contains the
     *         inserted item
     */
    private Node add2(Node localRoot, Track item) {
        if (localRoot == null) {
            // item is not in the tree � insert it.
            addReturn = true;
            return new Node(item);
        } else if (item.compareArtist(localRoot.data) == 0) {
            // item is equal to localRoot.data
            addReturn = false;
            return localRoot;
        } else if (item.compareArtist(localRoot.data) < 0) {
            // item is less than localRoot.data
            localRoot.left = add2(localRoot.left, item);
            return localRoot;
        } else {
            // item is greater than localRoot.data
            localRoot.right = add2(localRoot.right, item);
            return localRoot;
        }
    }
    
    public boolean add3(Track item) {
        root = add3(root, item);
        return addReturn;
    }

    /**
     * Recursive add method.
     * @post The data field addReturn is set true if the item is added to
     *       the tree, false if the item is already in the tree.
     * @param localRoot The local root of the subtree
     * @param item The object to be inserted
     * @return The new local root that now contains the
     *         inserted item
     */
    private Node add3(Node localRoot, Track item) {
        if (localRoot == null) {
            // item is not in the tree � insert it.
            addReturn = true;
            return new Node(item);
        } else if (item.compareArtistDesc(localRoot.data) == 0) {
            // item is equal to localRoot.data
            addReturn = false;
            return localRoot;
        } else if (item.compareArtistDesc(localRoot.data) < 0) {
            // item is less than localRoot.data
            localRoot.left = add3(localRoot.left, item);
            return localRoot;
        } else {
            // item is greater than localRoot.data
            localRoot.right = add3(localRoot.right, item);
            return localRoot;
        }
    }
    
    
       public void traverse()
     {
         traverseInOrder(root);
     }
     public void traverseInOrder(Node node) {
    if (node != null) {
        traverseInOrder(node.left);
        System.out.println(" " + node.data);
        traverseInOrder(node.right);
    }
}

            public void showArtist()
     {
         showArtist(root);
     }
     public void showArtist(Node node) {
    if (node != null) {
        showArtist(node.left);
        System.out.println(" " + node.data.getArtist());
        showArtist(node.right);
    }
}
     
}
