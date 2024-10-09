package test;

public class ParkingPayment {

    public static int calculatePayment(int hours, int minutes) {
        if (hours == 0 && minutes <= 15) {
            return 0;
        } else if (hours < 2 || (hours == 2 && minutes == 0)) {
            return 5;
        } else if (hours <= 5) {
            return 10;
        } else {
            return 10 + (hours - 5); // $1 for every additional full hour
        }
    }

    public static void main(String[] args) {
        System.out.println(calculatePayment(7, 30)); // Example test
    }
}
