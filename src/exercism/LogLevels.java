package exercism;

public class LogLevels {

    public static String message(String logLine) {
	int start = logLine.indexOf(" ");
	return logLine.substring(start, logLine.length()).trim();
    }

    public static String logLevel(String logLine) {
	int end = logLine.indexOf("]");
	return logLine.substring(1, end).toLowerCase();
    }

    public static String reformat(String logLine) {
	return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
