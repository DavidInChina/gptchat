package android.gov.nist.javax.sip.header;

import c.g0;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface ViaHeaderExt extends g0 {
    @Override // c.AbstractC2268x
    /* synthetic */ Object clone();

    /* synthetic */ String getBranch();

    @Override // 
    /* synthetic */ String getHost();

    /* synthetic */ String getMAddr();

    /* synthetic */ String getName();

    @Override // c.AbstractC2236H
    /* synthetic */ String getParameter(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ Iterator getParameterNames();

    @Override // 
    /* synthetic */ int getPort();

    @Override // 
    /* synthetic */ String getProtocol();

    /* synthetic */ int getRPort();

    /* synthetic */ String getReceived();

    String getSentByField();

    String getSentProtocolField();

    /* synthetic */ int getTTL();

    @Override // 
    /* synthetic */ String getTransport();

    @Override // c.AbstractC2236H
    /* synthetic */ void removeParameter(String str);

    /* synthetic */ void setBranch(String str);

    @Override // 
    /* synthetic */ void setHost(String str);

    /* synthetic */ void setMAddr(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ void setParameter(String str, String str2);

    @Override // 
    /* synthetic */ void setPort(int i10);

    /* synthetic */ void setProtocol(String str);

    /* synthetic */ void setRPort();

    /* synthetic */ void setReceived(String str);

    /* synthetic */ void setTTL(int i10);

    @Override // 
    /* synthetic */ void setTransport(String str);
}
