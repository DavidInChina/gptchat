package android.gov.nist.javax.sip.header.ims;

import b.AbstractC2091a;
import c.AbstractC2236H;
import c.AbstractC2268x;
import c.AbstractC2269y;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface ServiceRouteHeader extends AbstractC2269y, AbstractC2236H, AbstractC2268x {
    public static final String NAME = "Service-Route";

    @Override // c.AbstractC2268x
    /* synthetic */ Object clone();

    @Override // c.AbstractC2269y
    /* synthetic */ AbstractC2091a getAddress();

    /* synthetic */ String getName();

    @Override // c.AbstractC2236H
    /* synthetic */ String getParameter(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ Iterator getParameterNames();

    @Override // c.AbstractC2236H
    /* synthetic */ void removeParameter(String str);

    /* synthetic */ void setAddress(AbstractC2091a abstractC2091a);

    @Override // c.AbstractC2236H
    /* synthetic */ void setParameter(String str, String str2);
}
