package Qf;

import Mf.k0;
import Mf.n0;
import Mf.o0;
import Mf.p0;
import Mf.s0;
import Mf.t0;
import id.AbstractC3557B;
import lf.C4439d;

/* loaded from: classes2.dex */
public final class b extends t0 {

    /* renamed from: c  reason: collision with root package name */
    public static final b f14710c = new t0("protected_and_package", true);

    @Override // Mf.t0
    public final Integer a(t0 t0Var) {
        int i10;
        AbstractC3557B.c0("visibility", t0Var);
        if (AbstractC3557B.K(this, t0Var)) {
            return 0;
        }
        if (t0Var == k0.f12092c) {
            return null;
        }
        C4439d c4439d = s0.f12119a;
        if (t0Var != n0.f12095c && t0Var != o0.f12096c) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        return Integer.valueOf(i10);
    }

    @Override // Mf.t0
    public final String b() {
        return "protected/*protected and package*/";
    }

    @Override // Mf.t0
    public final t0 c() {
        return p0.f12098c;
    }
}
