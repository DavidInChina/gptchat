package Bh;

import Eh.AbstractC0511j;
import k6.AbstractC4194d;
import wh.C6244i;
import yh.l1;

/* renamed from: Bh.g0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0246g0 implements AbstractC0248h0 {

    /* renamed from: Y  reason: collision with root package name */
    public final l1 f2328Y;

    /* renamed from: Z  reason: collision with root package name */
    public final P f2329Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Fh.n f2330h0;

    public C0246g0(l1 l1Var, P p10, Fh.n nVar) {
        this.f2328Y = l1Var;
        this.f2329Z = p10;
        this.f2330h0 = nVar;
    }

    @Override // Bh.AbstractC0248h0
    public final void b(io.sentry.vendor.b bVar, AbstractC0252j0 abstractC0252j0, AbstractC0511j abstractC0511j) {
        c1 a5 = ((S) this.f2329Z).a(new C6244i(this.f2328Y));
        abstractC0252j0.h(a5);
        a5.f(bVar, abstractC0511j, this.f2330h0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0246g0 c0246g0 = (C0246g0) obj;
        if (this.f2328Y.equals(c0246g0.f2328Y) && this.f2329Z.equals(c0246g0.f2329Z) && this.f2330h0.equals(c0246g0.f2330h0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int t10 = AbstractC4194d.t(this.f2328Y, getClass().hashCode() * 31, 31);
        return this.f2330h0.hashCode() + ((this.f2329Z.hashCode() + t10) * 31);
    }
}
