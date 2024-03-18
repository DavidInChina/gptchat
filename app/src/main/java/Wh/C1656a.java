package Wh;

import id.AbstractC3557B;
import j$.util.Objects;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import jh.H1;
import k6.AbstractC4194d;

/* renamed from: Wh.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1656a {

    /* renamed from: a  reason: collision with root package name */
    public final m f21158a;

    /* renamed from: b  reason: collision with root package name */
    public final SocketFactory f21159b;

    /* renamed from: c  reason: collision with root package name */
    public final SSLSocketFactory f21160c;

    /* renamed from: d  reason: collision with root package name */
    public final HostnameVerifier f21161d;

    /* renamed from: e  reason: collision with root package name */
    public final C1662g f21162e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC1657b f21163f;

    /* renamed from: g  reason: collision with root package name */
    public final Proxy f21164g;

    /* renamed from: h  reason: collision with root package name */
    public final ProxySelector f21165h;

    /* renamed from: i  reason: collision with root package name */
    public final s f21166i;

    /* renamed from: j  reason: collision with root package name */
    public final List f21167j;

    /* renamed from: k  reason: collision with root package name */
    public final List f21168k;

    public C1656a(String str, int i10, m mVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C1662g c1662g, AbstractC1657b abstractC1657b, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        AbstractC3557B.c0("uriHost", str);
        AbstractC3557B.c0("dns", mVar);
        AbstractC3557B.c0("socketFactory", socketFactory);
        AbstractC3557B.c0("proxyAuthenticator", abstractC1657b);
        AbstractC3557B.c0("protocols", list);
        AbstractC3557B.c0("connectionSpecs", list2);
        AbstractC3557B.c0("proxySelector", proxySelector);
        this.f21158a = mVar;
        this.f21159b = socketFactory;
        this.f21160c = sSLSocketFactory;
        this.f21161d = hostnameVerifier;
        this.f21162e = c1662g;
        this.f21163f = abstractC1657b;
        this.f21164g = proxy;
        this.f21165h = proxySelector;
        r rVar = new r();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (Lg.n.f2(str2, "http")) {
            rVar.f21241a = "http";
        } else if (Lg.n.f2(str2, "https")) {
            rVar.f21241a = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
        }
        char[] cArr = s.f21249j;
        String h02 = K4.J.h0(H1.t(str, 0, 0, false, 7));
        if (h02 != null) {
            rVar.f21244d = h02;
            if (1 <= i10 && i10 < 65536) {
                rVar.f21245e = i10;
                this.f21166i = rVar.b();
                this.f21167j = Xh.b.x(list);
                this.f21168k = Xh.b.x(list2);
                return;
            }
            throw new IllegalArgumentException(android.gov.nist.core.a.e("unexpected port: ", i10).toString());
        }
        throw new IllegalArgumentException("unexpected host: ".concat(str));
    }

    public final boolean a(C1656a c1656a) {
        AbstractC3557B.c0("that", c1656a);
        if (AbstractC3557B.K(this.f21158a, c1656a.f21158a) && AbstractC3557B.K(this.f21163f, c1656a.f21163f) && AbstractC3557B.K(this.f21167j, c1656a.f21167j) && AbstractC3557B.K(this.f21168k, c1656a.f21168k) && AbstractC3557B.K(this.f21165h, c1656a.f21165h) && AbstractC3557B.K(this.f21164g, c1656a.f21164g) && AbstractC3557B.K(this.f21160c, c1656a.f21160c) && AbstractC3557B.K(this.f21161d, c1656a.f21161d) && AbstractC3557B.K(this.f21162e, c1656a.f21162e) && this.f21166i.f21254e == c1656a.f21166i.f21254e) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1656a) {
            C1656a c1656a = (C1656a) obj;
            if (AbstractC3557B.K(this.f21166i, c1656a.f21166i) && a(c1656a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int v10 = E9.f.v(this.f21166i.f21257h, 527, 31);
        int hashCode = this.f21163f.hashCode();
        int s10 = AbstractC4194d.s(this.f21168k, AbstractC4194d.s(this.f21167j, (hashCode + ((this.f21158a.hashCode() + v10) * 31)) * 31, 31), 31);
        int hashCode2 = Objects.hashCode(this.f21164g);
        int hashCode3 = Objects.hashCode(this.f21160c);
        int hashCode4 = Objects.hashCode(this.f21161d);
        return Objects.hashCode(this.f21162e) + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((this.f21165h.hashCode() + s10) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Address{");
        s sVar = this.f21166i;
        sb2.append(sVar.f21253d);
        sb2.append(':');
        sb2.append(sVar.f21254e);
        sb2.append(", ");
        Proxy proxy = this.f21164g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f21165h;
        }
        return android.gov.nist.core.a.n(sb2, str, '}');
    }
}
