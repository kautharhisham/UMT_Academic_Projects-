import java.util.Scanner;

public class bus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] seats = new int[4][3]; 

        System.out.println("[[Bus Seat Booking System]]");
        System.out.println("Seat layout:\n0 = Empty, 1 = Booked");

        displaySeats(seats);

        System.out.print("How many seats would you like to book (1-3)? :");
        int numBookings = input.nextInt();

        if (numBookings < 1 || numBookings > 3) {
            System.out.println("Invalid number of seats. Please choose between 1 and 3.");
            input.close();
            return;
        }

        for (int booking = 1; booking <= numBookings; booking++) {
            System.out.print("\nEnter row number (1-4) for booking " + booking + ": ");
            int row = input.nextInt() - 1;
            System.out.print("Enter seat number (1-3) for booking " + booking + ": ");
            int col = input.nextInt() - 1;

            if (row < 0 || row >= 4 || col < 0 || col >= 3) {
                System.out.println("Invalid seat position. Try again.");
                booking--;
                continue;
            }

            if (seats[row][col] == 1) {
                System.out.println("Seat already booked! Choose another.");
                booking--;
            } else {
                seats[row][col] = 1;
                System.out.println("Seat successfully booked!");
                displaySeats(seats);
            }
        }

        input.close();
    }

    public static void displaySeats(int[][] seats) {
        System.out.println("\nCurrent Seat Layout:");
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}

