package android.gov.nist.javax.sip.header;

import b.AbstractC2091a;
import c.AbstractC2236H;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public interface AddressParameters extends AbstractC2236H {
    AbstractC2091a getAddress();

    @Override // c.AbstractC2236H
    /* synthetic */ String getParameter(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ Iterator getParameterNames();

    Map<String, Map.Entry<String, String>> getParameters();

    @Override // c.AbstractC2236H
    /* synthetic */ void removeParameter(String str);

    void setAddress(AbstractC2091a abstractC2091a);

    @Override // c.AbstractC2236H
    /* synthetic */ void setParameter(String str, String str2);
}
