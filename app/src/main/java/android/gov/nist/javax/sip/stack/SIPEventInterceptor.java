package android.gov.nist.javax.sip.stack;

import android.javax.sip.r;
import d.AbstractC2560a;

/* loaded from: classes2.dex */
public interface SIPEventInterceptor {
    void afterMessage(AbstractC2560a abstractC2560a);

    void beforeMessage(AbstractC2560a abstractC2560a);

    void destroy();

    void init(r rVar);
}
