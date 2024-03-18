package android.gov.nist.javax.sip.header;

import c.AbstractC2236H;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface ParametersExt extends AbstractC2236H {
    @Override // c.AbstractC2236H
    /* synthetic */ String getParameter(String str);

    String getParameter(String str, boolean z10);

    @Override // c.AbstractC2236H
    /* synthetic */ Iterator getParameterNames();

    @Override // c.AbstractC2236H
    /* synthetic */ void removeParameter(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ void setParameter(String str, String str2);

    void setQuotedParameter(String str, String str2);
}
