package Q8;

import E.AbstractC0429m;
import E.AbstractC0440y;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import L0.u;
import W.AbstractC1607r1;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.L0;
import Z.r;
import h0.C3288a;
import id.AbstractC3557B;
import jf.y;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4316h;
import l0.C4323o;
import u0.AbstractC5824b;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14491Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f14492Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f14493h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i10, String str) {
        super(2);
        this.f14491Y = 1;
        this.f14492Z = i10;
        this.f14493h0 = str;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f14491Y;
        String str = this.f14493h0;
        int i12 = this.f14492Z;
        switch (i11) {
            case 0:
                A7.b.D(AbstractC1734s.p(i12 | 1), abstractC1725n, str);
                return;
            case 1:
                C4323o c4323o = C4323o.f37719b;
                u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                C4316h c4316h = C4310b.f37706s0;
                r rVar2 = (r) abstractC1725n;
                rVar2.W(-483455358);
                N a5 = AbstractC0440y.a(AbstractC0429m.f3909c, c4316h, rVar2);
                rVar2.W(-1323940314);
                int i13 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i14 = androidx.compose.ui.layout.a.i(c4323o);
                if (rVar2.f22696a instanceof AbstractC1707e) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, a5, C0583l.f5808f);
                    U3.f.n0(rVar2, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i13))) {
                        AbstractC6463a.q(i13, rVar2, i13, c0581j);
                    }
                    AbstractC6463a.r(0, i14, new L0(rVar2), rVar2, 2058660585);
                    AbstractC4326r a10 = io.sentry.compose.b.a("ActionButton");
                    AbstractC5824b F10 = kotlin.jvm.internal.m.F(i12, rVar2);
                    long j6 = r0.r.f44258f;
                    String str2 = this.f14493h0;
                    AbstractC1607r1.a(F10, str2, a10, j6, rVar2, 3080, 4);
                    androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, p9.r.f42839c), rVar2);
                    j4.b(str2, a10, j6, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((p4) rVar2.m(q4.f20361a)).f20314o, rVar2, 384, 3120, 55290);
                    AbstractC6463a.v(rVar2, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
            case 2:
                L4.a.s(AbstractC1734s.p(i12 | 1), abstractC1725n, str);
                return;
            default:
                L4.a.s(AbstractC1734s.p(i12 | 1), abstractC1725n, str);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f14491Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, int i10, int i11) {
        super(2);
        this.f14491Y = i11;
        this.f14493h0 = str;
        this.f14492Z = i10;
    }
}
