package appender;


public class ConsoleAppender implements LogAppender {
    
    @Override
    public void append(String FormattedMessage){
        System.out.println(FormattedMessage);
    }
}
