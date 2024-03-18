package Eh;

import wh.AbstractC6236a;
import wh.AbstractC6250o;
import wh.C6249n;
import yh.l1;

/* renamed from: Eh.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518q extends Hh.i implements r {

    /* renamed from: Y  reason: collision with root package name */
    public transient /* synthetic */ int f4803Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC6250o f4804Z;

    /* renamed from: h0  reason: collision with root package name */
    public final l1 f4805h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Hh.n f4806i0;

    public C0518q(AbstractC6250o abstractC6250o, l1 l1Var, Hh.n nVar) {
        this.f4804Z = abstractC6250o;
        this.f4805h0 = l1Var;
        this.f4806i0 = nVar;
    }

    public static r j(AbstractC6250o abstractC6250o, l1 l1Var) {
        Hh.n d10 = E9.f.i(abstractC6250o).d(l1Var);
        if (d10.b()) {
            return new C0518q(abstractC6250o, l1Var, d10);
        }
        return EnumC0517p.f4801Y;
    }

    @Override // Eh.r
    public final l1 a() {
        return this.f4805h0;
    }

    @Override // Eh.r
    public final AbstractC6250o c() {
        return this.f4804Z;
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        return this.f4806i0.e(lVar, abstractC0511j);
    }

    @Override // Eh.r
    public final r g(C6249n c6249n) {
        if (((AbstractC6236a) this.f4804Z).k1().equals(c6249n)) {
            return this;
        }
        return EnumC0517p.f4801Y;
    }

    /* renamed from: h */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (((AbstractC6236a) this.f4804Z).j1().equals(((AbstractC6236a) rVar.c()).j1())) {
            if (this.f4805h0.equals(rVar.a())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final int hashCode() {
        int i10;
        if (this.f4803Y != 0) {
            i10 = 0;
        } else {
            i10 = (((AbstractC6236a) this.f4804Z).j1().hashCode() * 31) + this.f4805h0.hashCode();
        }
        if (i10 == 0) {
            return this.f4803Y;
        }
        this.f4803Y = i10;
        return i10;
    }
}
