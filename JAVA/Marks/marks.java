/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question4;

/**
 *
 * @author ecat
 */
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks = new int[5];

        System.out.println("Enter marks for 5 students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        int sum = 0, highest = marks[0], lowest = marks[0];
        for (int mark : marks) {
            sum += mark;
            if (mark > highest) highest = mark;
            if (mark < lowest) lowest = mark;
        }

        double average = (double) sum / marks.length;

        System.out.println("\nAverage mark: " + average);
        System.out.println("Highest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);

        System.out.println("\nAll marks entered:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        input.close();
    }
}

