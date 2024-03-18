package N;

import E0.AbstractC0461u;
import L.C0868q;
import L.Q0;
import N0.C1046e;
import T0.AbstractC1414i;
import T0.C1406a;
import java.util.List;
import l8.AbstractC4344b;
import q0.C5252d;
import q0.C5254f;

/* loaded from: classes.dex */
public final class q0 extends AbstractC1024h {

    /* renamed from: h  reason: collision with root package name */
    public final T0.z f12401h;

    /* renamed from: i  reason: collision with root package name */
    public final Q0 f12402i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q0(T0.z zVar, T0.s sVar, Q0 q02, x0 x0Var) {
        super(r1, zVar.f16831b, r0, sVar, x0Var);
        N0.C c10;
        C1046e c1046e = zVar.f16830a;
        if (q02 != null) {
            c10 = q02.f10054a;
        } else {
            c10 = null;
        }
        this.f12401h = zVar;
        this.f12402i = q02;
    }

    public final List n(C0868q c0868q) {
        if (N0.D.b(this.f12343f)) {
            AbstractC1414i abstractC1414i = (AbstractC1414i) c0868q.invoke(this);
            if (abstractC1414i != null) {
                return AbstractC4344b.F0(abstractC1414i);
            }
            return null;
        }
        return AbstractC4344b.G0(new C1406a("", 0), new T0.y(N0.D.e(this.f12343f), N0.D.e(this.f12343f)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o(Q0 q02, int i10) {
        C5252d c5252d;
        AbstractC0461u abstractC0461u = q02.f10055b;
        if (abstractC0461u != null) {
            AbstractC0461u abstractC0461u2 = q02.f10056c;
            if (abstractC0461u2 != null) {
                c5252d = abstractC0461u2.F(abstractC0461u, true);
            } else {
                c5252d = null;
            }
        }
        c5252d = C5252d.f43624e;
        long j6 = this.f12401h.f16831b;
        int i11 = N0.D.f12484c;
        T0.s sVar = this.f12341d;
        int b10 = sVar.b((int) (j6 & 4294967295L));
        N0.C c10 = q02.f10054a;
        C5252d c11 = c10.c(b10);
        return sVar.a(c10.m(R4.b.r(c11.f43625a, (C5254f.b(c5252d.d()) * i10) + c11.f43626b)));
    }
}
