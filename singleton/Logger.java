package singleton;

import java.util.List;

import models.LogMessage;
import formatter.LogFormatter;
import appender.LogAppender;
import enums.LogLevel;

public class Logger {
    
    private static volatile Logger instance;
    
    private final LogLevel loglevel;
    private final LogFormatter logformatter;
    private final List<LogAppender> appenders;

    private Logger(LogLevel loglevel,LogFormatter logformatter,List<LogAppender>appender){
        this.loglevel=loglevel;
        this.logformatter=logformatter;
        this.appenders=appender;
    }

    public static Logger getInstance(LogLevel loglevel,LogFormatter logformatter,List<LogAppender>appender){

        if(instance==null){
            synchronized(Logger.class){
                if(instance==null){
                   instance=new Logger(loglevel,logformatter,appender);
                }
            }
            
        }
        return instance;
    }
    public void debug(String message) {
       log(LogLevel.DEBUG, message);
    }

    public void info(String message) {
      log(LogLevel.INFO, message);
    }

     public void warn(String message) {
      log(LogLevel.WARN, message);
    }

    public void fatal(String message) {
      log(LogLevel.FATAL, message);
   }

    public void log(LogLevel level,String message){

        if(level.ordinal()<loglevel.ordinal()){
            return;
        }
        LogMessage logmessage=new LogMessage(level,message);

        String FormattedMessage=logformatter.format(logmessage);
        
        for(LogAppender appender : appenders){

               appender.append(FormattedMessage);

        }
    }



}
