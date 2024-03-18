package android.gov.nist.javax.sip.header.ims;

import c.AbstractC2268x;

/* loaded from: classes2.dex */
public interface PAssertedServiceHeader extends AbstractC2268x {
    public static final String NAME = "P-Asserted-Service";

    @Override // c.AbstractC2268x
    /* synthetic */ Object clone();

    String getApplicationIdentifiers();

    /* synthetic */ String getName();

    String getSubserviceIdentifiers();

    void setApplicationIdentifiers(String str);

    void setSubserviceIdentifiers(String str);
}
