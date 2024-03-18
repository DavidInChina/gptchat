package Xf;

import Ag.m;
import Ag.q;
import Kg.o;
import Kg.p;
import Kg.s;
import bg.AbstractC2193a;
import bg.AbstractC2196d;
import id.AbstractC3557B;
import java.util.Iterator;
import kf.t;
import kg.C4291c;
import kg.C4294f;
import l8.AbstractC4344b;
import s3.z;
import zc.C6821H;

/* loaded from: classes2.dex */
public final class d implements Nf.i {

    /* renamed from: Y  reason: collision with root package name */
    public final z f21978Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC2196d f21979Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f21980h0;

    /* renamed from: i0  reason: collision with root package name */
    public final m f21981i0;

    public d(z zVar, AbstractC2196d abstractC2196d, boolean z10) {
        AbstractC3557B.c0("c", zVar);
        AbstractC3557B.c0("annotationOwner", abstractC2196d);
        this.f21978Y = zVar;
        this.f21979Z = abstractC2196d;
        this.f21980h0 = z10;
        this.f21981i0 = ((q) ((a) zVar.f45394a).f21952a).c(new C6821H(29, this));
    }

    @Override // Nf.i
    public final boolean G(C4291c c4291c) {
        return AbstractC4344b.x0(this, c4291c);
    }

    @Override // Nf.i
    public final boolean isEmpty() {
        return this.f21979Z.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        AbstractC2196d abstractC2196d = this.f21979Z;
        s n12 = Kg.m.n1(t.V1(abstractC2196d.getAnnotations()), this.f21981i0);
        C4294f c4294f = Vf.c.f18943a;
        return new Kg.e(Kg.m.i1(p.b1(p.e1(n12, p.e1(Vf.c.a(Jf.p.f9180m, abstractC2196d, this.f21978Y)))), o.f9844i0));
    }

    @Override // Nf.i
    public final Nf.c l(C4291c c4291c) {
        Nf.c cVar;
        AbstractC3557B.c0("fqName", c4291c);
        AbstractC2196d abstractC2196d = this.f21979Z;
        AbstractC2193a l10 = abstractC2196d.l(c4291c);
        if (l10 == null || (cVar = (Nf.c) this.f21981i0.invoke(l10)) == null) {
            C4294f c4294f = Vf.c.f18943a;
            return Vf.c.a(c4291c, abstractC2196d, this.f21978Y);
        }
        return cVar;
    }
}
