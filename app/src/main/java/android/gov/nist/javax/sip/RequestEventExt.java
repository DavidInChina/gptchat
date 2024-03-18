package android.gov.nist.javax.sip;

import android.javax.sip.b;
import android.javax.sip.k;
import android.javax.sip.m;
import d.AbstractC2561b;

/* loaded from: classes.dex */
public class RequestEventExt extends k {
    private String remoteIpAddress;
    private int remotePort;

    public RequestEventExt(Object obj, m mVar, b bVar, AbstractC2561b abstractC2561b) {
        super(obj, mVar, bVar, abstractC2561b);
    }

    public String getRemoteIpAddress() {
        return this.remoteIpAddress;
    }

    public int getRemotePort() {
        return this.remotePort;
    }

    public void setRemoteIpAddress(String str) {
        this.remoteIpAddress = str;
    }

    public void setRemotePort(int i10) {
        this.remotePort = i10;
    }
}
