package ei;

import Wh.x;
import id.AbstractC3557B;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import jh.L1;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class i extends m {

    /* renamed from: h  reason: collision with root package name */
    public static final L1 f29500h = new L1(28, 0);

    /* renamed from: c  reason: collision with root package name */
    public final Method f29501c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f29502d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f29503e;

    /* renamed from: f  reason: collision with root package name */
    public final Class f29504f;

    /* renamed from: g  reason: collision with root package name */
    public final Class f29505g;

    public i(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f29501c = method;
        this.f29502d = method2;
        this.f29503e = method3;
        this.f29504f = cls;
        this.f29505g = cls2;
    }

    @Override // ei.m
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f29503e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // ei.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC3557B.c0("protocols", list);
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
        try {
            this.f29501c.invoke(null, sSLSocket, Proxy.newProxyInstance(m.class.getClassLoader(), new Class[]{this.f29504f, this.f29505g}, new h(arrayList2)));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // ei.m
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f29502d.invoke(null, sSLSocket));
            AbstractC3557B.a0("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider", invocationHandler);
            h hVar = (h) invocationHandler;
            boolean z10 = hVar.f29498b;
            if (!z10 && hVar.f29499c == null) {
                m.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                return null;
            } else if (z10) {
                return null;
            } else {
                return hVar.f29499c;
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
