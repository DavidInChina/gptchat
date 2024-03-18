package android.gov.nist.core;

import java.io.PrintStream;

/* loaded from: classes2.dex */
public class InternalErrorHandler {
    public static void handleException(Exception exc) {
        PrintStream printStream = System.err;
        printStream.println("Unexpected internal error  " + exc.getMessage());
        exc.printStackTrace();
        throw new RuntimeException("Unexpected internal error  " + exc.getMessage(), exc);
    }

    public static void handleException(Exception exc, StackLogger stackLogger) {
        PrintStream printStream = System.err;
        printStream.println("Unexpected internal error  " + exc.getMessage());
        stackLogger.logError("UNEXPECTED INTERNAL ERROR " + exc.getMessage());
        exc.printStackTrace();
        stackLogger.logException(exc);
        throw new RuntimeException("Unexpected internal error !! " + exc.getMessage(), exc);
    }

    public static void handleException(String str) {
        new Exception().printStackTrace();
        PrintStream printStream = System.err;
        printStream.println("Unexepcted INTERNAL ERROR !!");
        printStream.println(str);
        throw new RuntimeException(str);
    }

    public static void handleException(String str, StackLogger stackLogger) {
        stackLogger.logStackTrace();
        stackLogger.logError("Unexepcted INTERNAL ERROR !!");
        stackLogger.logFatalError(str);
        throw new RuntimeException(str);
    }
}
