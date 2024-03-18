package z;

import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1724m0;
import Z.C1741v0;
import Z.o1;
import b0.C2104h;
import nf.AbstractC4828h;

/* renamed from: z.P  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6676P {

    /* renamed from: b  reason: collision with root package name */
    public final C1724m0 f51180b;

    /* renamed from: d  reason: collision with root package name */
    public final C1724m0 f51182d;

    /* renamed from: a  reason: collision with root package name */
    public final C2104h f51179a = new C2104h(new C6671K[16]);

    /* renamed from: c  reason: collision with root package name */
    public long f51181c = Long.MIN_VALUE;

    public C6676P() {
        Boolean bool = Boolean.FALSE;
        o1 o1Var = o1.f22665a;
        this.f51180b = AbstractC4828h.Z(bool, o1Var);
        this.f51182d = AbstractC4828h.Z(Boolean.TRUE, o1Var);
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-318043801);
        rVar.W(-492369756);
        Object K10 = rVar.K();
        if (K10 == C1723m.f22654Y) {
            K10 = AbstractC4828h.Z(null, o1.f22665a);
            rVar.h0(K10);
        }
        rVar.t(false);
        AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K10;
        if (((Boolean) this.f51182d.getValue()).booleanValue() || ((Boolean) this.f51180b.getValue()).booleanValue()) {
            AbstractC1734s.e(this, new C6674N(abstractC1710f0, this, null), rVar);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C6675O(this, i10, 0);
        }
    }
}
