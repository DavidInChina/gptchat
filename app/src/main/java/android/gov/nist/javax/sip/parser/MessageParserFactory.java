package android.gov.nist.javax.sip.parser;

import android.gov.nist.javax.sip.stack.SIPTransactionStack;

/* loaded from: classes2.dex */
public interface MessageParserFactory {
    MessageParser createMessageParser(SIPTransactionStack sIPTransactionStack);
}
