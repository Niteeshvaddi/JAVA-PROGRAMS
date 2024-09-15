import java.time.LocalDateTime;

public class CurrentDate {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Current date and time: " + ldt);
    }
}
