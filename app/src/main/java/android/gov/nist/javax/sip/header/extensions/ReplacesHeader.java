package android.gov.nist.javax.sip.header.extensions;

import c.AbstractC2236H;
import c.AbstractC2268x;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface ReplacesHeader extends AbstractC2236H, AbstractC2268x {
    public static final String NAME = "Replaces";

    @Override // c.AbstractC2268x
    /* synthetic */ Object clone();

    String getCallId();

    String getFromTag();

    /* synthetic */ String getName();

    @Override // c.AbstractC2236H
    /* synthetic */ String getParameter(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ Iterator getParameterNames();

    String getToTag();

    @Override // c.AbstractC2236H
    /* synthetic */ void removeParameter(String str);

    void setCallId(String str);

    void setFromTag(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ void setParameter(String str, String str2);

    void setToTag(String str);
}
