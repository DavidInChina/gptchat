package android.gov.nist.javax.sip.header.ims;

import c.AbstractC2268x;

/* loaded from: classes2.dex */
public interface PMediaAuthorizationHeader extends AbstractC2268x {
    public static final String NAME = "P-Media-Authorization";

    @Override // c.AbstractC2268x
    /* synthetic */ Object clone();

    /* synthetic */ String getName();

    String getToken();

    void setMediaAuthorizationToken(String str);
}
