/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
import problem1.node.TreeNode;
// to implement BinarySearchTree
public class MyBinarySearchTree<E> {
    private TreeNode<E> root;
    public int numberLeftChild = 0;
    private int maxLevel = 1;

    public TreeNode<E> getRoot() {
        return root;
    }
}