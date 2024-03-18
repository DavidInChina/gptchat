package ei;

import Wh.x;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class j extends m {

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f29506c;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r0.intValue() >= 9) goto L12;
     */
    static {
        Integer num;
        String property = System.getProperty("java.specification.version");
        if (property != null) {
            num = Lg.m.W1(property);
        } else {
            num = null;
        }
        boolean z10 = true;
        if (num == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            } catch (NoSuchMethodException unused) {
                z10 = false;
                f29506c = z10;
            }
        }
        f29506c = z10;
    }

    @Override // ei.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC3557B.c0("protocols", list);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((x) obj) != x.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x) it.next()).f21330Y);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // ei.m
    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (AbstractC3557B.K(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
