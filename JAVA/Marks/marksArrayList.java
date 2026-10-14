/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question4;

/**
 *
 * @author ecat
 */
import java.util.ArrayList;
import java.util.Scanner;

public class marksArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.println("Enter marks for 5 students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks.add(input.nextInt());
        }
        
        int sum = 0;
        int highest = marks.get(0);
        int lowest = marks.get(0);

        for (int mark : marks) {
            sum += mark;
            if (mark > highest) highest = mark;
            if (mark < lowest) lowest = mark;
        }

        double average = (double) sum / marks.size();
        
        System.out.println("\nAverage mark: " + average);
        System.out.println("Highest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);
        System.out.println("\nAll marks entered: " + marks);
    }
}
