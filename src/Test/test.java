package Test;

abstract public class test {
    int total;
    int refund;
    void common(){
        System.out.println("This is common");
    }
    abstract void cancel();
    public static void main(String[] args) {
        Cab cab = new Cab();
        cab.total = 500;
        System.out.println("Request sent for your cancellation of bookings for the cab");
        cab.refund = cab.total-200;
        cab.cancel();
        System.out.println();

        Bus bus = new Bus();
        bus.total = 200;
        System.out.println("Request sent for your cancellation of bookings for the bus");
        bus.cancel();
        System.out.println();

        Train train = new Train();
        train.total = 1200;
        System.out.println("Request sent for your cancellation of bookings for the cab");
        train.refund = train.total-200;
        train.cancel();
    }
}
