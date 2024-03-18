package L;

import H0.C0705t0;
import H0.T0;
import id.AbstractC3557B;
import kf.C4288m;
import q0.C5251c;
import s3.AbstractC5568s;
import s3.C5562l;

/* loaded from: classes2.dex */
public final class J extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9973Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f9974Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f9975h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f9976i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f9977j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f9978k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(P0 p02, p0.l lVar, boolean z10, N.t0 t0Var, T0.s sVar) {
        super(1);
        this.f9973Y = 0;
        this.f9975h0 = p02;
        this.f9976i0 = lVar;
        this.f9974Z = z10;
        this.f9977j0 = t0Var;
        this.f9978k0 = sVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        T0 t02;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f9973Y;
        boolean z10 = this.f9974Z;
        Object obj2 = this.f9978k0;
        Object obj3 = this.f9977j0;
        Object obj4 = this.f9976i0;
        Object obj5 = this.f9975h0;
        switch (i10) {
            case 0:
                long j6 = ((C5251c) obj).f43623a;
                P0 p02 = (P0) obj5;
                p0.l lVar = (p0.l) obj4;
                boolean z11 = !z10;
                if (!p02.b()) {
                    lVar.a();
                } else if (z11 && (t02 = p02.f10031c) != null) {
                    T0.A a5 = ((C0705t0) t02).f7042a;
                    if (((T0.F) a5.f16731b.get()) != null) {
                        ((T0.D) a5.f16730a).a(T0.B.f16734h0);
                    }
                }
                if (p02.b()) {
                    if (p02.a() != Z.f10086Z) {
                        Q0 d10 = p02.d();
                        if (d10 != null) {
                            int a10 = ((T0.s) obj2).a(d10.b(j6, true));
                            p02.f10048t.invoke(T0.z.a(p02.f10032d.f16789a, null, U3.f.e(a10, a10), 5));
                            if (p02.f10029a.f10339a.f12512Y.length() > 0) {
                                p02.f10039k.setValue(Z.f10087h0);
                            }
                        }
                    } else {
                        ((N.t0) obj3).f(new C5251c(j6));
                    }
                }
                return yVar;
            case 1:
                C5562l c5562l = (C5562l) obj;
                AbstractC3557B.c0("entry", c5562l);
                ((kotlin.jvm.internal.x) obj5).f37645Y = true;
                ((kotlin.jvm.internal.x) obj4).f37645Y = true;
                ((AbstractC5568s) obj3).s(c5562l, z10, (C4288m) obj2);
                return yVar;
            default:
                AbstractC3557B.c0("kotlinTypeRefiner", (Cg.i) obj);
                ((Bg.Y) obj5).k();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, int i10) {
        super(1);
        this.f9973Y = i10;
        this.f9975h0 = obj;
        this.f9976i0 = obj2;
        this.f9977j0 = obj3;
        this.f9974Z = z10;
        this.f9978k0 = obj4;
    }
}
