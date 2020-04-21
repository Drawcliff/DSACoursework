/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsacoursework;

import static com.sun.javafx.util.Utils.stripQuotes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class BinaryTree implements Serializable {

    
    protected static class Node implements Serializable {
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
        @Override
        public String toString() {
            return data.toString();
        }
    }
    
    /*</listing>*/
    // Data Field
    /**
     * The root of the binary tree
     */
    protected Node root;
static final char DELIMITER=',';   
 protected boolean addReturn;
    public BinaryTree() {
        root = null;
    }


    protected BinaryTree(Node root) {
        this.root = root;
    }

   
    public BinaryTree(Track data, BinaryTree leftTree, BinaryTree rightTree) {
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

 public BinaryTree loadData(String filename) {
        
        BinaryTree repository = new BinaryTree();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) { 
            String[] temp;
            String line = br.readLine();
            
            while(line!=null){
                temp=line.split(Character.toString(DELIMITER));        
                int trackId = Integer.parseInt(temp[0]);
                String trackTitle = stripQuotes(temp[1]);
                 String artist= stripQuotes(temp[2]);
                 String trackLength= stripQuotes(temp[3]);
                 String composer= stripQuotes(temp[4]);
                 String releaseDate= stripQuotes(temp[5]);
                 String album= stripQuotes(temp[6]);
                 String genre= stripQuotes(temp[7]);
                 
                Track track = new Track(trackId, trackTitle , artist, trackLength, composer, releaseDate, album, genre);
                repository.add(track);                
                line = br.readLine();                
            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(BinaryTree.class.getName()).log(Level.SEVERE, null, ex);
        }
        //repository.traverse();
        return repository;
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
    
    
  
     
       public void traverse()
     {
         traverseInOrder(root);
     }
     public void traverseInOrder(Node node) {
    if (node != null) {
        traverseInOrder(node.left);
        System.out.print(" " + node.data);
        traverseInOrder(node.right);
    }
}
}
/*</listing>*/
