package design_tools;

public class Log {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    private static final String TAG = " New";

    //info
    public static void i(String className, String message) {
        System.out.println(ANSI_GREEN + className + " : " + message + ANSI_RESET);
    }

    //error
    public static void e(String className, String message) {
        System.out.println(ANSI_RED + className + " : " + message + ANSI_RESET);
    }

    //debug
    public static void d(String className, String message) {
        System.out.println(ANSI_BLUE + className + " : " + message + ANSI_RESET);
    }

    //warning
    public static void w(String className, String message) {
        System.out.println(ANSI_YELLOW + className + " : " + message + ANSI_RESET);
    }

    public static void main(String[] args) {

        Log.i(TAG,"This is an info message");

        Log.e(TAG,"This is an error message");

        Log.w(TAG,"This is a warning message");

        Log.d(TAG,"This is a debug message");
    }
}