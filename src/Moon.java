import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Moon {

    // java API fetch the current date and time
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1: " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();

        int seconds = currentTime.getSecond();

        System.out.println("Month: " + month + ", day: " + day + ", seconds: " + seconds);
    }

}
