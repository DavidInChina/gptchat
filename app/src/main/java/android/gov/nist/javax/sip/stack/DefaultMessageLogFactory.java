package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.LogRecord;
import android.gov.nist.javax.sip.LogRecordFactory;

/* loaded from: classes2.dex */
public class DefaultMessageLogFactory implements LogRecordFactory {
    public LogRecord createLogRecord(String str, String str2, String str3, String str4, boolean z10, String str5, String str6, String str7, long j6) {
        return new MessageLog(str, str2, str3, str4, z10, str5, str6, str7, j6);
    }

    @Override // android.gov.nist.javax.sip.LogRecordFactory
    public LogRecord createLogRecord(String str, String str2, String str3, long j6, boolean z10, String str4, String str5, String str6, long j10) {
        return new MessageLog(str, str2, str3, j6, z10, str4, str5, str6, j10);
    }
}
