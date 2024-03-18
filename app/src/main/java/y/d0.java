package y;

import id.AbstractC3557B;
import kf.AbstractC4268D;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: b  reason: collision with root package name */
    public static final d0 f50196b = new d0(new t0(null, null, null, null, false, null, 63));

    /* renamed from: a  reason: collision with root package name */
    public final t0 f50197a;

    public d0(t0 t0Var) {
        this.f50197a = t0Var;
    }

    /* renamed from: a */
    public final boolean equals(Object obj) {
        if ((obj instanceof d0) && AbstractC3557B.K(((d0) obj).f50197a, this.f50197a)) {
            return true;
        }
        return false;
    }

    public final d0 b(d0 d0Var) {
        t0 t0Var = this.f50197a;
        f0 f0Var = t0Var.f50300a;
        if (f0Var == null) {
            f0Var = d0Var.f50197a.f50300a;
        }
        q0 q0Var = t0Var.f50301b;
        if (q0Var == null) {
            q0Var = d0Var.f50197a.f50301b;
        }
        N n10 = t0Var.f50302c;
        if (n10 == null) {
            n10 = d0Var.f50197a.f50302c;
        }
        k0 k0Var = t0Var.f50303d;
        if (k0Var == null) {
            k0Var = d0Var.f50197a.f50303d;
        }
        return new d0(new t0(f0Var, q0Var, n10, k0Var, false, AbstractC4268D.e1(t0Var.f50305f, d0Var.f50197a.f50305f), 16));
    }

    /* renamed from: c */
    public final String toString() {
        String str;
        String str2;
        String str3;
        if (AbstractC3557B.K(this, f50196b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb2 = new StringBuilder("EnterTransition: \nFade - ");
        t0 t0Var = this.f50197a;
        f0 f0Var = t0Var.f50300a;
        String str4 = null;
        if (f0Var != null) {
            str = f0Var.toString();
        } else {
            str = null;
        }
        sb2.append(str);
        sb2.append(",\nSlide - ");
        q0 q0Var = t0Var.f50301b;
        if (q0Var != null) {
            str2 = q0Var.toString();
        } else {
            str2 = null;
        }
        sb2.append(str2);
        sb2.append(",\nShrink - ");
        N n10 = t0Var.f50302c;
        if (n10 != null) {
            str3 = n10.toString();
        } else {
            str3 = null;
        }
        sb2.append(str3);
        sb2.append(",\nScale - ");
        k0 k0Var = t0Var.f50303d;
        if (k0Var != null) {
            str4 = k0Var.toString();
        }
        sb2.append(str4);
        return sb2.toString();
    }

    public final int hashCode() {
        return this.f50197a.hashCode();
    }
}
