package android.gov.nist.core;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;
import org.apache.log4j.Appender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/* loaded from: classes.dex */
public class CommonLoggerLog4j implements StackLogger {
    private Logger logger;

    public CommonLoggerLog4j(Logger logger) {
        this.logger = logger;
    }

    public static Level intToLevel(int i10) {
        if (i10 != 2) {
            if (i10 != 4) {
                if (i10 != 8) {
                    if (i10 != 16) {
                        if (i10 != 32) {
                            if (i10 != 64) {
                                return Level.OFF;
                            }
                            return Level.TRACE;
                        }
                        return Level.DEBUG;
                    }
                    return Level.INFO;
                }
                return Level.WARN;
            }
            return Level.ERROR;
        }
        return Level.FATAL;
    }

    public static int levelToInt(Level level) {
        if (level.equals(Level.INFO)) {
            return 16;
        }
        if (level.equals(Level.ERROR)) {
            return 4;
        }
        if (level.equals(Level.DEBUG)) {
            return 32;
        }
        if (level.equals(Level.WARN)) {
            return 8;
        }
        if (level.equals(Level.TRACE)) {
            return 64;
        }
        if (level.equals(Level.FATAL)) {
            return 2;
        }
        return 0;
    }

    private void setTraceLevel(int i10) {
    }

    public void addAppender(Appender appender) {
        this.logger.addAppender(appender);
    }

    @Override // android.gov.nist.core.StackLogger
    public void disableLogging() {
    }

    @Override // android.gov.nist.core.StackLogger
    public void enableLogging() {
    }

    @Override // android.gov.nist.core.StackLogger
    public int getLineCount() {
        return 0;
    }

    public Logger getLogger() {
        return this.logger;
    }

    @Override // android.gov.nist.core.StackLogger
    public String getLoggerName() {
        Logger logger = this.logger;
        if (logger != null) {
            return logger.getName();
        }
        return null;
    }

    public int getTraceLevel() {
        return levelToInt(this.logger.getLevel());
    }

    @Override // android.gov.nist.core.StackLogger
    public boolean isLoggingEnabled() {
        return this.logger.isInfoEnabled();
    }

    @Override // android.gov.nist.core.StackLogger
    public void logDebug(String str) {
        this.logger.debug(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logError(String str) {
        this.logger.error(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logException(Throwable th2) {
        this.logger.error("Error", th2);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logFatalError(String str) {
        this.logger.fatal(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logInfo(String str) {
        getLogger().info(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logStackTrace() {
        logStackTrace(32);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logTrace(String str) {
        this.logger.debug(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logWarning(String str) {
        getLogger().warn(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void setBuildTimeStamp(String str) {
        this.logger.info(R.a.r("Build timestamp: ", str));
    }

    @Override // android.gov.nist.core.StackLogger
    public void setStackProperties(Properties properties) {
    }

    @Override // android.gov.nist.core.StackLogger
    public boolean isLoggingEnabled(int i10) {
        return this.logger.isEnabledFor(intToLevel(i10));
    }

    @Override // android.gov.nist.core.StackLogger
    public void logDebug(String str, Exception exc) {
        this.logger.debug(str, exc);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logError(String str, Exception exc) {
        getLogger().error(str, exc);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logStackTrace(int i10) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        for (int i11 = 1; i11 < stackTrace.length; i11++) {
            printWriter.print("[" + stackTrace[i11].getFileName() + ":" + stackTrace[i11].getLineNumber() + "]");
        }
        printWriter.close();
        this.logger.debug(stringWriter.getBuffer().toString());
    }
}
