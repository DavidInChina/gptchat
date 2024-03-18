package y;

import id.AbstractC3557B;
import kf.AbstractC4268D;

/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final e0 f50199b = new e0(new t0(null, null, null, null, false, null, 63));

    /* renamed from: c  reason: collision with root package name */
    public static final e0 f50200c = new e0(new t0(null, null, null, null, true, null, 47));

    /* renamed from: a  reason: collision with root package name */
    public final t0 f50201a;

    public e0(t0 t0Var) {
        this.f50201a = t0Var;
    }

    /* renamed from: a */
    public final boolean equals(Object obj) {
        if ((obj instanceof e0) && AbstractC3557B.K(((e0) obj).f50201a, this.f50201a)) {
            return true;
        }
        return false;
    }

    public final e0 b(e0 e0Var) {
        boolean z10;
        t0 t0Var = this.f50201a;
        f0 f0Var = t0Var.f50300a;
        if (f0Var == null) {
            f0Var = e0Var.f50201a.f50300a;
        }
        q0 q0Var = t0Var.f50301b;
        if (q0Var == null) {
            q0Var = e0Var.f50201a.f50301b;
        }
        N n10 = t0Var.f50302c;
        if (n10 == null) {
            n10 = e0Var.f50201a.f50302c;
        }
        k0 k0Var = t0Var.f50303d;
        if (k0Var == null) {
            k0Var = e0Var.f50201a.f50303d;
        }
        if (!t0Var.f50304e && !e0Var.f50201a.f50304e) {
            z10 = false;
        } else {
            z10 = true;
        }
        return new e0(new t0(f0Var, q0Var, n10, k0Var, z10, AbstractC4268D.e1(t0Var.f50305f, e0Var.f50201a.f50305f)));
    }

    /* renamed from: c */
    public final String toString() {
        String str;
        String str2;
        String str3;
        if (AbstractC3557B.K(this, f50199b)) {
            return "ExitTransition.None";
        }
        if (AbstractC3557B.K(this, f50200c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb2 = new StringBuilder("ExitTransition: \nFade - ");
        t0 t0Var = this.f50201a;
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
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(t0Var.f50304e);
        return sb2.toString();
    }

    public final int hashCode() {
        return this.f50201a.hashCode();
    }
}
