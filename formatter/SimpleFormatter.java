package formatter;

import models.LogMessage;

public class SimpleFormatter implements LogFormatter{

    @Override
    public String format(LogMessage logMessage){

         return "[" +logMessage.getLevel() +"] "
                 +
                logMessage.getTimestamp() +
                " " +
                logMessage.getMessage();
    }

}