/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreeExperiment;

/**
 *
 * @author ecat
 */
import java.util.ArrayList;
import java.util.List;

public class Node<T> {

    private T data = null; 
    
    private List<Node<T>> children = new ArrayList<>(); 

    private Node<T> parent = null; 
    
    public Node(T data) { 
        this.data = data; 
    }

    public Node<T> addChild(Node<T> child) { 
        child.setParent(this); 
        this.children.add(child); 
        return child;
    }

    public void addChildren(List<Node<T>> children) {
        children.forEach(each -> each.setParent(this)); 
        this.children.addAll(children);
    }

    public List<Node<T>> getChildren() { 
        return children;
    }

    public T getData() { 
        return data; 
    }

    public void setData(T data) {
        this.data = data;
    }

    private void setParent(Node<T> parent) { 
        this.parent = parent;
    }

    public Node<T> getParent() {
        return parent; 
    }

    public void printTree(Node<T> node, String prefix) {
        System.out.println(prefix + node.getData());
        for (Node<T> child : node.getChildren()) {
            child.printTree(child, prefix + "  "); 
        }
    }
}