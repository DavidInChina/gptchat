package Qf;

import Mf.n0;
import Mf.o0;
import Mf.p0;
import Mf.s0;
import Mf.t0;
import id.AbstractC3557B;
import lf.C4439d;

/* loaded from: classes2.dex */
public final class a extends t0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f14709c = new t0("package", false);

    @Override // Mf.t0
    public final Integer a(t0 t0Var) {
        AbstractC3557B.c0("visibility", t0Var);
        if (this == t0Var) {
            return 0;
        }
        C4439d c4439d = s0.f12119a;
        if (t0Var != n0.f12095c && t0Var != o0.f12096c) {
            return -1;
        }
        return 1;
    }

    @Override // Mf.t0
    public final String b() {
        return "public/*package*/";
    }

    @Override // Mf.t0
    public final t0 c() {
        return p0.f12098c;
    }
}
