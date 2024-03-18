package android.gov.nist.javax.sip;

import android.javax.sip.b;
import android.javax.sip.q;
import android.javax.sip.u;
import android.javax.sip.v;
import d.AbstractC2561b;
import java.security.cert.Certificate;
import java.util.List;

/* loaded from: classes.dex */
public interface TransactionExt extends u {
    List<String> extractCertIdentities();

    /* synthetic */ Object getApplicationData();

    /* synthetic */ String getBranchId();

    String getCipherSuite();

    @Override // 
    /* synthetic */ b getDialog();

    String getHost();

    Certificate[] getLocalCertificates();

    String getPeerAddress();

    Certificate[] getPeerCertificates();

    int getPeerPort();

    int getPort();

    ReleaseReferencesStrategy getReleaseReferencesStrategy();

    @Override // 
    /* synthetic */ AbstractC2561b getRequest();

    /* synthetic */ int getRetransmitTimer();

    q getSipProvider();

    @Override // 
    /* synthetic */ v getState();

    int getTimerD();

    int getTimerT2();

    int getTimerT4();

    String getTransport();

    /* synthetic */ void setApplicationData(Object obj);

    void setReleaseReferencesStrategy(ReleaseReferencesStrategy releaseReferencesStrategy);

    /* synthetic */ void setRetransmitTimer(int i10);

    void setTimerD(int i10);

    void setTimerT2(int i10);

    void setTimerT4(int i10);

    @Override // 
    /* synthetic */ void terminate();
}
