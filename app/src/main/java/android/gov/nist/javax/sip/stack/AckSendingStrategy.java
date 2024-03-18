package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.message.SIPRequest;
import b.AbstractC2092b;

/* loaded from: classes.dex */
public interface AckSendingStrategy {
    AbstractC2092b getLastHop();

    void send(SIPRequest sIPRequest);
}
