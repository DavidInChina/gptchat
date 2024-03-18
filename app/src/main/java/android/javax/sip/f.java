package android.javax.sip;

import java.util.EventObject;

/* loaded from: classes.dex */
public class f extends EventObject {
    private String m_host;
    private int m_port;
    private String m_transport;

    public f(int i10, Object obj, String str, String str2) {
        super(obj);
        this.m_host = str;
        this.m_port = i10;
        this.m_transport = str2;
    }

    public String getHost() {
        return this.m_host;
    }

    public int getPort() {
        return this.m_port;
    }

    public String getTransport() {
        return this.m_transport;
    }
}
