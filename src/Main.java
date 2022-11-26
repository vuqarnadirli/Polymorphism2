public class Main {
    public static void main(String[] args) {

        BMW b = new BMW();
        b.drive();

        Car c = b; //burada bmw-nin drive metodu carin drive metodunu ezir. Bmw drive olur netice.
        c.drive();

    }


}