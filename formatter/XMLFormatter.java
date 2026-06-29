package formatter;

import models.LogMessage;

public class XMLFormatter implements LogFormatter {

    @Override
    public String format(LogMessage logMessage) {

        return "<log>"
                + "<level>" + logMessage.getLevel() + "</level>"
                + "<timestamp>" + logMessage.getTimestamp() + "</timestamp>"
                + "<message>" + logMessage.getMessage() + "</message>"
                + "</log>";

    }
}