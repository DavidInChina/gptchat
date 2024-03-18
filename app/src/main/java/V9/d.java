package v9;

import E.AbstractC0429m;
import E.p0;
import E0.AbstractC0445d;
import E0.C0458q;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.X;
import L0.l;
import L0.u;
import N0.E;
import S0.v;
import U3.f;
import W.j4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.L0;
import Z.r;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import h0.C3288a;
import id.AbstractC3557B;
import jf.y;
import k6.AbstractC4194d;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4317i;
import s9.AbstractC5594a;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class d extends o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f47407Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f47408Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ E f47409h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f47410i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AbstractC4326r abstractC4326r, long j6, E e10, long j10) {
        super(3);
        this.f47407Y = abstractC4326r;
        this.f47408Z = j6;
        this.f47409h0 = e10;
        this.f47410i0 = j10;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        String str = (String) obj;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3557B.c0("currentText", str);
        u uVar = io.sentry.compose.b.f34309a;
        if ((intValue & 14) == 0) {
            if (((r) abstractC1725n).g(str)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            intValue |= i10;
        }
        if ((intValue & 91) == 18) {
            r rVar = (r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return y.f36177a;
            }
        }
        C4317i c4317i = C4310b.f37704q0;
        r rVar2 = (r) abstractC1725n;
        rVar2.W(693286680);
        N a5 = p0.a(AbstractC0429m.f3907a, c4317i, rVar2);
        rVar2.W(-1323940314);
        int i11 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i12 = androidx.compose.ui.layout.a.i(this.f47407Y);
        if (rVar2.f22696a instanceof AbstractC1707e) {
            rVar2.Z();
            if (rVar2.f22695O) {
                rVar2.o(c0582k);
            } else {
                rVar2.k0();
            }
            f.n0(rVar2, a5, C0583l.f5808f);
            f.n0(rVar2, p10, C0583l.f5807e);
            C0581j c0581j = C0583l.f5809g;
            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i11))) {
                AbstractC6463a.q(i11, rVar2, i11, c0581j);
            }
            AbstractC6463a.r(0, i12, new L0(rVar2), rVar2, 2058660585);
            AbstractC4326r a10 = io.sentry.compose.b.a("HeroLabel");
            C0458q c0458q = AbstractC0445d.f4051a;
            X x10 = (X) a10;
            AbstractC4326r a11 = AbstractC4194d.a(x10, new WithAlignmentLineElement(c0458q));
            v vVar = AbstractC5594a.f45465a;
            int i13 = (intValue & 14) | 1572864;
            long j6 = this.f47408Z;
            E e10 = this.f47409h0;
            j4.b(str, a11, j6, 0L, null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, e10, rVar2, i13, 0, 65464);
            j4.b("\u25cf", AbstractC4194d.a(x10, l.a(new WithAlignmentLineElement(c0458q), false, c.f47406Y)), this.f47410i0, 0L, null, null, AbstractC5594a.f45466b, 0L, null, null, 0L, 0, false, 0, 0, null, e10, rVar2, 1572870, 0, 65464);
            AbstractC6463a.v(rVar2, false, true, false, false);
            return y.f36177a;
        }
        R4.b.r1();
        throw null;
    }
}
