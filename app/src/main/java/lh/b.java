package Lh;

import Eh.AbstractC0511j;
import Nh.r;
import yh.l1;

/* loaded from: classes2.dex */
public enum b implements Hh.n {
    f11156Z("VOID"),
    f11157h0("BOOLEAN"),
    f11158i0("BYTE"),
    f11159j0("SHORT"),
    f11160k0("CHARACTER"),
    f11161l0("INTEGER"),
    f11162m0("LONG"),
    f11163n0("FLOAT"),
    f11164o0("DOUBLE");
    

    /* renamed from: p0  reason: collision with root package name */
    public static final Hh.l f11165p0 = Hh.o.SINGLE.a();

    /* renamed from: Y  reason: collision with root package name */
    public final String f11167Y;

    b(String str) {
        this.f11167Y = r.k(r2);
    }

    public static Hh.n h(l1 l1Var) {
        if (!l1Var.a1()) {
            return new a(l1Var);
        }
        if (l1Var.H(Boolean.TYPE)) {
            return f11157h0;
        }
        if (l1Var.H(Byte.TYPE)) {
            return f11158i0;
        }
        if (l1Var.H(Short.TYPE)) {
            return f11159j0;
        }
        if (l1Var.H(Character.TYPE)) {
            return f11160k0;
        }
        if (l1Var.H(Integer.TYPE)) {
            return f11161l0;
        }
        if (l1Var.H(Long.TYPE)) {
            return f11162m0;
        }
        if (l1Var.H(Float.TYPE)) {
            return f11163n0;
        }
        if (l1Var.H(Double.TYPE)) {
            return f11164o0;
        }
        return f11156Z;
    }

    @Override // Hh.n
    public final boolean b() {
        return true;
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        lVar.k(this.f11167Y, 178, "TYPE", "Ljava/lang/Class;");
        return f11165p0;
    }
}
