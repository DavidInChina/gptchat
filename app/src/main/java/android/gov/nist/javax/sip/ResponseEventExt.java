package android.gov.nist.javax.sip;

import android.javax.sip.b;
import android.javax.sip.l;
import d.AbstractC2562c;

/* loaded from: classes2.dex */
public class ResponseEventExt extends l {
    private boolean isForked;
    private boolean isRetransmission;
    private ClientTransactionExt m_originalTransaction;
    private String remoteIpAddress;
    private int remotePort;

    public ResponseEventExt(Object obj, ClientTransactionExt clientTransactionExt, b bVar, AbstractC2562c abstractC2562c) {
        super(obj, clientTransactionExt, bVar, abstractC2562c);
        this.m_originalTransaction = clientTransactionExt;
    }

    public ClientTransactionExt getOriginalTransaction() {
        return this.m_originalTransaction;
    }

    public String getRemoteIpAddress() {
        return this.remoteIpAddress;
    }

    public int getRemotePort() {
        return this.remotePort;
    }

    public boolean isForkedResponse() {
        return this.isForked;
    }

    public boolean isRetransmission() {
        return this.isRetransmission;
    }

    public void setForkedResponse(boolean z10) {
        this.isForked = z10;
    }

    public void setOriginalTransaction(ClientTransactionExt clientTransactionExt) {
        this.m_originalTransaction = clientTransactionExt;
    }

    public void setRemoteIpAddress(String str) {
        this.remoteIpAddress = str;
    }

    public void setRemotePort(int i10) {
        this.remotePort = i10;
    }

    public void setRetransmission(boolean z10) {
        this.isRetransmission = z10;
    }
}
