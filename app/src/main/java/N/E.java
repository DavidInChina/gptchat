package N;

import E0.AbstractC0461u;
import L.AbstractC0857k0;
import L.EnumC0847f0;
import h.C3277c;
import id.AbstractC3557B;
import q0.C5251c;
import z0.C6739b;

/* loaded from: classes.dex */
public final class E extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12199Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ f0 f12200Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(f0 f0Var, int i10) {
        super(1);
        this.f12199Y = i10;
        this.f12200Z = f0Var;
    }

    public final void a(long j6) {
        r rVar;
        r rVar2;
        int i10 = this.f12199Y;
        f0 f0Var = this.f12200Z;
        switch (i10) {
            case 1:
                if (f0Var.f12315a.a().containsKey(Long.valueOf(j6))) {
                    f0Var.l();
                    f0Var.n();
                    return;
                }
                return;
            default:
                C1034s f6 = f0Var.f();
                if (f6 != null && (rVar2 = f6.f12408a) != null && j6 == rVar2.f12405c) {
                    f0Var.f12328n.setValue(null);
                }
                C1034s f10 = f0Var.f();
                if (f10 != null && (rVar = f10.f12409b) != null && j6 == rVar.f12405c) {
                    f0Var.f12329o.setValue(null);
                }
                if (f0Var.f12315a.a().containsKey(Long.valueOf(j6))) {
                    f0Var.n();
                    return;
                }
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        C5251c c5251c;
        boolean z10;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f12199Y;
        f0 f0Var = this.f12200Z;
        switch (i10) {
            case 0:
                Z.N n10 = (Z.N) obj;
                return new C3277c(5, f0Var);
            case 1:
                a(((Number) obj).longValue());
                return yVar;
            case 2:
            default:
                if (AbstractC0857k0.f10216a.c(((C6739b) obj).f51432a) == EnumC0847f0.COPY) {
                    f0Var.b();
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 3:
                a(((Number) obj).longValue());
                return yVar;
            case 4:
                AbstractC0461u abstractC0461u = (AbstractC0461u) obj;
                f0Var.f12325k = abstractC0461u;
                if (f0Var.e() && f0Var.f() != null) {
                    if (abstractC0461u != null) {
                        c5251c = new C5251c(abstractC0461u.d(C5251c.f43619b));
                    } else {
                        c5251c = null;
                    }
                    if (!AbstractC3557B.K(f0Var.f12324j, c5251c)) {
                        f0Var.f12324j = c5251c;
                        f0Var.l();
                        f0Var.n();
                    }
                }
                return yVar;
            case 5:
                p0.p pVar = (p0.p) ((p0.o) obj);
                if (!pVar.a() && f0Var.e()) {
                    f0Var.h();
                }
                f0Var.f12323i.setValue(Boolean.valueOf(pVar.a()));
                return yVar;
            case 6:
                f0Var.j(((Boolean) obj).booleanValue());
                return yVar;
        }
    }
}
