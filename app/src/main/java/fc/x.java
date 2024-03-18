package fc;

import E.g0;
import F.AbstractC0539m;
import G0.X;
import W.I2;
import Z.AbstractC1725n;
import Z.C1723m;
import com.openai.chatgpt.R;
import hc.J;
import hc.L;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4323o;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.o implements wf.q {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f30235Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f30236Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Tc.f fVar, int i10) {
        super(5);
        this.f30235Y = i10;
        this.f30236Z = fVar;
    }

    @Override // wf.q
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Integer num) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        jf.y yVar = jf.y.f36177a;
        C4323o c4323o = C4323o.f37719b;
        int i16 = this.f30235Y;
        Tc.f fVar = this.f30236Z;
        int i17 = 2;
        switch (i16) {
            case 0:
                g0 g0Var = (g0) obj;
                y yVar2 = (y) obj2;
                wf.k kVar = (wf.k) obj3;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj4;
                int intValue = num.intValue();
                AbstractC3557B.c0("paddings", g0Var);
                AbstractC3557B.c0("state", yVar2);
                AbstractC3557B.c0("onIntent", kVar);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((intValue & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(g0Var)) {
                        i17 = 4;
                    }
                    i10 = i17 | intValue;
                } else {
                    i10 = intValue;
                }
                if ((intValue & 112) == 0) {
                    if (((Z.r) abstractC1725n).g(yVar2)) {
                        i12 = 32;
                    } else {
                        i12 = 16;
                    }
                    i10 |= i12;
                }
                if ((intValue & 896) == 0) {
                    if (((Z.r) abstractC1725n).i(kVar)) {
                        i11 = 256;
                    } else {
                        i11 = 128;
                    }
                    i10 |= i11;
                }
                if ((i10 & 5851) == 1170) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                AbstractC0539m.a(androidx.compose.foundation.layout.a.q(c4323o, g0Var).g(androidx.compose.foundation.layout.e.f24739c), null, null, false, null, null, null, false, new C6.a(fVar, yVar2, kVar, 15), abstractC1725n, 0, 254);
                return yVar;
            default:
                g0 g0Var2 = (g0) obj;
                L l10 = (L) obj2;
                wf.k kVar2 = (wf.k) obj3;
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj4;
                int intValue2 = num.intValue();
                AbstractC3557B.c0("paddings", g0Var2);
                AbstractC3557B.c0("state", l10);
                AbstractC3557B.c0("onIntent", kVar2);
                AbstractC4326r a5 = io.sentry.compose.b.a("CustomInstructionsScreen");
                if ((intValue2 & 14) == 0) {
                    if (((Z.r) abstractC1725n2).g(g0Var2)) {
                        i17 = 4;
                    }
                    i13 = i17 | intValue2;
                } else {
                    i13 = intValue2;
                }
                if ((intValue2 & 112) == 0) {
                    if (((Z.r) abstractC1725n2).g(l10)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i13 |= i15;
                }
                if ((intValue2 & 896) == 0) {
                    if (((Z.r) abstractC1725n2).i(kVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i13 |= i14;
                }
                if ((i13 & 5851) == 1170) {
                    Z.r rVar2 = (Z.r) abstractC1725n2;
                    if (rVar2.B()) {
                        rVar2.P();
                        return yVar;
                    }
                }
                AbstractC4326r a10 = AbstractC4194d.a((X) a5, androidx.compose.foundation.layout.a.q(c4323o, g0Var2));
                boolean z10 = true;
                if (!l10.f32156a) {
                    Z.r rVar3 = (Z.r) abstractC1725n2;
                    rVar3.W(-1534917790);
                    rVar3.W(-1534917719);
                    if ((i13 & 896) != 256) {
                        z10 = false;
                    }
                    Object K10 = rVar3.K();
                    if (z10 || K10 == C1723m.f22654Y) {
                        K10 = AbstractC6463a.o(21, kVar2, rVar3);
                    }
                    rVar3.t(false);
                    A7.b.x(0, 0, rVar3, a10, Ng.H.v(R.string.custom_instructions_continue, rVar3), (AbstractC6216a) K10, l10.f32157b);
                    rVar3.t(false);
                } else if (l10.f32158c && l10.f32159d == null) {
                    Z.r rVar4 = (Z.r) abstractC1725n2;
                    rVar4.W(-1534917351);
                    I2.c(a10, 0L, 0L, 0, rVar4, 0, 14);
                    rVar4.t(false);
                } else {
                    Z.r rVar5 = (Z.r) abstractC1725n2;
                    rVar5.W(-1534917257);
                    Ad.l.h(l10.f32159d, new F9.e(fVar, 29), new J(fVar, 0), new J(fVar, 1), a10, rVar5, 0, 0);
                    rVar5.t(false);
                }
                return yVar;
        }
    }
}
