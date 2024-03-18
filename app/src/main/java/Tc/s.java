package Tc;

import E.g0;
import Z.AbstractC1725n;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ g0 f17122Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ r f17123Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f17124h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ float f17125i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.o f17126j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ wf.n f17127k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(g0 g0Var, r rVar, wf.n nVar, float f6, wf.o oVar, wf.n nVar2) {
        super(3);
        this.f17122Y = g0Var;
        this.f17123Z = rVar;
        this.f17124h0 = nVar;
        this.f17125i0 = f6;
        this.f17126j0 = oVar;
        this.f17127k0 = nVar2;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        g0 g0Var = (g0) obj;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3557B.c0("paddings", g0Var);
        L0.u uVar = io.sentry.compose.b.f34309a;
        if ((intValue & 14) == 0) {
            if (((Z.r) abstractC1725n).g(g0Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            intValue |= i10;
        }
        if ((intValue & 91) == 18) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        float f6 = this.f17125i0;
        r9.y.O(g0Var, this.f17122Y, this.f17123Z, this.f17124h0, f6, this.f17126j0, this.f17127k0, abstractC1725n, intValue & 14, 0);
        return jf.y.f36177a;
    }
}
