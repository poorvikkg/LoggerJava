package appender;


public class DatabaseAppender implements LogAppender {
    
    @Override
    public void append(String FormattedMessage){
        System.out.println("Appended to db");
    }
}
