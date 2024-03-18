package A;

import B.AbstractC0130h1;
import B.b2;
import W.I3;
import Z.AbstractC1706d0;
import kb.AbstractC4215I;
import l8.AbstractC4344b;
import q0.C5251c;
import r0.C5347k;
import t0.AbstractC5646e;
import t0.AbstractC5648g;
import t0.C5643b;
import t0.C5645d;
import z.C6694e;
import z.C6712n;
import z.C6718q;

/* renamed from: A.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0036p extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f261Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f262Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f263h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f264i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0036p(float f6, Object obj, Object obj2, int i10) {
        super(1);
        this.f261Y = i10;
        this.f262Z = f6;
        this.f263h0 = obj;
        this.f264i0 = obj2;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        long Z02;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f261Y;
        float f6 = 0.0f;
        Object obj2 = this.f263h0;
        float f10 = this.f262Z;
        Object obj3 = this.f264i0;
        switch (i10) {
            case 1:
                long longValue = ((Number) obj).longValue();
                b2 b2Var = (b2) obj2;
                if (b2Var.f1278b == Long.MIN_VALUE) {
                    b2Var.f1278b = longValue;
                }
                float f11 = b2Var.f1281e;
                C6718q c6718q = new C6718q(f11);
                int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                C6718q c6718q2 = b2.f1276f;
                if (i11 == 0) {
                    Z02 = b2Var.f1277a.f(new C6718q(f11), c6718q2, b2Var.f1279c);
                } else {
                    Z02 = AbstractC4344b.Z0(((float) (longValue - b2Var.f1278b)) / f10);
                }
                long j6 = Z02;
                float f12 = ((C6718q) b2Var.f1277a.c(j6, c6718q, c6718q2, b2Var.f1279c)).f51351a;
                b2Var.f1279c = (C6718q) b2Var.f1277a.h(j6, c6718q, c6718q2, b2Var.f1279c);
                b2Var.f1278b = longValue;
                b2Var.f1281e = f12;
                ((wf.k) obj3).invoke(Float.valueOf(b2Var.f1281e - f12));
                return yVar;
            case 2:
                C6712n c6712n = (C6712n) obj;
                if (f10 > 0.0f) {
                    f6 = com.google.android.gms.internal.play_billing.N.l(((Number) c6712n.f51333e.getValue()).floatValue(), f10);
                } else if (f10 < 0.0f) {
                    f6 = com.google.android.gms.internal.play_billing.N.j(((Number) c6712n.f51333e.getValue()).floatValue(), f10);
                }
                kotlin.jvm.internal.y yVar2 = (kotlin.jvm.internal.y) obj2;
                float f13 = f6 - yVar2.f37646Y;
                if (f13 != ((AbstractC0130h1) obj3).a(f13) || f6 != ((Number) c6712n.f51333e.getValue()).floatValue()) {
                    c6712n.a();
                }
                yVar2.f37646Y += f13;
                return yVar;
            case 3:
                G0.J j10 = (G0.J) ((AbstractC5646e) obj);
                j10.a();
                C5643b c5643b = j10.f5596Y.f45612Z;
                long b10 = c5643b.b();
                c5643b.a().h();
                C5645d c5645d = c5643b.f45609a;
                c5645d.e(f10, 0.0f);
                c5645d.c(45.0f, C5251c.f43619b);
                AbstractC5648g.e(j10, (r0.z) obj2, (C5347k) obj3);
                c5643b.a().q();
                c5643b.c(b10);
                return yVar;
            case 4:
                Z.N n10 = (Z.N) obj;
                C6694e c6694e = (C6694e) obj2;
                if (((Number) c6694e.f51232e.getValue()).floatValue() != f10) {
                    Ad.l.O0((Ng.F) obj3, null, null, new I3(c6694e, f10, null), 3);
                }
                return new Object();
            default:
                float floatValue = ((Number) obj).floatValue();
                float f14 = AbstractC4215I.f37241a;
                Z.S0 s02 = (Z.S0) ((AbstractC1706d0) obj3);
                s02.i(com.google.android.gms.internal.play_billing.N.o(s02.h() - (floatValue / f10), 0.0f, 1.0f));
                ((x9.l) obj2).f49680f.i((((s02.h() * 100.0f) / 100.0f) * 90.0f) + 10.0f);
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0036p(Object obj, float f6, Object obj2, int i10) {
        super(1);
        this.f261Y = i10;
        this.f263h0 = obj;
        this.f262Z = f6;
        this.f264i0 = obj2;
    }
}
