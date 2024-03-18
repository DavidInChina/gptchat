package android.gov.nist.core;

import android.gov.nist.javax.sip.message.SIPMessage;
import android.javax.sip.r;
import java.util.Properties;

/* loaded from: classes2.dex */
public interface ServerLogger extends LogLevels {
    void closeLogFile();

    void logException(Exception exc);

    void logMessage(SIPMessage sIPMessage, String str, String str2, String str3, boolean z10);

    void logMessage(SIPMessage sIPMessage, String str, String str2, String str3, boolean z10, long j6);

    void logMessage(SIPMessage sIPMessage, String str, String str2, boolean z10, long j6);

    void setSipStack(r rVar);

    void setStackProperties(Properties properties);
}
