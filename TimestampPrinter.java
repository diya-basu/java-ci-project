import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimestampPrinter {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current Timestamp: " + now.format(formatter));
    }
}


