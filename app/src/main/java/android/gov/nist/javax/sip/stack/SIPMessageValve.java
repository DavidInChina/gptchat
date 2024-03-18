package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.message.SIPRequest;
import android.javax.sip.r;
import d.AbstractC2562c;

/* loaded from: classes.dex */
public interface SIPMessageValve {
    void destroy();

    void init(r rVar);

    boolean processRequest(SIPRequest sIPRequest, MessageChannel messageChannel);

    boolean processResponse(AbstractC2562c abstractC2562c, MessageChannel messageChannel);
}
