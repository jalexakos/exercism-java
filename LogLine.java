// from https://exercism.org/tracks/java/exercises/logs-logs-logs

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLine {
    private String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        // Use regex to extract the log level from the log line string
        String regex = "\\[(.*?)]:";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(logLine);

        if (matcher.find()) {
            String level = matcher.group(1); // Extracts "INF", "ERR", etc.
            return parseLogLevel(level);
        }
        
        throw new IllegalArgumentException("Invalid log line format.");
    }

    private LogLevel parseLogLevel(String level) {
        switch (level) {
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        String[] splitLog = this.logLine.split(": ");
        String message = splitLog[1];
        LogLevel logLevel = this.getLogLevel();
    
        switch (logLevel) {
            case LogLevel.TRACE:
                return "1:" + message;
            case LogLevel.DEBUG:
                return "2:" + message;
            case LogLevel.INFO:
                return "4:" + message;
            case LogLevel.WARNING:
                return "5:" + message;
            case LogLevel.ERROR:
                return "6:" + message;
            case LogLevel.FATAL:
                return "42:" + message;
            default:
                return "0:" + message;
        }    
    }
}

// Learning enums in Java.
// I really struggled with this concept. I get what enums are, but Java's use of them
// is different than JavaScript. I had to look up how to use them in Java. I also had to
// get help getting the regex working. I should probably dig into both regex and enums more.