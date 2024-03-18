package android.gov.nist.javax.sip.header.extensions;

import c.AbstractC2236H;
import c.AbstractC2268x;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface ReferencesHeader extends AbstractC2236H, AbstractC2268x {
    public static final String CHAIN = "chain";
    public static final String INQUIRY = "inquiry";
    public static final String NAME = "References";
    public static final String REFER = "refer";
    public static final String REL = "rel";
    public static final String SEQUEL = "sequel";
    public static final String SERVICE = "service";
    public static final String XFER = "xfer";

    @Override // c.AbstractC2268x
    /* synthetic */ Object clone();

    String getCallId();

    /* synthetic */ String getName();

    @Override // c.AbstractC2236H
    /* synthetic */ String getParameter(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ Iterator getParameterNames();

    String getRel();

    @Override // c.AbstractC2236H
    /* synthetic */ void removeParameter(String str);

    void setCallId(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ void setParameter(String str, String str2);

    void setRel(String str);
}
