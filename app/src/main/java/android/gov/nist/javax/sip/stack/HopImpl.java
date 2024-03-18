package android.gov.nist.javax.sip.stack;

import R.a;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.SIPConstants;
import b.AbstractC2092b;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class HopImpl implements AbstractC2092b, Serializable {
    protected boolean defaultRoute;
    protected String host;
    protected int port;
    protected String transport;
    protected boolean uriRoute;

    public HopImpl(String str, int i10, String str2) {
        this.host = str;
        if (str.indexOf(":") >= 0 && this.host.indexOf("[") < 0) {
            this.host = a.t(new StringBuilder("["), this.host, "]");
        }
        this.port = i10;
        this.transport = str2;
    }

    @Override // b.AbstractC2092b
    public String getHost() {
        return this.host;
    }

    @Override // b.AbstractC2092b
    public int getPort() {
        return this.port;
    }

    @Override // b.AbstractC2092b
    public String getTransport() {
        return this.transport;
    }

    public boolean isURIRoute() {
        return this.uriRoute;
    }

    public void setURIRouteFlag() {
        this.uriRoute = true;
    }

    @Override // b.AbstractC2092b
    public String toString() {
        return this.host + ":" + this.port + Separators.SLASH + this.transport;
    }

    public HopImpl(String str) {
        String str2;
        if (str != null) {
            int indexOf = str.indexOf(93);
            int indexOf2 = str.indexOf(58, indexOf);
            int indexOf3 = str.indexOf(47, indexOf2);
            if (indexOf2 > 0) {
                this.host = str.substring(0, indexOf2);
                if (indexOf3 > 0) {
                    str2 = str.substring(indexOf2 + 1, indexOf3);
                    this.transport = str.substring(indexOf3 + 1);
                } else {
                    str2 = str.substring(indexOf2 + 1);
                    this.transport = "UDP";
                }
                try {
                    this.port = Integer.parseInt(str2);
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Bad port spec");
                }
            } else {
                int i10 = SIPConstants.DEFAULT_PORT;
                if (indexOf3 > 0) {
                    this.host = str.substring(0, indexOf3);
                    String substring = str.substring(indexOf3 + 1);
                    this.transport = substring;
                    this.port = substring.equalsIgnoreCase("TLS") ? SIPConstants.DEFAULT_TLS_PORT : i10;
                } else {
                    this.host = str;
                    this.transport = "UDP";
                    this.port = SIPConstants.DEFAULT_PORT;
                }
            }
            String str3 = this.host;
            if (str3 != null && str3.length() != 0) {
                this.host = this.host.trim();
                this.transport = this.transport.trim();
                if (indexOf > 0 && this.host.charAt(0) != '[') {
                    throw new IllegalArgumentException("Bad IPv6 reference spec");
                }
                return;
            }
            throw new IllegalArgumentException("no host!");
        }
        throw new IllegalArgumentException("Null arg!");
    }
}
