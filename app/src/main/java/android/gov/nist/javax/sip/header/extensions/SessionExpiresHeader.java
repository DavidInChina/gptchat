package android.gov.nist.javax.sip.header.extensions;

import c.AbstractC2236H;
import c.AbstractC2266v;
import c.AbstractC2268x;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface SessionExpiresHeader extends AbstractC2236H, AbstractC2268x, AbstractC2266v {
    public static final String NAME = "Session-Expires";

    @Override // c.AbstractC2268x
    /* synthetic */ Object clone();

    int getExpires();

    /* synthetic */ String getName();

    @Override // c.AbstractC2236H
    /* synthetic */ String getParameter(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ Iterator getParameterNames();

    String getRefresher();

    /* synthetic */ String getValue();

    @Override // c.AbstractC2236H
    /* synthetic */ void removeParameter(String str);

    void setExpires(int i10);

    @Override // c.AbstractC2236H
    /* synthetic */ void setParameter(String str, String str2);

    void setRefresher(String str);

    /* synthetic */ void setValue(String str);
}
