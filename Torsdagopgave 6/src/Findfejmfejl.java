package codeflow;

public class FindFemFejl {

    public static void main(String[] args) {
        Cinema biogrande = new Cinema(20, 10);


        System.out.println("Række 1, sæde 5 er reserveret: " + biogrande.reserve(0, 4));

        )
        System.out.println(biogrande);


        int numberOfRows = biogrande.getRows();
        int numberOfSeats = biogrande.getSeats();
        boolean lastSeatReserved = biogrande.reserve(numberOfRows - 1, numberOfSeats - 1);
        System.out.println("Sidste sæde i sidste række er reserveret: " + lastSeatReserved);


        System.out.println("Række 1, sæde 5 er afbestilt: " + biogrande.cancelReservation(0, 4));
    }
}