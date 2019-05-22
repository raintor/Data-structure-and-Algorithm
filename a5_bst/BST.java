package algorithm_and_data_structure.a5_bst;

import java.util.*;

/**
 * @author: raintor
 * @Date: 2019/3/11 19:33
 * @Description:
 */
public class BST<E extends Comparable<E>> {
    private class Node{
        public E e;
        public Node left,right;

        public Node(E e, Node left, Node right) {
            this.e = e;
            this.left = left;
            this.right = right;
        }

        public Node(E e){
            this(e,null,null);
        }

    }

    private Node root;
    private int size;

    public BST(){
        root=null;
        size=0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void add(E e){
        if(root==null){
            root=new Node(e);
            size++;
        }
        else
            add(root,e);

    }

    private void add(Node node, E e) {
        if(node.e.equals(e))
            return;
        else if(e.compareTo(node.e)<0&&node.left==null){
            node.left=new Node(e);
            size++;
            return;
        }
        else if(e.compareTo(node.e)>0&&node.right==null){
            node.right=new Node(e);
            size++;
            return;
        }
        if(e.compareTo(node.e)<0)
            add(node.left,e);
        if(e.compareTo(node.e)>0)
            add(node.right,e);
    }

    public void add2(E e){
        root = add2(root,e);
    }

    private Node add2(Node node, E e) {
        if(node==null){
            size++;
            return new Node(e);
        }
        if(e.compareTo(node.e)<0)
            node.left=add2(node.left,e);
        if(e.compareTo(node.e)>0)
            node.right=add2(node.right,e);
        return node;
    }

    public boolean contains(E e ){
        return contains(root,e);
    }

    private boolean contains(Node node, E e) {
        if(node==null)
            return false;
        if(e.equals(node.e))
            return true;
        else if(e.compareTo(node.e)<0)
            return contains(node.left,e);
        else
            return contains(node.right,e);
    }

    //遍历操作
    //前序遍历
    public void preorder(){
        preorder(root);
    }

    private void preorder(Node node) {
        if(node==null)
            return;
        System.out.println(node.e);
        preorder(node.left);
        preorder(node.right);
    }

    //中序遍历
    public void middleorder(){
        middleorder(root);
    }

    private void middleorder(Node node) {
        if(node ==null)
            return;
        middleorder(node.left);
        System.out.println(node.e);
        middleorder(node.right);

    }

    //后序遍历
    public void lastorder(){
        lastorder(root);
    }

    private void lastorder(Node node) {
        if(node==null)
            return;
        lastorder(node.left);
        lastorder(node.right);
        System.out.println(node.e);
    }

    //前序遍历的非递归写法
    public void preorderF(){
        if(root==null)
            return;
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            System.out.println(node.e);
            if(node.right!=null)
                stack.push(node.right);
            if(node.left!=null)
                stack.push(node.left);
        }
    }

    //层序遍历----------广度优先
    public void layerOrder(){
        if(root==null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node node = queue.remove();
            System.out.println(node.e);
            if(node.left!=null)
                queue.add(node.left);
            if(node.right!=null)
                queue.add(node.right);
        }
    }
    /**
     * 删除二叉树中最小最大的两个点
     * 首先实现查找到最小最大点的方法
     */
    public E findMinEle(){
        if(size==0)
            throw new RuntimeException("二叉树为空");
        Node node = fineMinNode(root);
        return node.e;
    }

    private Node fineMinNode(Node node) {
        if(node.left==null)
            return node;
        return fineMinNode(node.left);
    }

    public E findMaxEle(){
        if(size==0)
            throw new RuntimeException("二叉树为空");
        Node node = findMaxNode(root);
        return node.e;
    }

    private Node findMaxNode(Node node) {
        if(node.right==null)
            return node;
        return findMaxNode(node.right);
    }

    public E removeMin(){
        E mine = findMinEle();
        root = removeMin(root);
        return mine;
    }

    private Node removeMin(Node node) {
        if(node.left==null){
            Node rightnode = node.right;
            node.right=null;
            size--;
            return rightnode;
        }
        node.left=removeMin(node.left);
        return node;
    }

    public E removeMax(){
        E e = findMaxEle();
        root = removeMax(root);
        return e;
    }

    private Node removeMax(Node node) {
        if(node.right==null){
            Node minleft = node.left;
            node.left=null;
            size--;
            return minleft;
        }
        node.right=removeMax(node.right);
        return node;
    }

    /**
     * 删除任意元素
     *
     */
    public void remove(E e){
        root = remove(root,e);
    }

    private Node remove(Node node, E e) {
        if(node == null)
            return null;
        if(e.compareTo(node.e)<0){
            node.left=remove(node.left,e);
            return node;
        }else if(e.compareTo(node.e)>0){
            node.right=remove(node.right,e);
            return node;
        }else{
            if(node.left==null){
                Node rightnode = node.right;
                node.right=null;
                size--;
                return rightnode;
            }else if(node.right==null){
                Node leftnode = node.left;
                node.left=null;
                size--;
                return leftnode;
            }else{
                Node minrigtnode = fineMinNode(node.right);
                minrigtnode.right=removeMin(node.right);
                minrigtnode.left=node.left;
                node.left=null;
                node.right=null;
                return minrigtnode;

            }
        }
//        return node;
    }

}
