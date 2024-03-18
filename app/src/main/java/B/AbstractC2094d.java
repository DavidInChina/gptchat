package b;

import c.AbstractC2236H;
import java.util.Iterator;

/* renamed from: b.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface AbstractC2094d extends AbstractC2096f, AbstractC2236H {
    String getHeader(String str);

    Iterator getHeaderNames();

    String getHost();

    String getMAddrParam();

    String getMethodParam();

    int getPort();

    int getTTLParam();

    String getTransportParam();

    String getUser();

    String getUserParam();

    String getUserPassword();

    boolean hasLrParam();

    boolean isSecure();

    void setHost(String str);

    void setMAddrParam(String str);

    void setPort(int i10);

    void setSecure(boolean z10);

    void setTransportParam(String str);

    void setUser(String str);
}
