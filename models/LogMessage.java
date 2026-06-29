package models;

import enums.LogLevel;
import java.time.LocalDateTime;

public class LogMessage {
    
    private final LogLevel loglevel;
    private final String Message;
    private final LocalDateTime timestamp;

    public LogMessage(LogLevel level,String msg){
        this.loglevel=level;
        this.Message=msg;
        this.timestamp=LocalDateTime.now();
    }

    public LogLevel getLevel(){
        return loglevel;
    }

    public String getMessage(){
        return Message;
    }

    public LocalDateTime getTimestamp(){
        return timestamp;
    }

}
