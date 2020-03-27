/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {

    }

    public static MyQueue traversePreOrder(TreeNode<Integer> currentNode, MyQueue<Integer> myQueue) {
        if (currentNode != null) {
            myQueue.enqueue(currentNode.getData());
            System.out.print(currentNode.getData() + " ");
            traversePreOrder(currentNode.getLeft(), myQueue);
            traversePreOrder(currentNode.getRight(), myQueue);
        }
        return myQueue;
    }

    public static MyQueue getQueuePreOrderSuccessor(MyQueue myQueue) {
        myQueue.dequeue();
        return myQueue;
    }
}