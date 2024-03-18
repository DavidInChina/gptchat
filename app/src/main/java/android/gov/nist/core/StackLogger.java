package android.gov.nist.core;

import java.util.Properties;

/* loaded from: classes2.dex */
public interface StackLogger extends LogLevels {
    void disableLogging();

    void enableLogging();

    int getLineCount();

    String getLoggerName();

    boolean isLoggingEnabled();

    boolean isLoggingEnabled(int i10);

    void logDebug(String str);

    void logDebug(String str, Exception exc);

    void logError(String str);

    void logError(String str, Exception exc);

    void logException(Throwable th2);

    void logFatalError(String str);

    void logInfo(String str);

    void logStackTrace();

    void logStackTrace(int i10);

    void logTrace(String str);

    void logWarning(String str);

    void setBuildTimeStamp(String str);

    void setStackProperties(Properties properties);
}
