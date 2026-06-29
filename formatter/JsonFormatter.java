package formatter;

import models.LogMessage;

public class JsonFormatter implements LogFormatter {

    @Override
    public String format(LogMessage logMessage) {

        return "{"
                + "\"level\":\"" + logMessage.getLevel() + "\","
                + "\"timestamp\":\"" + logMessage.getTimestamp() + "\","
                + "\"message\":\"" + logMessage.getMessage() + "\""
                + "}";

    }
}