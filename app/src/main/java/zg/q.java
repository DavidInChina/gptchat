package zg;

import M3.I;
import Mf.AbstractC1000i;
import Mf.G;
import fg.C3032C;
import fg.X;
import fg.e0;
import hg.AbstractC3423b;
import hg.AbstractC3428g;
import hg.C3430i;
import hg.C3431j;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kf.x;
import kg.C4290b;
import kg.C4291c;
import kg.C4294f;
import ug.C5925g;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class q extends p {

    /* renamed from: g  reason: collision with root package name */
    public final G f52079g;

    /* renamed from: h  reason: collision with root package name */
    public final String f52080h;

    /* renamed from: i  reason: collision with root package name */
    public final C4291c f52081i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(G g10, C3032C c3032c, AbstractC3428g abstractC3428g, AbstractC3423b abstractC3423b, AbstractC6864k abstractC6864k, xg.m mVar, String str, AbstractC6216a abstractC6216a) {
        super(r1, r2, r3, r4, abstractC6216a);
        AbstractC3557B.c0("packageDescriptor", g10);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        AbstractC3557B.c0("metadataVersion", abstractC3423b);
        AbstractC3557B.c0("debugName", str);
        X x10 = c3032c.f30274l0;
        AbstractC3557B.b0("getTypeTable(...)", x10);
        C3430i c3430i = new C3430i(x10);
        e0 e0Var = c3032c.f30275m0;
        AbstractC3557B.b0("getVersionRequirementTable(...)", e0Var);
        I a5 = mVar.a(g10, abstractC3428g, c3430i, C3431j.c(e0Var), abstractC3423b, abstractC6864k);
        List list = c3032c.f30271i0;
        AbstractC3557B.b0("getFunctionList(...)", list);
        List list2 = c3032c.f30272j0;
        AbstractC3557B.b0("getPropertyList(...)", list2);
        List list3 = c3032c.f30273k0;
        AbstractC3557B.b0("getTypeAliasList(...)", list3);
        this.f52079g = g10;
        this.f52080h = str;
        this.f52081i = ((Pf.I) g10).f14010j0;
    }

    @Override // ug.o, ug.p
    public final Collection d(C5925g c5925g, wf.k kVar) {
        AbstractC3557B.c0("kindFilter", c5925g);
        AbstractC3557B.c0("nameFilter", kVar);
        Tf.d dVar = Tf.d.f17211Y;
        List i10 = i(c5925g, kVar);
        Iterable<Of.c> iterable = ((xg.m) this.f52075b.f11536a).f50020k;
        ArrayList arrayList = new ArrayList();
        for (Of.c cVar : iterable) {
            kf.s.N1(cVar.a(this.f52081i), arrayList);
        }
        return kf.t.w2(arrayList, i10);
    }

    @Override // zg.p, ug.o, ug.p
    public final AbstractC1000i e(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        r.f.V(((xg.m) this.f52075b.f11536a).f50018i, dVar, this.f52079g, c4294f);
        return super.e(c4294f, dVar);
    }

    @Override // zg.p
    public final void h(ArrayList arrayList, wf.k kVar) {
        AbstractC3557B.c0("nameFilter", kVar);
    }

    @Override // zg.p
    public final C4290b l(C4294f c4294f) {
        AbstractC3557B.c0("name", c4294f);
        return new C4290b(this.f52081i, c4294f);
    }

    @Override // zg.p
    public final Set n() {
        return x.f37485Y;
    }

    @Override // zg.p
    public final Set o() {
        return x.f37485Y;
    }

    @Override // zg.p
    public final Set p() {
        return x.f37485Y;
    }

    @Override // zg.p
    public final boolean q(C4294f c4294f) {
        AbstractC3557B.c0("name", c4294f);
        if (!super.q(c4294f)) {
            Iterable<Of.c> iterable = ((xg.m) this.f52075b.f11536a).f50020k;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (Of.c cVar : iterable) {
                    if (cVar.b(this.f52081i, c4294f)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f52080h;
    }
}
