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
    public boolean add(E data){
        root=addRecursive(root,data);
        return false;
    }
    private TreeNode<E> addRecursive(TreeNode<E> currentNode,E data){
        if(currentNode==null){
            return new TreeNode<>(data);
        }else if((Integer) data<(Integer) currentNode.getData()) {
            currentNode.setLeft(addRecursive(currentNode.getLeft(), data));
        }else if((Integer)data>(Integer)currentNode.getData()){
            currentNode.setRight(addRecursive(currentNode.getRight(), data));
        }
        return currentNode;
    }
    private void printLeft(TreeNode<E> node,int level) {
        if (node == null) {
            return;
        }
        if (maxLevel < level) {
            System.out.print(node.getData() + " ");
        }
        maxLevel = level;
        if (node.getLeft() == null) {
            numberLeftChild++;
            maxLevel++;
        }
        printLeft(node.getLeft(), level + 1);
        printLeft(node.getRight(), level + 1);
    }

    }