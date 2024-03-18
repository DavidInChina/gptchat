package android.gov.nist.javax.sip.header.ims;

import c.AbstractC2236H;
import c.AbstractC2268x;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public interface PChargingFunctionAddressesHeader extends AbstractC2236H, AbstractC2268x {
    public static final String NAME = "P-Charging-Function-Addresses";

    void addChargingCollectionFunctionAddress(String str);

    void addEventChargingFunctionAddress(String str);

    @Override // c.AbstractC2268x
    /* synthetic */ Object clone();

    ListIterator getChargingCollectionFunctionAddresses();

    ListIterator getEventChargingFunctionAddresses();

    /* synthetic */ String getName();

    @Override // c.AbstractC2236H
    /* synthetic */ String getParameter(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ Iterator getParameterNames();

    void removeChargingCollectionFunctionAddress(String str);

    void removeEventChargingFunctionAddress(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ void removeParameter(String str);

    void setChargingCollectionFunctionAddress(String str);

    void setEventChargingFunctionAddress(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ void setParameter(String str, String str2);
}
