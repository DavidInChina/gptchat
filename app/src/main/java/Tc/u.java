package Tc;

import E.g0;
import Z.AbstractC1725n;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.o implements wf.q {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ g0 f17140Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ r f17141Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f17142h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ float f17143i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.q f17144j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ wf.p f17145k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(g0 g0Var, r rVar, wf.n nVar, float f6, wf.q qVar, wf.p pVar) {
        super(5);
        this.f17140Y = g0Var;
        this.f17141Z = rVar;
        this.f17142h0 = nVar;
        this.f17143i0 = f6;
        this.f17144j0 = qVar;
        this.f17145k0 = pVar;
    }

    @Override // wf.q
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Integer num) {
        int i10;
        int i11;
        int i12;
        int i13;
        g0 g0Var = (g0) obj;
        Ad.s sVar = (Ad.s) obj2;
        wf.k kVar = (wf.k) obj3;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj4;
        int intValue = num.intValue();
        AbstractC3557B.c0("paddings", g0Var);
        AbstractC3557B.c0("state", sVar);
        AbstractC3557B.c0("onIntent", kVar);
        L0.u uVar = io.sentry.compose.b.f34309a;
        if ((intValue & 14) == 0) {
            if (((Z.r) abstractC1725n).g(g0Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | intValue;
        } else {
            i10 = intValue;
        }
        if ((intValue & 112) == 0) {
            if (((Z.r) abstractC1725n).g(sVar)) {
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
                return jf.y.f36177a;
            }
        }
        int i14 = i10 & 14;
        int i15 = i10 << 6;
        float f6 = this.f17143i0;
        wf.q qVar = this.f17144j0;
        r9.y.w(g0Var, this.f17140Y, this.f17141Z, sVar, kVar, this.f17142h0, f6, qVar, this.f17145k0, abstractC1725n, i14 | (i15 & 7168) | (i15 & 57344), 0);
        return jf.y.f36177a;
    }
}
