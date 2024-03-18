package p2;

import android.os.Bundle;
import c1.AbstractC2279d;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class o0 implements AbstractC5057j {

    /* renamed from: Z  reason: collision with root package name */
    public static final o0 f42211Z = new o0(x8.k0.f49573j0);

    /* renamed from: h0  reason: collision with root package name */
    public static final String f42212h0 = Integer.toString(0, 36);

    /* renamed from: Y  reason: collision with root package name */
    public final x8.N f42213Y;

    static {
        x8.L l10 = x8.N.f49523Z;
        int i10 = AbstractC5530A.f45131a;
    }

    public o0(x8.k0 k0Var) {
        this.f42213Y = x8.N.V(k0Var);
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f42212h0, AbstractC2279d.z(this.f42213Y));
        return bundle;
    }

    public final boolean b(int i10) {
        int i11 = 0;
        while (true) {
            x8.N n10 = this.f42213Y;
            if (i11 >= n10.size()) {
                return false;
            }
            n0 n0Var = (n0) n10.get(i11);
            if (n0Var.c() && n0Var.b() == i10) {
                return true;
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o0.class == obj.getClass()) {
            return this.f42213Y.equals(((o0) obj).f42213Y);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42213Y.hashCode();
    }
}
