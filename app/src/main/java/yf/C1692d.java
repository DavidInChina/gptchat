package Yf;

import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1001j;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kg.C4294f;
import ug.C5925g;

/* renamed from: Yf.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1692d implements ug.n {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f22322f;

    /* renamed from: b  reason: collision with root package name */
    public final s3.z f22323b;

    /* renamed from: c  reason: collision with root package name */
    public final q f22324c;

    /* renamed from: d  reason: collision with root package name */
    public final v f22325d;

    /* renamed from: e  reason: collision with root package name */
    public final Ag.l f22326e;

    static {
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        f22322f = new Df.v[]{d10.g(new kotlin.jvm.internal.u(d10.b(C1692d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    }

    public C1692d(s3.z zVar, Sf.A a5, q qVar) {
        AbstractC3557B.c0("jPackage", a5);
        AbstractC3557B.c0("packageFragment", qVar);
        this.f22323b = zVar;
        this.f22324c = qVar;
        this.f22325d = new v(zVar, a5, qVar);
        Ag.u e10 = zVar.e();
        Uf.A a10 = new Uf.A(3, this);
        Ag.q qVar2 = (Ag.q) e10;
        qVar2.getClass();
        this.f22326e = new Ag.l(qVar2, a10);
    }

    @Override // ug.n
    public final Collection a(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        i(c4294f, dVar);
        ug.n[] h10 = h();
        Collection a5 = this.f22325d.a(c4294f, dVar);
        for (ug.n nVar : h10) {
            a5 = A7.b.p0(a5, nVar.a(c4294f, dVar));
        }
        if (a5 == null) {
            return kf.x.f37485Y;
        }
        return a5;
    }

    @Override // ug.n
    public final Set b() {
        ug.n[] h10 = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ug.n nVar : h10) {
            kf.s.N1(nVar.b(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f22325d.b());
        return linkedHashSet;
    }

    @Override // ug.n
    public final Set c() {
        HashSet m02 = Ad.l.m0(kf.q.P2(h()));
        if (m02 != null) {
            m02.addAll(this.f22325d.c());
            return m02;
        }
        return null;
    }

    @Override // ug.p
    public final Collection d(C5925g c5925g, wf.k kVar) {
        AbstractC3557B.c0("kindFilter", c5925g);
        AbstractC3557B.c0("nameFilter", kVar);
        ug.n[] h10 = h();
        Collection d10 = this.f22325d.d(c5925g, kVar);
        for (ug.n nVar : h10) {
            d10 = A7.b.p0(d10, nVar.d(c5925g, kVar));
        }
        if (d10 == null) {
            return kf.x.f37485Y;
        }
        return d10;
    }

    @Override // ug.p
    public final AbstractC1000i e(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        i(c4294f, dVar);
        v vVar = this.f22325d;
        vVar.getClass();
        AbstractC1000i abstractC1000i = null;
        AbstractC0997f v10 = vVar.v(c4294f, null);
        if (v10 != null) {
            return v10;
        }
        for (ug.n nVar : h()) {
            AbstractC1000i e10 = nVar.e(c4294f, dVar);
            if (e10 != null) {
                if ((e10 instanceof AbstractC1001j) && ((AbstractC1001j) e10).H()) {
                    if (abstractC1000i == null) {
                        abstractC1000i = e10;
                    }
                } else {
                    return e10;
                }
            }
        }
        return abstractC1000i;
    }

    @Override // ug.n
    public final Collection f(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        i(c4294f, dVar);
        ug.n[] h10 = h();
        this.f22325d.f(c4294f, dVar);
        Collection collection = kf.v.f37483Y;
        for (ug.n nVar : h10) {
            collection = A7.b.p0(collection, nVar.f(c4294f, dVar));
        }
        if (collection == null) {
            return kf.x.f37485Y;
        }
        return collection;
    }

    @Override // ug.n
    public final Set g() {
        ug.n[] h10 = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ug.n nVar : h10) {
            kf.s.N1(nVar.g(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f22325d.g());
        return linkedHashSet;
    }

    public final ug.n[] h() {
        return (ug.n[]) A7.b.X0(this.f22326e, f22322f[0]);
    }

    public final void i(C4294f c4294f, Tf.a aVar) {
        AbstractC3557B.c0("name", c4294f);
        r.f.V(((Xf.a) this.f22323b.f45394a).f21965n, (Tf.d) aVar, this.f22324c, c4294f);
    }

    public final String toString() {
        return "scope for " + this.f22324c;
    }
}
