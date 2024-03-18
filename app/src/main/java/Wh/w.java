package Wh;

import K4.C0823k;
import gi.C3274a;
import i8.C3493k;
import id.AbstractC3557B;
import ii.C3591f;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import ke.C4262a;

/* loaded from: classes2.dex */
public final class w implements Cloneable, AbstractC1659d, I {

    /* renamed from: I0  reason: collision with root package name */
    public static final List f21292I0 = Xh.b.l(x.HTTP_2, x.HTTP_1_1);

    /* renamed from: J0  reason: collision with root package name */
    public static final List f21293J0 = Xh.b.l(C1665j.f21213f, C1665j.f21214g);

    /* renamed from: A0  reason: collision with root package name */
    public final A7.b f21294A0;

    /* renamed from: B0  reason: collision with root package name */
    public final int f21295B0;

    /* renamed from: C0  reason: collision with root package name */
    public final int f21296C0;

    /* renamed from: D0  reason: collision with root package name */
    public final int f21297D0;

    /* renamed from: E0  reason: collision with root package name */
    public final int f21298E0;

    /* renamed from: F0  reason: collision with root package name */
    public final int f21299F0;

    /* renamed from: G0  reason: collision with root package name */
    public final long f21300G0;

    /* renamed from: H0  reason: collision with root package name */
    public final C0823k f21301H0;

    /* renamed from: Y  reason: collision with root package name */
    public final p2.F f21302Y;

    /* renamed from: Z  reason: collision with root package name */
    public final S4.o f21303Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f21304h0;

    /* renamed from: i0  reason: collision with root package name */
    public final List f21305i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C3493k f21306j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f21307k0;

    /* renamed from: l0  reason: collision with root package name */
    public final AbstractC1657b f21308l0;

    /* renamed from: m0  reason: collision with root package name */
    public final boolean f21309m0;

    /* renamed from: n0  reason: collision with root package name */
    public final boolean f21310n0;

    /* renamed from: o0  reason: collision with root package name */
    public final l f21311o0;

    /* renamed from: p0  reason: collision with root package name */
    public final m f21312p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Proxy f21313q0;

    /* renamed from: r0  reason: collision with root package name */
    public final ProxySelector f21314r0;

    /* renamed from: s0  reason: collision with root package name */
    public final AbstractC1657b f21315s0;

    /* renamed from: t0  reason: collision with root package name */
    public final SocketFactory f21316t0;

    /* renamed from: u0  reason: collision with root package name */
    public final SSLSocketFactory f21317u0;

    /* renamed from: v0  reason: collision with root package name */
    public final X509TrustManager f21318v0;

    /* renamed from: w0  reason: collision with root package name */
    public final List f21319w0;

    /* renamed from: x0  reason: collision with root package name */
    public final List f21320x0;

    /* renamed from: y0  reason: collision with root package name */
    public final HostnameVerifier f21321y0;

    /* renamed from: z0  reason: collision with root package name */
    public final C1662g f21322z0;

    /* JADX WARN: Removed duplicated region for block: B:35:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w(v vVar) {
        ProxySelector proxySelector;
        List list;
        this.f21302Y = vVar.f21266a;
        this.f21303Z = vVar.f21267b;
        this.f21304h0 = Xh.b.x(vVar.f21268c);
        this.f21305i0 = Xh.b.x(vVar.f21269d);
        this.f21306j0 = vVar.f21270e;
        this.f21307k0 = vVar.f21271f;
        this.f21308l0 = vVar.f21272g;
        this.f21309m0 = vVar.f21273h;
        this.f21310n0 = vVar.f21274i;
        this.f21311o0 = vVar.f21275j;
        this.f21312p0 = vVar.f21276k;
        Proxy proxy = vVar.f21277l;
        this.f21313q0 = proxy;
        if (proxy != null) {
            proxySelector = C3274a.f31644a;
        } else {
            proxySelector = vVar.f21278m;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = C3274a.f31644a;
            }
        }
        this.f21314r0 = proxySelector;
        this.f21315s0 = vVar.f21279n;
        this.f21316t0 = vVar.f21280o;
        List<C1665j> list2 = vVar.f21283r;
        this.f21319w0 = list2;
        this.f21320x0 = vVar.f21284s;
        this.f21321y0 = vVar.f21285t;
        this.f21295B0 = vVar.f21288w;
        this.f21296C0 = vVar.f21289x;
        this.f21297D0 = vVar.f21290y;
        this.f21298E0 = vVar.f21291z;
        this.f21299F0 = vVar.f21263A;
        this.f21300G0 = vVar.f21264B;
        C0823k c0823k = vVar.f21265C;
        this.f21301H0 = c0823k == null ? new C0823k(2) : c0823k;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (C1665j c1665j : list2) {
                if (c1665j.f21215a) {
                    SSLSocketFactory sSLSocketFactory = vVar.f21281p;
                    if (sSLSocketFactory != null) {
                        this.f21317u0 = sSLSocketFactory;
                        A7.b bVar = vVar.f21287v;
                        AbstractC3557B.Z(bVar);
                        this.f21294A0 = bVar;
                        X509TrustManager x509TrustManager = vVar.f21282q;
                        AbstractC3557B.Z(x509TrustManager);
                        this.f21318v0 = x509TrustManager;
                        C1662g c1662g = vVar.f21286u;
                        this.f21322z0 = !AbstractC3557B.K(c1662g.f21187b, bVar) ? new C1662g(c1662g.f21186a, bVar) : c1662g;
                    } else {
                        ei.m mVar = ei.m.f29511a;
                        X509TrustManager n10 = ei.m.f29511a.n();
                        this.f21318v0 = n10;
                        this.f21317u0 = ei.m.f29511a.m(n10);
                        A7.b b10 = ei.m.f29511a.b(n10);
                        this.f21294A0 = b10;
                        C1662g c1662g2 = vVar.f21286u;
                        this.f21322z0 = !AbstractC3557B.K(c1662g2.f21187b, b10) ? new C1662g(c1662g2.f21186a, b10) : c1662g2;
                    }
                    list = this.f21304h0;
                    AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>", list);
                    if (!(!list.contains(null))) {
                        List list3 = this.f21305i0;
                        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>", list3);
                        if (!list3.contains(null)) {
                            List<C1665j> list4 = this.f21319w0;
                            boolean z10 = list4 instanceof Collection;
                            X509TrustManager x509TrustManager2 = this.f21318v0;
                            A7.b bVar2 = this.f21294A0;
                            SSLSocketFactory sSLSocketFactory2 = this.f21317u0;
                            if (!z10 || !list4.isEmpty()) {
                                for (C1665j c1665j2 : list4) {
                                    if (c1665j2.f21215a) {
                                        if (sSLSocketFactory2 == null) {
                                            throw new IllegalStateException("sslSocketFactory == null".toString());
                                        }
                                        if (bVar2 == null) {
                                            throw new IllegalStateException("certificateChainCleaner == null".toString());
                                        }
                                        if (x509TrustManager2 == null) {
                                            throw new IllegalStateException("x509TrustManager == null".toString());
                                        }
                                        return;
                                    }
                                }
                            }
                            if (sSLSocketFactory2 != null) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                            if (bVar2 != null) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                            if (x509TrustManager2 == null) {
                                if (!AbstractC3557B.K(this.f21322z0, C1662g.f21185c)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                return;
                            }
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    throw new IllegalStateException(("Null interceptor: " + list).toString());
                }
            }
        }
        this.f21317u0 = null;
        this.f21294A0 = null;
        this.f21318v0 = null;
        this.f21322z0 = C1662g.f21185c;
        list = this.f21304h0;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>", list);
        if (!(!list.contains(null))) {
        }
    }

    public final v a() {
        v vVar = new v();
        vVar.f21266a = this.f21302Y;
        vVar.f21267b = this.f21303Z;
        kf.s.N1(this.f21304h0, vVar.f21268c);
        kf.s.N1(this.f21305i0, vVar.f21269d);
        vVar.f21270e = this.f21306j0;
        vVar.f21271f = this.f21307k0;
        vVar.f21272g = this.f21308l0;
        vVar.f21273h = this.f21309m0;
        vVar.f21274i = this.f21310n0;
        vVar.f21275j = this.f21311o0;
        vVar.f21276k = this.f21312p0;
        vVar.f21277l = this.f21313q0;
        vVar.f21278m = this.f21314r0;
        vVar.f21279n = this.f21315s0;
        vVar.f21280o = this.f21316t0;
        vVar.f21281p = this.f21317u0;
        vVar.f21282q = this.f21318v0;
        vVar.f21283r = this.f21319w0;
        vVar.f21284s = this.f21320x0;
        vVar.f21285t = this.f21321y0;
        vVar.f21286u = this.f21322z0;
        vVar.f21287v = this.f21294A0;
        vVar.f21288w = this.f21295B0;
        vVar.f21289x = this.f21296C0;
        vVar.f21290y = this.f21297D0;
        vVar.f21291z = this.f21298E0;
        vVar.f21263A = this.f21299F0;
        vVar.f21264B = this.f21300G0;
        vVar.f21265C = this.f21301H0;
        return vVar;
    }

    public final ai.j b(z zVar) {
        AbstractC3557B.c0("request", zVar);
        return new ai.j(this, zVar, false);
    }

    public final C3591f c(z zVar, K k10) {
        AbstractC3557B.c0("request", zVar);
        AbstractC3557B.c0("listener", k10);
        C3591f c3591f = new C3591f(Zh.f.f23776i, zVar, k10, new Random(), this.f21299F0, this.f21300G0);
        z zVar2 = c3591f.f33268a;
        if (zVar2.f21338c.r("Sec-WebSocket-Extensions") != null) {
            c3591f.c(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
        } else {
            v a5 = a();
            a5.f21270e = new C3493k(12, n.f21234d);
            a5.a(C3591f.f33267x);
            w wVar = new w(a5);
            y b10 = zVar2.b();
            b10.d("Upgrade", "websocket");
            b10.d("Connection", "Upgrade");
            b10.d("Sec-WebSocket-Key", c3591f.f33274g);
            b10.d("Sec-WebSocket-Version", "13");
            b10.d("Sec-WebSocket-Extensions", "permessage-deflate");
            z b11 = b10.b();
            ai.j jVar = new ai.j(wVar, b11, true);
            c3591f.f33275h = jVar;
            jVar.e(new C4262a(c3591f, b11));
        }
        return c3591f;
    }

    public final Object clone() {
        return super.clone();
    }

    public w() {
        this(new v());
    }
}
