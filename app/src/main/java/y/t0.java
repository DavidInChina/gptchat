package y;

import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final f0 f50300a;

    /* renamed from: b  reason: collision with root package name */
    public final q0 f50301b;

    /* renamed from: c  reason: collision with root package name */
    public final N f50302c;

    /* renamed from: d  reason: collision with root package name */
    public final k0 f50303d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f50304e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f50305f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [kf.w] */
    public /* synthetic */ t0(f0 f0Var, q0 q0Var, N n10, k0 k0Var, boolean z10, LinkedHashMap linkedHashMap, int i10) {
        this((i10 & 1) != 0 ? null : f0Var, (i10 & 2) != 0 ? null : q0Var, (i10 & 4) != 0 ? null : n10, (i10 & 8) == 0 ? k0Var : null, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? kf.w.f37484Y : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (AbstractC3557B.K(this.f50300a, t0Var.f50300a) && AbstractC3557B.K(this.f50301b, t0Var.f50301b) && AbstractC3557B.K(this.f50302c, t0Var.f50302c) && AbstractC3557B.K(this.f50303d, t0Var.f50303d) && this.f50304e == t0Var.f50304e && AbstractC3557B.K(this.f50305f, t0Var.f50305f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        f0 f0Var = this.f50300a;
        if (f0Var == null) {
            i10 = 0;
        } else {
            i10 = f0Var.hashCode();
        }
        int i15 = i10 * 31;
        q0 q0Var = this.f50301b;
        if (q0Var == null) {
            i11 = 0;
        } else {
            i11 = q0Var.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        N n10 = this.f50302c;
        if (n10 == null) {
            i12 = 0;
        } else {
            i12 = n10.hashCode();
        }
        int i17 = (i16 + i12) * 31;
        k0 k0Var = this.f50303d;
        if (k0Var != null) {
            i14 = k0Var.hashCode();
        }
        int i18 = (i17 + i14) * 31;
        if (this.f50304e) {
            i13 = 1231;
        } else {
            i13 = 1237;
        }
        return this.f50305f.hashCode() + ((i18 + i13) * 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f50300a + ", slide=" + this.f50301b + ", changeSize=" + this.f50302c + ", scale=" + this.f50303d + ", hold=" + this.f50304e + ", effectsMap=" + this.f50305f + ')';
    }

    public t0(f0 f0Var, q0 q0Var, N n10, k0 k0Var, boolean z10, Map map) {
        this.f50300a = f0Var;
        this.f50301b = q0Var;
        this.f50302c = n10;
        this.f50303d = k0Var;
        this.f50304e = z10;
        this.f50305f = map;
    }
}
