package W;

import A.C0051x;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import l0.AbstractC4326r;
import l0.C4323o;

/* loaded from: classes2.dex */
public final class P3 extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f19555Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f19556Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ D.l f19557h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ N3 f19558i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ float f19559j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ float f19560k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P3(boolean z10, boolean z11, D.l lVar, N3 n32, float f6, float f10) {
        super(3);
        this.f19555Y = z10;
        this.f19556Z = z11;
        this.f19557h0 = lVar;
        this.f19558i0 = n32;
        this.f19559j0 = f6;
        this.f19560k0 = f10;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC4326r abstractC4326r = (AbstractC4326r) obj;
        ((Number) obj3).intValue();
        Z.r rVar = (Z.r) ((AbstractC1725n) obj2);
        rVar.W(-891038934);
        AbstractC1710f0 h10 = Ng.H.h(this.f19555Y, this.f19556Z, this.f19557h0, this.f19558i0, this.f19559j0, this.f19560k0, rVar, 0);
        C4323o c4323o = C4323o.f37719b;
        C0051x c0051x = (C0051x) h10.getValue();
        float f6 = Z3.f19883a;
        AbstractC4326r f10 = androidx.compose.ui.draw.a.f(c4323o, new C1584m2(c0051x.f321a, 2, c0051x));
        rVar.t(false);
        return f10;
    }
}
