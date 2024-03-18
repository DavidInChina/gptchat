package A;

import H0.AbstractC0701r0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1723m;
import androidx.compose.foundation.ScrollingLayoutElement;
import l0.AbstractC4326r;
import l0.C4323o;

/* loaded from: classes2.dex */
public final class X0 extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f135Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f136Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Z0 f137h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f138i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ B.L0 f139j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(Z0 z02, B.L0 l02, boolean z10, boolean z11, boolean z12) {
        super(3);
        this.f135Y = z10;
        this.f136Z = z11;
        this.f137h0 = z02;
        this.f138i0 = z12;
        this.f139j0 = l02;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        B.W0 w02;
        boolean z10;
        AbstractC4326r abstractC4326r;
        AbstractC4326r abstractC4326r2 = (AbstractC4326r) obj;
        ((Number) obj3).intValue();
        Z.r rVar = (Z.r) ((AbstractC1725n) obj2);
        rVar.W(1478351300);
        L0 e10 = B.G0.e(rVar);
        rVar.W(773894976);
        rVar.W(-492369756);
        Object K10 = rVar.K();
        if (K10 == C1723m.f22654Y) {
            Z.C c10 = new Z.C(AbstractC1734s.k(rVar));
            rVar.h0(c10);
            K10 = c10;
        }
        rVar.t(false);
        Ng.F f6 = ((Z.C) K10).f22442Y;
        rVar.t(false);
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = L0.l.a(c4323o, false, new T0(this.f136Z, this.f135Y, this.f138i0, this.f137h0, f6));
        B.W0 w03 = B.W0.f1213Y;
        boolean z11 = this.f135Y;
        if (z11) {
            w02 = w03;
        } else {
            w02 = B.W0.f1214Z;
        }
        Z0.l lVar = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
        boolean z12 = this.f136Z;
        boolean z13 = !z12;
        if (lVar == Z0.l.f22806Z && w02 != w03) {
            z10 = z12;
        } else {
            z10 = z13;
        }
        Z0 z02 = this.f137h0;
        B.W0 w04 = w02;
        AbstractC4326r c11 = androidx.compose.foundation.gestures.a.c(c4323o, z02, w04, e10, this.f138i0, z10, this.f139j0, z02.f153c);
        ScrollingLayoutElement scrollingLayoutElement = new ScrollingLayoutElement(z02, z12, z11);
        if (w02 == w03) {
            abstractC4326r = M.f93c;
        } else {
            abstractC4326r = M.f92b;
        }
        AbstractC4326r g10 = a5.g(abstractC4326r).g(e10.b()).g(c11).g(scrollingLayoutElement);
        rVar.t(false);
        return g10;
    }
}
