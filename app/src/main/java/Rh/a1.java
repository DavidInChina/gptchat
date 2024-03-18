package Rh;

import Qh.AbstractC1230h;
import Qh.AbstractC1235m;
import Qh.AbstractC1239q;
import Qh.C1229g;
import wh.AbstractC6242g;
import wh.AbstractC6256u;

/* loaded from: classes.dex */
public final class a1 implements c1 {

    /* renamed from: Y  reason: collision with root package name */
    public final String f15791Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f15792Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f15793h0;

    public a1(String str, String str2, String str3) {
        this.f15791Y = str.replace('/', '.');
        this.f15792Z = str2;
        this.f15793h0 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a1.class != obj.getClass()) {
            return false;
        }
        a1 a1Var = (a1) obj;
        if (this.f15791Y.equals(a1Var.f15791Y) && this.f15792Z.equals(a1Var.f15792Z) && this.f15793h0.equals(a1Var.f15793h0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15793h0.hashCode() + E9.f.v(this.f15792Z, E9.f.v(this.f15791Y, a1.class.hashCode() * 31, 31), 31);
    }

    @Override // Rh.c1
    public final boolean m() {
        return true;
    }

    @Override // Rh.c1
    public final boolean n() {
        return false;
    }

    @Override // Rh.c1
    public final yh.l1 o(p1 p1Var) {
        return p1Var.a(this.f15791Y).a();
    }

    @Override // Rh.c1
    public final AbstractC6242g p(p1 p1Var) {
        AbstractC1230h abstractC1230h;
        yh.l1 o10 = o(p1Var);
        if (o10 != null) {
            AbstractC6256u i10 = o10.i();
            String str = this.f15792Z;
            if ("<init>".equals(str)) {
                abstractC1230h = Qh.F.CONSTRUCTOR.f14964Z;
            } else if ("<clinit>".equals(str)) {
                abstractC1230h = Qh.F.TYPE_INITIALIZER.f14964Z;
            } else {
                abstractC1230h = AbstractC1235m.c(str);
            }
            Qh.N n10 = Qh.X.EQUALS_FULLY;
            String str2 = this.f15793h0;
            AbstractC6256u abstractC6256u = (AbstractC6256u) ((AbstractC1239q) i10).f(abstractC1230h.b(new C1229g(new Qh.Y(str2, n10))));
            if (!abstractC6256u.isEmpty()) {
                return (AbstractC6242g) ((AbstractC1239q) abstractC6256u).r();
            }
            throw new IllegalStateException(str + str2 + " not declared by " + o10);
        }
        throw new IllegalStateException("Could not resolve enclosing type " + this.f15791Y);
    }
}
