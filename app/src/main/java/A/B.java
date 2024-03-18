package A;

import Z.AbstractC1710f0;
import ca.C2311c;
import id.AbstractC3557B;
import java.util.List;
import na.C4780p;
import na.D1;
import r0.C5347k;
import t0.AbstractC5646e;
import t0.AbstractC5648g;
import t0.C5643b;
import t0.C5644c;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f10Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f11h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f12i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f13j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        super(1);
        this.f9Y = i10;
        this.f11h0 = obj;
        this.f12i0 = obj2;
        this.f10Z = z10;
        this.f13j0 = obj3;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        boolean z10;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f9Y;
        boolean z11 = this.f10Z;
        Object obj2 = this.f13j0;
        Object obj3 = this.f12i0;
        Object obj4 = this.f11h0;
        switch (i10) {
            case 1:
                E0.c0 c0Var = (E0.c0) obj;
                List list = (List) obj4;
                F.A a5 = (F.A) obj3;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    F.A a10 = (F.A) list.get(i11);
                    if (a10 != a5) {
                        a10.c(c0Var, z11);
                    }
                }
                if (a5 != null) {
                    a5.c(c0Var, z11);
                }
                ((AbstractC1710f0) obj2).getValue();
                return yVar;
            case 2:
                G0.J j6 = (G0.J) ((AbstractC5646e) obj);
                j6.a();
                if (((Boolean) ((AbstractC6216a) obj2).mo122invoke()).booleanValue()) {
                    if (z11) {
                        C5644c c5644c = j6.f5596Y;
                        long c02 = c5644c.c0();
                        C5643b c5643b = c5644c.f45612Z;
                        long b10 = c5643b.b();
                        c5643b.a().h();
                        c5643b.f45609a.d(-1.0f, 1.0f, c02);
                        AbstractC5648g.e(j6, (r0.z) obj4, (C5347k) obj3);
                        c5643b.a().q();
                        c5643b.c(b10);
                    } else {
                        AbstractC5648g.e(j6, (r0.z) obj4, (C5347k) obj3);
                    }
                }
                return yVar;
            case 3:
                D1 d12 = (D1) obj;
                AbstractC3557B.c0("$this$setState", d12);
                boolean z12 = this.f10Z;
                C4780p a11 = C4780p.a(d12.f39785x, false, (Ba.c) obj4, (Ba.c) obj3, z12, false, 17);
                C2311c c2311c = (C2311c) obj2;
                if (c2311c != null) {
                    z10 = c2311c.f26386m;
                } else {
                    z10 = d12.f39756K;
                }
                return D1.e(d12, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, a11, null, false, false, false, null, false, null, z10, null, -8388609, 47);
            default:
                AbstractC3557B.c0("refiner", (Cg.i) obj);
                ((Bg.Y) obj4).k();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(List list, Bg.Q q10, Bg.Y y10, boolean z10) {
        super(1);
        this.f9Y = 4;
        this.f11h0 = y10;
        this.f12i0 = list;
        this.f13j0 = q10;
        this.f10Z = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(AbstractC6216a abstractC6216a, boolean z10, r0.z zVar, C5347k c5347k) {
        super(1);
        this.f9Y = 2;
        this.f13j0 = abstractC6216a;
        this.f10Z = z10;
        this.f11h0 = zVar;
        this.f12i0 = c5347k;
    }
}
