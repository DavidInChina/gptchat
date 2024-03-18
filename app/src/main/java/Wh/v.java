package Wh;

import K4.C0823k;
import com.statsig.androidsdk.ErrorBoundaryKt;
import hi.C3450c;
import i8.C3493k;
import id.AbstractC3557B;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: A  reason: collision with root package name */
    public int f21263A;

    /* renamed from: C  reason: collision with root package name */
    public C0823k f21265C;

    /* renamed from: g  reason: collision with root package name */
    public AbstractC1657b f21272g;

    /* renamed from: l  reason: collision with root package name */
    public Proxy f21277l;

    /* renamed from: m  reason: collision with root package name */
    public ProxySelector f21278m;

    /* renamed from: n  reason: collision with root package name */
    public AbstractC1657b f21279n;

    /* renamed from: o  reason: collision with root package name */
    public SocketFactory f21280o;

    /* renamed from: p  reason: collision with root package name */
    public SSLSocketFactory f21281p;

    /* renamed from: q  reason: collision with root package name */
    public X509TrustManager f21282q;

    /* renamed from: v  reason: collision with root package name */
    public A7.b f21287v;

    /* renamed from: w  reason: collision with root package name */
    public int f21288w;

    /* renamed from: a  reason: collision with root package name */
    public p2.F f21266a = new p2.F();

    /* renamed from: b  reason: collision with root package name */
    public S4.o f21267b = new S4.o(24);

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f21268c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f21269d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public C3493k f21270e = new C3493k(12, n.f21234d);

    /* renamed from: f  reason: collision with root package name */
    public boolean f21271f = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f21273h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f21274i = true;

    /* renamed from: j  reason: collision with root package name */
    public l f21275j = l.f21232b;

    /* renamed from: k  reason: collision with root package name */
    public m f21276k = m.f21233c;

    /* renamed from: r  reason: collision with root package name */
    public List f21283r = w.f21293J0;

    /* renamed from: s  reason: collision with root package name */
    public List f21284s = w.f21292I0;

    /* renamed from: t  reason: collision with root package name */
    public HostnameVerifier f21285t = C3450c.f32390a;

    /* renamed from: u  reason: collision with root package name */
    public C1662g f21286u = C1662g.f21185c;

    /* renamed from: x  reason: collision with root package name */
    public int f21289x = ErrorBoundaryKt.SAMPLING_RATE;

    /* renamed from: y  reason: collision with root package name */
    public int f21290y = ErrorBoundaryKt.SAMPLING_RATE;

    /* renamed from: z  reason: collision with root package name */
    public int f21291z = ErrorBoundaryKt.SAMPLING_RATE;

    /* renamed from: B  reason: collision with root package name */
    public long f21264B = 1024;

    public v() {
        byte[] bArr = Xh.b.f21996a;
        n nVar = AbstractC1657b.f21169a;
        this.f21272g = nVar;
        this.f21279n = nVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        AbstractC3557B.b0("getDefault()", socketFactory);
        this.f21280o = socketFactory;
    }

    public final void a(List list) {
        AbstractC3557B.c0("protocols", list);
        ArrayList M22 = kf.t.M2(list);
        x xVar = x.H2_PRIOR_KNOWLEDGE;
        if (!M22.contains(xVar) && !M22.contains(x.HTTP_1_1)) {
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + M22).toString());
        } else if (M22.contains(xVar) && M22.size() > 1) {
            throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + M22).toString());
        } else if (!M22.contains(x.HTTP_1_0)) {
            if (true ^ M22.contains(null)) {
                M22.remove(x.SPDY_3);
                if (!AbstractC3557B.K(M22, this.f21284s)) {
                    this.f21265C = null;
                }
                List unmodifiableList = Collections.unmodifiableList(M22);
                AbstractC3557B.b0("unmodifiableList(protocolsCopy)", unmodifiableList);
                this.f21284s = unmodifiableList;
                return;
            }
            throw new IllegalArgumentException("protocols must not contain null".toString());
        } else {
            throw new IllegalArgumentException(("protocols must not contain http/1.0: " + M22).toString());
        }
    }
}
