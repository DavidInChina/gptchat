package Bh;

import Eh.AbstractC0512k;
import Rh.p1;
import java.security.AccessController;
import java.util.List;
import k6.AbstractC4194d;
import rh.AbstractC5496c;
import wh.AbstractC6256u;
import yh.AbstractC6624m;
import yh.l1;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public abstract class R0 implements f1 {

    /* renamed from: u  reason: collision with root package name */
    public static final String f2247u;

    /* renamed from: v  reason: collision with root package name */
    public static final boolean f2248v;

    /* renamed from: a  reason: collision with root package name */
    public final l1 f2249a;

    /* renamed from: b  reason: collision with root package name */
    public final ph.f f2250b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC0243f f2251c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC0240d0 f2252d;

    /* renamed from: e  reason: collision with root package name */
    public final List f2253e;

    /* renamed from: f  reason: collision with root package name */
    public final vh.l f2254f;

    /* renamed from: g  reason: collision with root package name */
    public final AbstractC6256u f2255g;

    /* renamed from: h  reason: collision with root package name */
    public final AbstractC6256u f2256h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC6624m f2257i;

    /* renamed from: j  reason: collision with root package name */
    public final Eh.A f2258j;

    /* renamed from: k  reason: collision with root package name */
    public final AbstractC0252j0 f2259k;

    /* renamed from: l  reason: collision with root package name */
    public final Fh.F f2260l;

    /* renamed from: m  reason: collision with root package name */
    public final AbstractC5496c f2261m;

    /* renamed from: n  reason: collision with root package name */
    public final Fh.n f2262n;

    /* renamed from: o  reason: collision with root package name */
    public final int f2263o;

    /* renamed from: p  reason: collision with root package name */
    public final Gh.b f2264p;

    /* renamed from: q  reason: collision with root package name */
    public final AbstractC0512k f2265q;

    /* renamed from: r  reason: collision with root package name */
    public final int f2266r;

    /* renamed from: s  reason: collision with root package name */
    public final AbstractC0241e f2267s;

    /* renamed from: t  reason: collision with root package name */
    public final p1 f2268t;

    /* JADX WARN: Can't wrap try/catch for region: R(10:2|(2:18|3)|16|6|(1:8)(1:9)|10|11|12|13|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024 A[Catch: RuntimeException -> 0x0030, TryCatch #2 {RuntimeException -> 0x0030, blocks: (B:6:0x0019, B:8:0x0024, B:9:0x0029, B:10:0x002d), top: B:16:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[Catch: RuntimeException -> 0x0030, TryCatch #2 {RuntimeException -> 0x0030, blocks: (B:6:0x0019, B:8:0x0024, B:9:0x0029, B:10:0x002d), top: B:16:0x0019 }] */
    static {
        Object obj;
        boolean z10 = false;
        String str = null;
        try {
            Class.forName("java.security.AccessController", false, null);
            f2248v = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f2248v = z10;
            Uh.b bVar = new Uh.b("net.bytebuddy.dump");
            if (f2248v) {
            }
            str = (String) obj;
            f2247u = str;
        } catch (SecurityException unused2) {
            z10 = true;
            f2248v = z10;
            Uh.b bVar2 = new Uh.b("net.bytebuddy.dump");
            if (f2248v) {
            }
            str = (String) obj;
            f2247u = str;
        }
        Uh.b bVar22 = new Uh.b("net.bytebuddy.dump");
        if (f2248v) {
            obj = AccessController.doPrivileged(bVar22);
        } else {
            obj = System.getProperty("net.bytebuddy.dump");
        }
        str = (String) obj;
        f2247u = str;
    }

    public R0(l1 l1Var, ph.f fVar, C0245g c0245g, C0242e0 c0242e0, List list, vh.l lVar, AbstractC6256u abstractC6256u, AbstractC6256u abstractC6256u2, AbstractC6624m abstractC6624m, Eh.A a5, AbstractC0252j0 abstractC0252j0, Fh.F f6, AbstractC5496c abstractC5496c, Fh.n nVar, int i10, Gh.b bVar, AbstractC0512k abstractC0512k, int i11, AbstractC0241e abstractC0241e, Rh.l1 l1Var2) {
        this.f2249a = l1Var;
        this.f2250b = fVar;
        this.f2251c = c0245g;
        this.f2252d = c0242e0;
        this.f2253e = list;
        this.f2254f = lVar;
        this.f2255g = abstractC6256u;
        this.f2256h = abstractC6256u2;
        this.f2257i = abstractC6624m;
        this.f2258j = a5;
        this.f2259k = abstractC0252j0;
        this.f2260l = f6;
        this.f2261m = abstractC5496c;
        this.f2264p = bVar;
        this.f2262n = nVar;
        this.f2263o = i10;
        this.f2265q = abstractC0512k;
        this.f2266r = i11;
        this.f2267s = abstractC0241e;
        this.f2268t = l1Var2;
    }

    public abstract F0 a(AbstractC0252j0 abstractC0252j0, AbstractC0258m0 abstractC0258m0);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        R0 r02 = (R0) obj;
        if (AbstractC6708l.c(this.f2263o, r02.f2263o) && AbstractC6708l.c(this.f2266r, r02.f2266r) && this.f2249a.equals(r02.f2249a) && this.f2250b.equals(r02.f2250b) && this.f2251c.equals(r02.f2251c) && this.f2252d.equals(r02.f2252d) && this.f2253e.equals(r02.f2253e) && this.f2254f.equals(r02.f2254f) && this.f2255g.equals(r02.f2255g) && this.f2256h.equals(r02.f2256h) && this.f2257i.equals(r02.f2257i) && this.f2258j.equals(r02.f2258j) && this.f2259k.equals(r02.f2259k) && this.f2260l.equals(r02.f2260l) && this.f2261m.equals(r02.f2261m) && this.f2262n.equals(r02.f2262n) && this.f2264p.equals(r02.f2264p) && this.f2265q.equals(r02.f2265q) && this.f2267s.equals(r02.f2267s) && this.f2268t.equals(r02.f2268t)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        l1 l1Var = this.f2249a;
        int hashCode = this.f2251c.hashCode();
        int hashCode2 = this.f2252d.hashCode();
        int s10 = AbstractC4194d.s(this.f2253e, (hashCode2 + ((hashCode + ((AbstractC4194d.t(l1Var, getClass().hashCode() * 31, 31) + this.f2250b.f43205Y) * 31)) * 31)) * 31, 31);
        int hashCode3 = this.f2255g.hashCode();
        int hashCode4 = this.f2256h.hashCode();
        int hashCode5 = this.f2257i.hashCode();
        int hashCode6 = this.f2258j.hashCode();
        int hashCode7 = this.f2259k.hashCode();
        int hashCode8 = this.f2260l.hashCode();
        int hashCode9 = this.f2261m.hashCode();
        int hashCode10 = this.f2262n.hashCode();
        int d10 = AbstractC6708l.d(this.f2263o, (hashCode10 + ((hashCode9 + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((this.f2254f.hashCode() + s10) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31);
        int hashCode11 = this.f2265q.hashCode();
        int d11 = AbstractC6708l.d(this.f2266r, (hashCode11 + ((this.f2264p.hashCode() + d10) * 31)) * 31, 31);
        return this.f2268t.hashCode() + ((this.f2267s.hashCode() + d11) * 31);
    }
}
