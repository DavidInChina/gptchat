package U;

import E.AbstractC0434s;
import E.q0;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.j4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.L0;
import Z.r;
import androidx.compose.foundation.layout.FillElement;
import h0.C3288a;
import id.AbstractC3557B;
import jf.y;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4318j;
import l0.C4323o;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f17331Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f17332Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f17333h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j6, n nVar) {
        super(3);
        this.f17332Z = j6;
        this.f17333h0 = nVar;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        y yVar = y.f36177a;
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f17331Y;
        Object obj4 = this.f17333h0;
        switch (i11) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 14) == 0) {
                    if (((r) abstractC1725n).h(booleanValue)) {
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
                        return yVar;
                    }
                }
                FillElement fillElement = androidx.compose.foundation.layout.e.f24739c;
                C4318j c4318j = C4310b.f37697j0;
                n nVar = (n) obj4;
                r rVar2 = (r) abstractC1725n;
                rVar2.W(733328855);
                N c10 = AbstractC0434s.c(c4318j, false, rVar2);
                rVar2.W(-1323940314);
                int i12 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i13 = androidx.compose.ui.layout.a.i(fillElement);
                if (rVar2.f22696a instanceof AbstractC1707e) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, c10, C0583l.f5808f);
                    U3.f.n0(rVar2, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i12))) {
                        AbstractC6463a.q(i12, rVar2, i12, c0581j);
                    }
                    AbstractC6463a.r(0, i13, new L0(rVar2), rVar2, 2058660585);
                    float f6 = f.f17344c;
                    float f10 = f.f17345d;
                    float f11 = (f6 + f10) * 2;
                    long j6 = this.f17332Z;
                    if (booleanValue) {
                        rVar2.W(-2035147035);
                        O.l.a(androidx.compose.foundation.layout.e.j(c4323o, f11), j6, f10, 0L, 0, rVar2, 390, 24);
                        rVar2.t(false);
                    } else {
                        rVar2.W(-2035146781);
                        f.b(nVar, j6, androidx.compose.foundation.layout.e.j(c4323o, f11), rVar2, 392);
                        rVar2.t(false);
                    }
                    AbstractC6463a.v(rVar2, false, true, false, false);
                    return yVar;
                }
                R4.b.r1();
                throw null;
            default:
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$TextButton", (q0) obj);
                AbstractC4326r a5 = io.sentry.compose.b.a("ConfirmationAlertDialog");
                if ((intValue2 & 81) == 16) {
                    r rVar3 = (r) abstractC1725n2;
                    if (rVar3.B()) {
                        rVar3.P();
                        return yVar;
                    }
                }
                j4.b((String) obj4, a5, this.f17332Z, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n2, 0, 0, 131066);
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j6, String str) {
        super(3);
        this.f17333h0 = str;
        this.f17332Z = j6;
    }
}
