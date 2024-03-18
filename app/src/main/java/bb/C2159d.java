package bb;

import E.AbstractC0429m;
import E.AbstractC0434s;
import E.AbstractC0440y;
import E.C0421f;
import E.C0426j;
import F.AbstractC0528b;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import N.C1040y;
import W.AbstractC1607r1;
import W.I2;
import W.P0;
import W.R0;
import W.j4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import androidx.compose.foundation.layout.LayoutWeightElement;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4317i;
import l0.C4318j;
import l0.C4323o;
import p9.AbstractC5103e;
import u0.AbstractC5824b;
import y.AbstractC6463a;
import yf.AbstractC6583a;

/* renamed from: bb.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2159d extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25802Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ List f25803Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2159d(int i10, List list) {
        super(3);
        this.f25802Y = i10;
        this.f25803Z = list;
    }

    public final void a(AbstractC0528b abstractC0528b, AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f25802Y;
        float f6 = 0.0f;
        int i12 = 2;
        List<Va.c> list = this.f25803Z;
        switch (i11) {
            case 0:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                K8.d.e0(8, 2, abstractC1725n, a5, list);
                return;
            case 1:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                C0421f c0421f = AbstractC0429m.f3907a;
                C0426j g10 = AbstractC0429m.g(p9.r.f42839c);
                Z.r rVar3 = (Z.r) abstractC1725n;
                rVar3.W(-483455358);
                E0.N a10 = AbstractC0440y.a(g10, C4310b.f37705r0, rVar3);
                int i13 = -1323940314;
                rVar3.W(-1323940314);
                int i14 = rVar3.P;
                AbstractC1732q0 p10 = rVar3.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i15 = androidx.compose.ui.layout.a.i(c4323o);
                boolean z10 = rVar3.f22696a instanceof AbstractC1707e;
                if (z10) {
                    rVar3.Z();
                    if (rVar3.f22695O) {
                        rVar3.o(c0582k);
                    } else {
                        rVar3.k0();
                    }
                    U3.f.n0(rVar3, a10, C0583l.f5808f);
                    U3.f.n0(rVar3, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar3.f22695O || !AbstractC3557B.K(rVar3.K(), Integer.valueOf(i14))) {
                        AbstractC6463a.q(i14, rVar3, i14, c0581j);
                    }
                    AbstractC6463a.t(rVar3, i15, rVar3, 0, 2058660585);
                    rVar3.W(2106511372);
                    int size = list.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i16 = size - 1;
                            AbstractC4326r t10 = androidx.compose.foundation.layout.a.t(c4323o, p9.r.f42841e, f6, i12);
                            C0421f c0421f2 = AbstractC0429m.f3907a;
                            C0426j g11 = AbstractC0429m.g(p9.r.f42840d);
                            C4317i c4317i = C4310b.f37703p0;
                            rVar3.W(693286680);
                            E0.N a11 = E.p0.a(g11, c4317i, rVar3);
                            rVar3.W(i13);
                            int i17 = rVar3.P;
                            AbstractC1732q0 p11 = rVar3.p();
                            AbstractC0584m.f5811i.getClass();
                            C0582k c0582k2 = C0583l.f5804b;
                            C3288a i18 = androidx.compose.ui.layout.a.i(t10);
                            if (z10) {
                                rVar3.Z();
                                if (rVar3.f22695O) {
                                    rVar3.o(c0582k2);
                                } else {
                                    rVar3.k0();
                                }
                                C0581j c0581j2 = C0583l.f5808f;
                                U3.f.n0(rVar3, a11, c0581j2);
                                C0581j c0581j3 = C0583l.f5807e;
                                U3.f.n0(rVar3, p11, c0581j3);
                                C0581j c0581j4 = C0583l.f5809g;
                                if (rVar3.f22695O || !AbstractC3557B.K(rVar3.K(), Integer.valueOf(i17))) {
                                    AbstractC6463a.q(i17, rVar3, i17, c0581j4);
                                }
                                AbstractC6463a.t(rVar3, i18, rVar3, 0, 2058660585);
                                L0.u uVar2 = io.sentry.compose.b.f34309a;
                                C4318j c4318j = C4310b.f37697j0;
                                rVar3.W(733328855);
                                E0.N c10 = AbstractC0434s.c(c4318j, false, rVar3);
                                rVar3.W(-1323940314);
                                int i19 = rVar3.P;
                                AbstractC1732q0 p12 = rVar3.p();
                                C3288a i20 = androidx.compose.ui.layout.a.i(c4323o);
                                if (z10) {
                                    rVar3.Z();
                                    if (rVar3.f22695O) {
                                        rVar3.o(c0582k2);
                                    } else {
                                        rVar3.k0();
                                    }
                                    U3.f.n0(rVar3, c10, c0581j2);
                                    U3.f.n0(rVar3, p12, c0581j3);
                                    if (rVar3.f22695O || !AbstractC3557B.K(rVar3.K(), Integer.valueOf(i19))) {
                                        AbstractC6463a.q(i19, rVar3, i19, c0581j4);
                                    }
                                    AbstractC6463a.t(rVar3, i20, rVar3, 0, 2058660585);
                                    AbstractC4326r a12 = io.sentry.compose.b.a("<anonymous>");
                                    AbstractC5824b F10 = kotlin.jvm.internal.m.F(R.drawable.star_filled, rVar3);
                                    long j6 = AbstractC5103e.f42771b;
                                    boolean z11 = z10;
                                    AbstractC1607r1.a(F10, null, a12, j6, rVar3, 56, 4);
                                    j4.b(String.valueOf(size + 1), a12, ((P0) rVar3.m(R0.f19593a)).f19538v, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar3, 0, 0, 131066);
                                    rVar3.t(false);
                                    rVar3.t(true);
                                    rVar3.t(false);
                                    rVar3.t(false);
                                    C1040y c1040y = new C1040y(list, size, 4);
                                    if (1.0f > 0.0d) {
                                        I2.d(c1040y, new LayoutWeightElement(com.google.android.gms.internal.play_billing.N.l(1.0f, Float.MAX_VALUE), true), j6, 0L, 0, rVar3, 0, 24);
                                        AbstractC6463a.v(rVar3, false, true, false, false);
                                        if (i16 >= 0) {
                                            z10 = z11;
                                            size = i16;
                                            i13 = -1323940314;
                                            f6 = 0.0f;
                                            i12 = 2;
                                        }
                                    } else {
                                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                                    }
                                } else {
                                    R4.b.r1();
                                    throw null;
                                }
                            } else {
                                R4.b.r1();
                                throw null;
                            }
                        }
                    }
                    AbstractC6463a.v(rVar3, false, false, true, false);
                    rVar3.t(false);
                    return;
                }
                R4.b.r1();
                throw null;
            default:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar3 = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                Z.r rVar5 = (Z.r) abstractC1725n;
                rVar5.W(2106513633);
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                for (Va.c cVar : list) {
                    arrayList.add(Ng.H.v(cVar.f18499a, rVar5));
                }
                rVar5.t(false);
                j4.c(K8.d.Q0(arrayList), androidx.compose.foundation.layout.a.t(c4323o, p9.r.f42841e, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, rVar5, 0, 0, 262140);
                return;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f25802Y) {
            case 0:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
