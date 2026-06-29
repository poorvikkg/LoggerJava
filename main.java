
import appender.ConsoleAppender;
import appender.DatabaseAppender;
import appender.FileAppender;
import appender.LogAppender;
import enums.LogLevel;
import formatter.LogFormatter;
import formatter.SimpleFormatter;
import singleton.Logger;

import java.util.ArrayList;
import java.util.List;


public class Main{
    
    public static void main(String[] args){

        LogFormatter formatter= new SimpleFormatter();
        
        List<LogAppender> appenders = new ArrayList<>();
        appenders.add(new ConsoleAppender());
        appenders.add(new FileAppender("logs.txt"));

           Logger logger = Logger.getInstance(
            LogLevel.INFO,
                formatter,
                appenders
            );

            logger.info("information started");
            logger.debug("debuged");
            logger.fatal("fatal error");

    }
}