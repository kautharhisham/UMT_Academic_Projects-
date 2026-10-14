/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenericsExperiment;

/**
 *
 * @author ecat
 */
public class GenericClassDemo {

    public static void main(String[] args) {

        NonGenericClass nonGeneric = new NonGenericClass("Final", "Exam");
        nonGeneric.print();

        MyGenericClass <String, Integer> myGC = 
            new MyGenericClass <> ("Final Exam", 2019); 
        
        myGC.print();
    }
}
