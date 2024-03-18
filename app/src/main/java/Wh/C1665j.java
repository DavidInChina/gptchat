package Wh;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import jh.H1;
import mf.C4648a;
import y.AbstractC6463a;

/* renamed from: Wh.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1665j {

    /* renamed from: e  reason: collision with root package name */
    public static final C1665j f21212e;

    /* renamed from: f  reason: collision with root package name */
    public static final C1665j f21213f;

    /* renamed from: g  reason: collision with root package name */
    public static final C1665j f21214g = new C1665j(false, false, null, null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21215a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f21216b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f21217c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f21218d;

    static {
        C1663h c1663h = C1663h.f21204r;
        C1663h c1663h2 = C1663h.f21205s;
        C1663h c1663h3 = C1663h.f21206t;
        C1663h c1663h4 = C1663h.f21198l;
        C1663h c1663h5 = C1663h.f21200n;
        C1663h c1663h6 = C1663h.f21199m;
        C1663h c1663h7 = C1663h.f21201o;
        C1663h c1663h8 = C1663h.f21203q;
        C1663h c1663h9 = C1663h.f21202p;
        C1663h[] c1663hArr = {c1663h, c1663h2, c1663h3, c1663h4, c1663h5, c1663h6, c1663h7, c1663h8, c1663h9};
        C1663h[] c1663hArr2 = {c1663h, c1663h2, c1663h3, c1663h4, c1663h5, c1663h6, c1663h7, c1663h8, c1663h9, C1663h.f21196j, C1663h.f21197k, C1663h.f21194h, C1663h.f21195i, C1663h.f21192f, C1663h.f21193g, C1663h.f21191e};
        C1664i c1664i = new C1664i();
        c1664i.b((C1663h[]) Arrays.copyOf(c1663hArr, 9));
        H h10 = H.TLS_1_3;
        H h11 = H.TLS_1_2;
        c1664i.e(h10, h11);
        c1664i.d();
        f21212e = c1664i.a();
        C1664i c1664i2 = new C1664i();
        c1664i2.b((C1663h[]) Arrays.copyOf(c1663hArr2, 16));
        c1664i2.e(h10, h11);
        c1664i2.d();
        f21213f = c1664i2.a();
        C1664i c1664i3 = new C1664i();
        c1664i3.b((C1663h[]) Arrays.copyOf(c1663hArr2, 16));
        c1664i3.e(h10, h11, H.TLS_1_1, H.TLS_1_0);
        c1664i3.d();
        c1664i3.a();
    }

    public C1665j(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f21215a = z10;
        this.f21216b = z11;
        this.f21217c = strArr;
        this.f21218d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f21217c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(C1663h.f21188b.h(str));
            }
            return kf.t.K2(arrayList);
        }
        return null;
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f21215a) {
            return false;
        }
        String[] strArr = this.f21218d;
        if (strArr != null && !Xh.b.j(strArr, sSLSocket.getEnabledProtocols(), C4648a.f39277Y)) {
            return false;
        }
        String[] strArr2 = this.f21217c;
        if (strArr2 != null && !Xh.b.j(strArr2, sSLSocket.getEnabledCipherSuites(), C1663h.f21189c)) {
            return false;
        }
        return true;
    }

    public final List c() {
        String[] strArr = this.f21218d;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(H1.m(str));
            }
            return kf.t.K2(arrayList);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1665j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C1665j c1665j = (C1665j) obj;
        boolean z10 = c1665j.f21215a;
        boolean z11 = this.f21215a;
        if (z11 != z10) {
            return false;
        }
        if (z11 && (!Arrays.equals(this.f21217c, c1665j.f21217c) || !Arrays.equals(this.f21218d, c1665j.f21218d) || this.f21216b != c1665j.f21216b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        if (this.f21215a) {
            int i11 = 0;
            String[] strArr = this.f21217c;
            if (strArr != null) {
                i10 = Arrays.hashCode(strArr);
            } else {
                i10 = 0;
            }
            int i12 = (527 + i10) * 31;
            String[] strArr2 = this.f21218d;
            if (strArr2 != null) {
                i11 = Arrays.hashCode(strArr2);
            }
            return ((i12 + i11) * 31) + (!this.f21216b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.f21215a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb2 = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb2.append(Objects.toString(a(), "[all enabled]"));
        sb2.append(", tlsVersions=");
        sb2.append(Objects.toString(c(), "[all enabled]"));
        sb2.append(", supportsTlsExtensions=");
        return AbstractC6463a.l(sb2, this.f21216b, ')');
    }
}
