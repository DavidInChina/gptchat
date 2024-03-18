package android.gov.nist.javax.sip.parser;

import android.gov.nist.javax.sip.message.SIPMessage;

/* loaded from: classes2.dex */
public interface MessageParser {
    SIPMessage parseSIPMessage(byte[] bArr, boolean z10, boolean z11, ParseExceptionListener parseExceptionListener);
}
