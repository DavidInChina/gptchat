package android.gov.nist.javax.sip.stack;

import R.a;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.LogRecord;

/* loaded from: classes2.dex */
class MessageLog implements LogRecord {
    private String callId;
    private String destination;
    private String firstLine;
    private boolean isSender;
    private String message;
    private String source;
    private String tid;
    private long timeStamp;
    private long timeStampHeaderValue;

    public MessageLog(String str, String str2, String str3, String str4, boolean z10, String str5, String str6, String str7, long j6) {
        if (str != null && !str.equals("")) {
            this.message = str;
            this.source = str2;
            this.destination = str3;
            try {
                long parseLong = Long.parseLong(str4);
                if (parseLong >= 0) {
                    this.timeStamp = parseLong;
                    this.isSender = z10;
                    this.firstLine = str5;
                    this.tid = str6;
                    this.callId = str7;
                    this.timeStampHeaderValue = j6;
                    return;
                }
                throw new IllegalArgumentException("Bad time stamp ");
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(a.r("Bad number format ", str4));
            }
        }
        throw new IllegalArgumentException("null msg");
    }

    @Override // android.gov.nist.javax.sip.LogRecord
    public boolean equals(Object obj) {
        if (!(obj instanceof MessageLog)) {
            return false;
        }
        MessageLog messageLog = (MessageLog) obj;
        if (!messageLog.message.equals(this.message) || messageLog.timeStamp != this.timeStamp) {
            return false;
        }
        return true;
    }

    @Override // android.gov.nist.javax.sip.LogRecord
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("<message\nfrom=\"");
        sb2.append(this.source);
        sb2.append("\" \nto=\"");
        sb2.append(this.destination);
        sb2.append("\" \ntime=\"");
        sb2.append(this.timeStamp);
        sb2.append(Separators.DOUBLE_QUOTE);
        if (this.timeStampHeaderValue != 0) {
            str = android.gov.nist.core.a.m(new StringBuilder("\ntimeStamp = \""), this.timeStampHeaderValue, Separators.DOUBLE_QUOTE);
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("\nisSender=\"");
        sb2.append(this.isSender);
        sb2.append("\" \ntransactionId=\"");
        sb2.append(this.tid);
        sb2.append("\" \ncallId=\"");
        sb2.append(this.callId);
        sb2.append("\" \nfirstLine=\"");
        sb2.append(this.firstLine.trim());
        sb2.append("\" \n>\n");
        StringBuilder p10 = android.gov.nist.core.a.p(android.gov.nist.core.a.g(sb2.toString(), "<![CDATA["));
        p10.append(this.message);
        return android.gov.nist.core.a.g(android.gov.nist.core.a.g(p10.toString(), "]]>\n"), "</message>\n");
    }

    public MessageLog(String str, String str2, String str3, long j6, boolean z10, String str4, String str5, String str6, long j10) {
        if (str != null && !str.equals("")) {
            this.message = str;
            this.source = str2;
            this.destination = str3;
            if (j6 >= 0) {
                this.timeStamp = j6;
                this.isSender = z10;
                this.firstLine = str4;
                this.tid = str5;
                this.callId = str6;
                this.timeStampHeaderValue = j10;
                return;
            }
            throw new IllegalArgumentException("negative ts");
        }
        throw new IllegalArgumentException("null msg");
    }
}
