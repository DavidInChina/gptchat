package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Token;
import c.AbstractC2236H;
import c.AbstractC2268x;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface PVisitedNetworkIDHeader extends AbstractC2236H, AbstractC2268x {
    public static final String NAME = "P-Visited-Network-ID";

    @Override // c.AbstractC2268x
    /* synthetic */ Object clone();

    /* synthetic */ String getName();

    @Override // c.AbstractC2236H
    /* synthetic */ String getParameter(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ Iterator getParameterNames();

    String getVisitedNetworkID();

    @Override // c.AbstractC2236H
    /* synthetic */ void removeParameter(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ void setParameter(String str, String str2);

    void setVisitedNetworkID(Token token);

    void setVisitedNetworkID(String str);
}