import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(formater));
    }
}