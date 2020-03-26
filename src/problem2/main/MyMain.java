/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
import problem1.node.TreeNode;
import problem1.mybst.MyBinarySearchTree;
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> myBinarySearchTree=new MyBinarySearchTree<>();
        myBinarySearchTree.add(1);
        myBinarySearchTree.add(2);
        myBinarySearchTree.add(3);
        myBinarySearchTree.add(4);
        myBinarySearchTree.add(5);

    }
    public static void traversePreOrder(TreeNode<Integer> currentNode) {
        if (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            traversePreOrder(currentNode.getLeft());
            traversePreOrder(currentNode.getRight());
        }
    }
    public static void traversePostOrder(TreeNode<Integer> currentNode) {

    }


}

