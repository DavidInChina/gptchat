package A;

import E0.AbstractC0461u;
import T0.C1410e;
import Z.C1724m0;
import id.AbstractC3557B;
import q0.C5252d;
import w.C6077x;

/* loaded from: classes.dex */
public final class A extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f1Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f2Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f3h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f4i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f5j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f6k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f7l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(1);
        this.f1Y = i10;
        this.f3h0 = obj;
        this.f2Z = z10;
        this.f4i0 = obj2;
        this.f5j0 = obj3;
        this.f6k0 = obj4;
        this.f7l0 = obj5;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        T0.F f6;
        AbstractC0461u abstractC0461u;
        AbstractC0461u abstractC0461u2;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f1Y;
        Object obj2 = this.f7l0;
        Object obj3 = this.f5j0;
        Object obj4 = this.f6k0;
        boolean z10 = this.f2Z;
        Object obj5 = this.f3h0;
        switch (i10) {
            case 1:
                L0.v vVar = (L0.v) obj;
                Df.v[] vVarArr = L0.t.f10472a;
                L0.u uVar = L0.r.f10457m;
                Df.v[] vVarArr2 = L0.t.f10472a;
                Df.v vVar2 = vVarArr2[6];
                uVar.a(vVar, Boolean.TRUE);
                L0.j jVar = (L0.j) vVar;
                jVar.y(L0.r.f10444F, (wf.k) obj5);
                Object obj6 = this.f4i0;
                if (z10) {
                    L0.u uVar2 = L0.r.f10461q;
                    Df.v vVar3 = vVarArr2[9];
                    uVar2.a(vVar, (L0.h) obj6);
                } else {
                    L0.u uVar3 = L0.r.f10460p;
                    Df.v vVar4 = vVarArr2[8];
                    uVar3.a(vVar, (L0.h) obj6);
                }
                wf.n nVar = (wf.n) obj3;
                if (nVar != null) {
                    jVar.y(L0.i.f10387d, new L0.a(null, nVar));
                }
                wf.k kVar = (wf.k) obj4;
                if (kVar != null) {
                    jVar.y(L0.i.f10388e, new L0.a(null, kVar));
                }
                L0.u uVar4 = L0.r.f10451g;
                Df.v vVar5 = vVarArr2[18];
                uVar4.a(vVar, (L0.b) obj2);
                return yVar;
            default:
                AbstractC0461u abstractC0461u3 = (AbstractC0461u) obj;
                L.P0 p02 = (L.P0) obj5;
                p02.f10036h = abstractC0461u3;
                L.Q0 d10 = p02.d();
                if (d10 != null) {
                    d10.f10055b = abstractC0461u3;
                }
                if (z10) {
                    L.Z a5 = p02.a();
                    L.Z z11 = L.Z.f10086Z;
                    C1724m0 c1724m0 = p02.f10043o;
                    if (a5 == z11) {
                        if (((Boolean) p02.f10040l.getValue()).booleanValue()) {
                            ((N.t0) obj3).n();
                        } else {
                            ((N.t0) obj3).k();
                        }
                        N.t0 t0Var = (N.t0) obj3;
                        p02.f10041m.setValue(Boolean.valueOf(Ng.H.t(t0Var, true)));
                        p02.f10042n.setValue(Boolean.valueOf(Ng.H.t(t0Var, false)));
                        c1724m0.setValue(Boolean.valueOf(N0.D.b(((T0.z) obj4).f16831b)));
                    } else if (p02.a() == L.Z.f10087h0) {
                        c1724m0.setValue(Boolean.valueOf(Ng.H.t((N.t0) obj3, true)));
                    }
                    T0.z zVar = (T0.z) obj4;
                    T0.s sVar = (T0.s) obj2;
                    kotlin.jvm.internal.m.E(p02, zVar, sVar);
                    L.Q0 d11 = p02.d();
                    if (d11 != null && (f6 = p02.f10033e) != null && p02.b() && (abstractC0461u = d11.f10055b) != null && abstractC0461u.i() && (abstractC0461u2 = d11.f10056c) != null) {
                        C6077x c6077x = new C6077x(16, abstractC0461u);
                        C5252d c10 = N.h0.c(abstractC0461u);
                        C5252d F10 = abstractC0461u.F(abstractC0461u2, false);
                        if (AbstractC3557B.K((T0.F) f6.f16754a.f16731b.get(), f6)) {
                            C1410e c1410e = ((T0.D) f6.f16755b).f16749l;
                            c1410e.f16776i = zVar;
                            c1410e.f16778k = sVar;
                            c1410e.f16777j = d11.f10054a;
                            c1410e.f16779l = c6077x;
                            c1410e.f16780m = c10;
                            c1410e.f16781n = F10;
                            if (c1410e.f16771d || c1410e.f16770c) {
                                c1410e.a();
                            }
                        }
                    }
                }
                return yVar;
        }
    }
}
