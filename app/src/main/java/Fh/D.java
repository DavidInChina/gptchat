package Fh;

import Qh.AbstractC1239q;
import th.AbstractC5802j;
import th.AbstractC5806n;
import yh.G1;
import yh.l1;

/* loaded from: classes.dex */
public final class D implements F {

    /* renamed from: Y  reason: collision with root package name */
    public final int f5377Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f5378Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f5379h0;

    public D(l1 l1Var) {
        int size = l1Var.getDeclaredAnnotations().size();
        int size2 = l1Var.r0().size();
        int size3 = l1Var.o0().size();
        this.f5377Y = size;
        this.f5378Z = size2;
        this.f5379h0 = size3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [Fh.j] */
    @Override // Fh.F
    public final void a(io.sentry.vendor.b bVar, l1 l1Var, m mVar) {
        C0541b c0541b = new C0541b(new h(bVar));
        C0542c.g(c0541b, mVar, true, this.f5378Z, l1Var.r0());
        G1 o02 = l1Var.o0();
        int size = o02.size();
        int i10 = this.f5379h0;
        C0541b c0541b2 = c0541b;
        for (l1.a aVar : (G1) ((AbstractC1239q) o02).s(i10, size)) {
            i10++;
            c0541b2 = (j) aVar.k(new C0542c(c0541b2, mVar, ((i10 & 65535) << 8) | 268435456, ""));
        }
        AbstractC5806n declaredAnnotations = l1Var.getDeclaredAnnotations();
        C0541b c0541b3 = c0541b2;
        for (AbstractC5802j abstractC5802j : (AbstractC5806n) ((AbstractC1239q) declaredAnnotations).s(this.f5377Y, declaredAnnotations.size())) {
            C0541b c0541b4 = c0541b3;
            c0541b4.a(abstractC5802j, mVar);
            c0541b3 = c0541b4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D.class != obj.getClass()) {
            return false;
        }
        D d10 = (D) obj;
        if (this.f5377Y == d10.f5377Y && this.f5378Z == d10.f5378Z && this.f5379h0 == d10.f5379h0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((D.class.hashCode() * 31) + this.f5377Y) * 31) + this.f5378Z) * 31) + this.f5379h0;
    }
}
