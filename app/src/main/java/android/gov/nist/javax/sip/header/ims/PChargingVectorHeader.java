package android.gov.nist.javax.sip.header.ims;

import c.AbstractC2236H;
import c.AbstractC2268x;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface PChargingVectorHeader extends AbstractC2268x, AbstractC2236H {
    public static final String NAME = "P-Charging-Vector";

    @Override // c.AbstractC2268x
    /* synthetic */ Object clone();

    String getICID();

    String getICIDGeneratedAt();

    /* synthetic */ String getName();

    String getOriginatingIOI();

    @Override // c.AbstractC2236H
    /* synthetic */ String getParameter(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ Iterator getParameterNames();

    String getTerminatingIOI();

    @Override // c.AbstractC2236H
    /* synthetic */ void removeParameter(String str);

    void setICID(String str);

    void setICIDGeneratedAt(String str);

    void setOriginatingIOI(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ void setParameter(String str, String str2);

    void setTerminatingIOI(String str);
}
