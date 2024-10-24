package codeflow;

public class Cinema {
    String[][] seats;


    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                this.seats[i][j] = "O";
            }
        }


        this.seats[0][0] = "X";
    }


    public int getRows() {
        return seats.length;
    }


    public int getSeats() {
        return seats[0].length;
    }


    public boolean reserve(int row, int seat) {
        if (seats[row][seat].equals("O")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }


    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) {
            seats[row][seat] = "O";
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        String result = ""; // Initialize as empty string
        for (int i = 0; i < seats.length; i++) {
            result += "|"; // Start each row with a pipe symbol
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|"; // Add each seat and enclose with pipes
            }
            result += "\n"; // Move to the next line after each row
        }
        return result;
    }
}
