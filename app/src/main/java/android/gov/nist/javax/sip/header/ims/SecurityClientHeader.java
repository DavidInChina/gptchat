package android.gov.nist.javax.sip.header.ims;

import java.util.Iterator;

/* loaded from: classes.dex */
public interface SecurityClientHeader extends SecurityServerHeader {
    public static final String NAME = "Security-Client";

    @Override // android.gov.nist.javax.sip.header.ims.SecurityServerHeader, android.gov.nist.javax.sip.header.ims.SecurityAgreeHeader, c.AbstractC2268x
    /* synthetic */ Object clone();

    @Override // android.gov.nist.javax.sip.header.ims.SecurityServerHeader, android.gov.nist.javax.sip.header.ims.SecurityAgreeHeader
    /* synthetic */ String getName();

    @Override // android.gov.nist.javax.sip.header.ims.SecurityServerHeader, android.gov.nist.javax.sip.header.ims.SecurityAgreeHeader, c.AbstractC2236H
    /* synthetic */ String getParameter(String str);

    @Override // android.gov.nist.javax.sip.header.ims.SecurityServerHeader, android.gov.nist.javax.sip.header.ims.SecurityAgreeHeader, c.AbstractC2236H
    /* synthetic */ Iterator getParameterNames();

    @Override // android.gov.nist.javax.sip.header.ims.SecurityServerHeader, android.gov.nist.javax.sip.header.ims.SecurityAgreeHeader, c.AbstractC2236H
    /* synthetic */ void removeParameter(String str);

    @Override // android.gov.nist.javax.sip.header.ims.SecurityServerHeader, android.gov.nist.javax.sip.header.ims.SecurityAgreeHeader, c.AbstractC2236H
    /* synthetic */ void setParameter(String str, String str2);
}
