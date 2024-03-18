package android.gov.nist.javax.sip.header.ims;

import c.AbstractC2236H;
import c.AbstractC2268x;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface SecurityAgreeHeader extends AbstractC2236H, AbstractC2268x {
    @Override // c.AbstractC2268x
    /* synthetic */ Object clone();

    String getAlgorithm();

    String getEncryptionAlgorithm();

    String getMode();

    /* synthetic */ String getName();

    @Override // c.AbstractC2236H
    /* synthetic */ String getParameter(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ Iterator getParameterNames();

    int getPortClient();

    int getPortServer();

    float getPreference();

    String getProtocol();

    int getSPIClient();

    int getSPIServer();

    String getSecurityMechanism();

    @Override // c.AbstractC2236H
    /* synthetic */ void removeParameter(String str);

    void setAlgorithm(String str);

    void setEncryptionAlgorithm(String str);

    void setMode(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ void setParameter(String str, String str2);

    void setPortClient(int i10);

    void setPortServer(int i10);

    void setPreference(float f6);

    void setProtocol(String str);

    void setSPIClient(int i10);

    void setSPIServer(int i10);

    void setSecurityMechanism(String str);
}
