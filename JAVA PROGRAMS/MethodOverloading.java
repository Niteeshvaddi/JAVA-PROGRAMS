class Bus {
    public void start() {
        System.out.println("Bus is going");
    }

    public void stop(int speed) { 
        System.out.println("speed = " + speed);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Bus b = new Bus();
        b.start();
        b.stop(50);
    }
}
