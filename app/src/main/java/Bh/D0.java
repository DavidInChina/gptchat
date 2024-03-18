package Bh;

import A.AbstractC0044t0;
import Eh.AbstractC0511j;
import Eh.AbstractC0512k;
import Eh.C0509h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC4194d;
import rh.AbstractC5496c;
import wh.AbstractC6256u;
import y.AbstractC6463a;
import yh.AbstractC6624m;
import yh.l1;
import zh.AbstractC6878f;

/* loaded from: classes2.dex */
public abstract class D0 extends R0 {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f2194y = 0;

    /* renamed from: w  reason: collision with root package name */
    public final l1 f2195w;

    /* renamed from: x  reason: collision with root package name */
    public final AbstractC6878f f2196x;

    public D0(l1 l1Var, ph.f fVar, C0245g c0245g, C0242e0 c0242e0, List list, vh.l lVar, AbstractC6256u abstractC6256u, AbstractC6256u abstractC6256u2, AbstractC6624m abstractC6624m, Eh.A a5, AbstractC0252j0 abstractC0252j0, Fh.F f6, AbstractC5496c abstractC5496c, Fh.n nVar, int i10, Gh.b bVar, AbstractC0512k abstractC0512k, int i11, AbstractC0241e abstractC0241e, Rh.l1 l1Var2, l1 l1Var3, AbstractC6878f abstractC6878f) {
        super(l1Var, fVar, c0245g, c0242e0, list, lVar, abstractC6256u, abstractC6256u2, abstractC6624m, a5, abstractC0252j0, f6, abstractC5496c, nVar, i10, bVar, abstractC0512k, i11, abstractC0241e, l1Var2);
        this.f2195w = l1Var3;
        this.f2196x = abstractC6878f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [Bh.y0] */
    /* JADX WARN: Type inference failed for: r2v11, types: [io.sentry.vendor.b] */
    @Override // Bh.R0
    public final F0 a(AbstractC0252j0 abstractC0252j0, AbstractC0258m0 abstractC0258m0) {
        C0239d c0239d;
        AbstractC5496c abstractC5496c = this.f2261m;
        try {
            int a5 = abstractC5496c.a(0);
            int c10 = abstractC5496c.c(0);
            byte[] a10 = this.f2196x.G(this.f2195w.getName()).a();
            abstractC0258m0.a(this.f2249a, true, a10);
            Nh.b a11 = Sh.I.a(a10);
            C0239d a12 = this.f2267s.a(a5, a11, this.f2268t);
            y7.b bVar = new y7.b(18, (AbstractC6463a) null);
            if (AbstractC0044t0.j(this.f2266r)) {
                c0239d = new io.sentry.vendor.b(Sh.I.f16703b, a12, 0);
            } else {
                c0239d = a12;
            }
            C0 c02 = (C0) this;
            B0 b02 = new B0(c02, c0239d, abstractC0252j0, bVar, a5, c10);
            l1 l1Var = c02.f2195w;
            String name = l1Var.getName();
            l1 l1Var2 = c02.f2249a;
            if (!name.equals(l1Var2.getName())) {
                b02 = new C0281y0(b02, new androidx.lifecycle.D(l1Var.D0(), l1Var2.D0()));
            }
            a11.a(b02, new io.sentry.android.core.z[0], c10);
            byte[] C10 = a12.C();
            C0509h c0509h = (C0509h) ((AbstractC0511j) bVar.f50831Z);
            c0509h.getClass();
            return new F0(this, C10, new ArrayList(c0509h.f4791h.values()));
        } catch (IOException e10) {
            throw new RuntimeException("The class file could not be written", e10);
        }
    }

    @Override // Bh.R0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        D0 d02 = (D0) obj;
        if (!this.f2195w.equals(d02.f2195w) || !this.f2196x.equals(d02.f2196x)) {
            return false;
        }
        return true;
    }

    @Override // Bh.R0
    public int hashCode() {
        return this.f2196x.hashCode() + AbstractC4194d.t(this.f2195w, super.hashCode() * 31, 31);
    }
}
