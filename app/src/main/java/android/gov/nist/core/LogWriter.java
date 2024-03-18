package android.gov.nist.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;
import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.apache.log4j.SimpleLayout;

/* loaded from: classes2.dex */
public class LogWriter implements StackLogger {
    private String buildTimeStamp;
    private Properties configurationProperties;
    private int lineCount;
    private Logger logger;
    private String stackName;
    private String logFileName = null;
    private volatile boolean needsLogging = false;
    protected int traceLevel = 0;

    private void countLines(String str) {
        for (char c10 : str.toCharArray()) {
            if (c10 == '\n') {
                this.lineCount++;
            }
        }
    }

    private String enhanceMessage(String str) {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        return className + Separators.DOT + methodName + Separators.LPAREN + fileName + ":" + lineNumber + ") [" + str + "]";
    }

    private void setTraceLevel(int i10) {
        this.traceLevel = i10;
    }

    public void addAppender(Appender appender) {
        this.logger.addAppender(appender);
    }

    @Override // android.gov.nist.core.StackLogger
    public void disableLogging() {
        this.needsLogging = false;
    }

    @Override // android.gov.nist.core.StackLogger
    public void enableLogging() {
        this.needsLogging = true;
    }

    public Level getLevel(int i10) {
        if (i10 == 16) {
            return Level.INFO;
        }
        if (i10 == 4) {
            return Level.ERROR;
        }
        if (i10 == 32) {
            return Level.DEBUG;
        }
        if (i10 == 64) {
            return Level.ALL;
        }
        return Level.OFF;
    }

    @Override // android.gov.nist.core.StackLogger
    public int getLineCount() {
        return this.lineCount;
    }

    public Priority getLogPriority() {
        int i10 = this.traceLevel;
        if (i10 == 16) {
            return Priority.INFO;
        }
        if (i10 == 4) {
            return Priority.ERROR;
        }
        if (i10 == 32) {
            return Priority.DEBUG;
        }
        if (i10 == 64) {
            return Priority.DEBUG;
        }
        return Priority.FATAL;
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
        return this.traceLevel;
    }

    @Override // android.gov.nist.core.StackLogger
    public boolean isLoggingEnabled() {
        return this.needsLogging;
    }

    @Override // android.gov.nist.core.StackLogger
    public void logDebug(String str) {
        if (this.needsLogging) {
            String enhanceMessage = enhanceMessage(str);
            if (this.lineCount == 0) {
                Logger logger = getLogger();
                logger.debug("BUILD TIMESTAMP = " + this.buildTimeStamp);
                Logger logger2 = getLogger();
                logger2.debug("Config Propeties = " + this.configurationProperties);
            }
            countLines(enhanceMessage);
            getLogger().debug(enhanceMessage);
        }
    }

    @Override // android.gov.nist.core.StackLogger
    public void logError(String str) {
        Logger logger = getLogger();
        String enhanceMessage = enhanceMessage(str);
        countLines(enhanceMessage);
        logger.error(enhanceMessage);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logException(Throwable th2) {
        if (this.needsLogging) {
            getLogger().error(th2.getMessage(), th2);
        }
    }

    @Override // android.gov.nist.core.StackLogger
    public void logFatalError(String str) {
        Logger logger = getLogger();
        String enhanceMessage = enhanceMessage(str);
        countLines(enhanceMessage);
        logger.fatal(enhanceMessage);
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
        if (this.needsLogging) {
            String enhanceMessage = enhanceMessage(str);
            if (this.lineCount == 0) {
                Logger logger = getLogger();
                logger.debug("BUILD TIMESTAMP = " + this.buildTimeStamp);
                Logger logger2 = getLogger();
                logger2.debug("Config Propeties = " + this.configurationProperties);
            }
            countLines(enhanceMessage);
            getLogger().trace(enhanceMessage);
        }
    }

    @Override // android.gov.nist.core.StackLogger
    public void logWarning(String str) {
        getLogger().warn(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void setBuildTimeStamp(String str) {
        this.buildTimeStamp = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008f A[Catch: NumberFormatException -> 0x0048, TryCatch #1 {NumberFormatException -> 0x0048, blocks: (B:7:0x0033, B:9:0x0041, B:13:0x004b, B:16:0x0054, B:19:0x005e, B:22:0x0068, B:24:0x0070, B:27:0x0079, B:29:0x007f, B:31:0x0086, B:33:0x008f, B:35:0x0099, B:37:0x00a3, B:39:0x00ad, B:40:0x00b6, B:42:0x00ba, B:44:0x00be, B:46:0x00cd, B:49:0x00dd, B:50:0x00e1, B:51:0x00f2, B:54:0x0101, B:56:0x0106), top: B:60:0x0033, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    @Override // android.gov.nist.core.StackLogger
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setStackProperties(Properties properties) {
        int i10;
        int i11;
        this.configurationProperties = properties;
        String property = properties.getProperty("android.gov.nist.javax.sip.TRACE_LEVEL");
        this.logFileName = properties.getProperty("android.gov.nist.javax.sip.DEBUG_LOG");
        String property2 = properties.getProperty("android.javax.sip.STACK_NAME");
        this.stackName = property2;
        this.logger = Logger.getLogger(properties.getProperty("android.gov.nist.javax.sip.LOG4J_LOGGER_NAME", property2));
        if (property != null) {
            if (property.equals("LOG4J")) {
                CommonLogger.useLegacyLogger = false;
                return;
            }
            try {
                if (property.equals("TRACE")) {
                    Debug.debug = true;
                    Debug.setStackLogger(this);
                } else if (!property.equals("DEBUG")) {
                    if (property.equals("INFO")) {
                        i10 = 16;
                    } else if (property.equals("ERROR")) {
                        i10 = 4;
                    } else {
                        if (!property.equals("NONE") && !property.equals("OFF")) {
                            i10 = Integer.parseInt(property);
                            if (i10 > 32) {
                                Debug.debug = true;
                                Debug.setStackLogger(this);
                            }
                        }
                        i10 = 0;
                    }
                    setTraceLevel(i10);
                    this.needsLogging = true;
                    i11 = this.traceLevel;
                    if (i11 != 32) {
                        this.logger.setLevel(Level.DEBUG);
                    } else if (i11 == 16) {
                        this.logger.setLevel(Level.INFO);
                    } else if (i11 == 4) {
                        this.logger.setLevel(Level.ERROR);
                    } else if (i11 == 0) {
                        this.logger.setLevel(Level.OFF);
                        this.needsLogging = false;
                    }
                    if (!this.needsLogging && this.logFileName != null) {
                        Appender appender = null;
                        try {
                            appender = new FileAppender(new SimpleLayout(), this.logFileName, !Boolean.valueOf(properties.getProperty("android.gov.nist.javax.sip.DEBUG_LOG_OVERWRITE")).booleanValue());
                        } catch (FileNotFoundException unused) {
                            File file = new File(this.logFileName);
                            file.getParentFile().mkdirs();
                            file.delete();
                            try {
                                appender = new FileAppender(new SimpleLayout(), this.logFileName);
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        if (appender != null) {
                            this.logger.addAppender(appender);
                            return;
                        }
                        return;
                    }
                    return;
                }
                i10 = 32;
                setTraceLevel(i10);
                this.needsLogging = true;
                i11 = this.traceLevel;
                if (i11 != 32) {
                }
                if (!this.needsLogging) {
                    return;
                }
                return;
            } catch (NumberFormatException e12) {
                e12.printStackTrace();
                PrintStream printStream = System.err;
                printStream.println("LogWriter: Bad integer ".concat(property));
                printStream.println("logging dislabled ");
                this.needsLogging = false;
                return;
            }
        }
        this.needsLogging = false;
    }

    @Override // android.gov.nist.core.StackLogger
    public boolean isLoggingEnabled(int i10) {
        return this.needsLogging && i10 <= this.traceLevel;
    }

    @Override // android.gov.nist.core.StackLogger
    public void logStackTrace(int i10) {
        if (this.needsLogging) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            for (int i11 = 1; i11 < stackTrace.length; i11++) {
                printWriter.print("[" + stackTrace[i11].getFileName() + ":" + stackTrace[i11].getLineNumber() + "]");
            }
            printWriter.close();
            String stringBuffer = stringWriter.getBuffer().toString();
            Level level = getLevel(i10);
            if (!level.isGreaterOrEqual(getLogPriority())) {
                return;
            }
            this.logger.log(level, stringBuffer);
        }
    }

    @Override // android.gov.nist.core.StackLogger
    public void logError(String str, Exception exc) {
        getLogger().error(str, exc);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logDebug(String str, Exception exc) {
        if (this.needsLogging) {
            String enhanceMessage = enhanceMessage(str);
            if (this.lineCount == 0) {
                Logger logger = getLogger();
                logger.debug("BUILD TIMESTAMP = " + this.buildTimeStamp);
                Logger logger2 = getLogger();
                logger2.debug("Config Propeties = " + this.configurationProperties);
            }
            countLines(enhanceMessage);
            getLogger().debug(enhanceMessage, exc);
        }
    }
}
