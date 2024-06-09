package gr.aueb.cf.ch14.mathTask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final Logger Instance = new Logger();

    private Logger() {}

    public static Logger getInstance(){
        return Instance;
    }

    public void logMessage(String message){
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.err.println(timestamp + message);
    }

}
