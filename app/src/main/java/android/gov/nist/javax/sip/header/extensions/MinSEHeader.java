package android.gov.nist.javax.sip.header.extensions;

import c.AbstractC2236H;
import c.AbstractC2268x;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface MinSEHeader extends AbstractC2236H, AbstractC2268x {
    public static final String NAME = "Min-SE";

    @Override // c.AbstractC2268x
    /* synthetic */ Object clone();

    /* synthetic */ String getName();

    @Override // c.AbstractC2236H
    /* synthetic */ String getParameter(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ Iterator getParameterNames();

    @Override // c.AbstractC2236H
    /* synthetic */ void removeParameter(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ void setParameter(String str, String str2);
}
