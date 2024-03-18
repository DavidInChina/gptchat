package android.gov.nist.javax.sip.clientauthutils;

import android.javax.sip.a;
import android.javax.sip.q;
import d.AbstractC2561b;
import d.AbstractC2562c;

/* loaded from: classes2.dex */
public interface AuthenticationHelper {
    a handleChallenge(AbstractC2562c abstractC2562c, a aVar, q qVar, int i10);

    a handleChallenge(AbstractC2562c abstractC2562c, a aVar, q qVar, int i10, boolean z10);

    void removeCachedAuthenticationHeaders(String str);

    void setAuthenticationHeaders(AbstractC2561b abstractC2561b);
}
