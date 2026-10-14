/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreeExperiment;
/**
 *
 * @author ecat
 */
public class DoubleTypeTreeDemo {

    public static void main(String[] args) {
        Node<Double> root = new Node<Double>(1.0); 

        Node<Double> node1_1 = root.addChild(new Node<>(1.1));
        Node<Double> node1_2 = root.addChild(new Node<>(1.2));

        Node<Double> node1_11 = node1_1.addChild(new Node<>(1.11)); 
        Node<Double> node1_12 = node1_1.addChild(new Node<>(1.12)); 

        Node<Double> node1_121 = node1_12.addChild(new Node<>(1.121)); 
        Node<Double> node1_122 = node1_12.addChild(new Node<>(1.122)); 

        Node<Double> node1_21 = node1_2.addChild(new Node<>(1.21)); 
        Node<Double> node1_22 = node1_2.addChild(new Node<>(1.22)); 
        
        Node<Double> node1_211 = node1_21.addChild(new Node<>(1.211)); 
        
        Node<Double> node1_2111 = node1_211.addChild(new Node<>(1.2111));
        Node<Double> node1_2112 = node1_211.addChild(new Node<>(1.2112));
        
        root.printTree(root, "");
    }
}

