package android.gov.nist.javax.sip.header.ims;

import b.AbstractC2091a;
import b.AbstractC2096f;
import c.AbstractC2236H;
import c.AbstractC2268x;
import c.AbstractC2269y;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface PAssociatedURIHeader extends AbstractC2269y, AbstractC2236H, AbstractC2268x {
    public static final String NAME = "P-Associated-URI";

    @Override // c.AbstractC2268x
    /* synthetic */ Object clone();

    @Override // c.AbstractC2269y
    /* synthetic */ AbstractC2091a getAddress();

    AbstractC2096f getAssociatedURI();

    /* synthetic */ String getName();

    @Override // c.AbstractC2236H
    /* synthetic */ String getParameter(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ Iterator getParameterNames();

    @Override // c.AbstractC2236H
    /* synthetic */ void removeParameter(String str);

    /* synthetic */ void setAddress(AbstractC2091a abstractC2091a);

    void setAssociatedURI(AbstractC2096f abstractC2096f);

    @Override // c.AbstractC2236H
    /* synthetic */ void setParameter(String str, String str2);
}
