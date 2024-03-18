package Eh;

import Bh.AbstractC0265q;
import wh.AbstractC6250o;
import yh.l1;

/* renamed from: Eh.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0503b extends AbstractC0506e implements Hh.b {

    /* renamed from: h0  reason: collision with root package name */
    public final Hh.n f4765h0;

    /* renamed from: i0  reason: collision with root package name */
    public final l1 f4766i0;

    public C0503b(Hh.n nVar, l1 l1Var) {
        this.f4765h0 = nVar;
        this.f4766i0 = l1Var;
    }

    @Override // Hh.b
    public final Hh.a a(Nh.l lVar, AbstractC0511j abstractC0511j, AbstractC6250o abstractC6250o) {
        return f(lVar, abstractC0511j, abstractC6250o, this.f4766i0.w0(), this.f4765h0);
    }

    @Override // Eh.AbstractC0506e
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C0503b.class != obj.getClass()) {
            return false;
        }
        C0503b c0503b = (C0503b) obj;
        if (!this.f4765h0.equals(c0503b.f4765h0) || !this.f4766i0.equals(c0503b.f4766i0)) {
            return false;
        }
        return true;
    }

    @Override // Eh.AbstractC0506e
    public final int hashCode() {
        int hashCode = this.f4765h0.hashCode();
        return this.f4766i0.hashCode() + ((hashCode + (super.hashCode() * 31)) * 31);
    }

    @Override // Eh.AbstractC0523w
    public final Hh.b c(Dh.n nVar) {
        return this;
    }

    @Override // Bh.AbstractC0261o
    public final AbstractC0265q e(AbstractC0265q abstractC0265q) {
        return abstractC0265q;
    }
}
