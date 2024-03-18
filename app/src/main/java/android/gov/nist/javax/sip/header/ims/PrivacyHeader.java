package android.gov.nist.javax.sip.header.ims;

import c.AbstractC2268x;

/* loaded from: classes2.dex */
public interface PrivacyHeader extends AbstractC2268x {
    public static final String NAME = "Privacy";

    @Override // c.AbstractC2268x
    /* synthetic */ Object clone();

    /* synthetic */ String getName();

    String getPrivacy();

    void setPrivacy(String str);
}
