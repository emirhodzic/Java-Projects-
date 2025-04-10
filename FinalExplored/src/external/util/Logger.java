package external.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger{

    public static void logToConsole(CharSequence message){

        LocalDateTime dt = getDateAndTime();
        System.out.printf("%1$tD %1$tT : %2$s%n", dt, message);
        if (message instanceof StringBuilder sb){
            sb.setLength(0);
        }


    }

    private static LocalDateTime getDateAndTime(){
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        current.format(formatter);
        return current;
    }

}
